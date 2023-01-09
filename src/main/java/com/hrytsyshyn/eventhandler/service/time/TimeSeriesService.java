package com.hrytsyshyn.eventhandler.service.time;

import com.hrytsyshyn.eventhandler.model.entity.Event;
import com.hrytsyshyn.eventhandler.model.entity.EventParameter;
import com.hrytsyshyn.eventhandler.service.common.EventService;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class TimeSeriesService {
  private final EventService eventService;
  private final InfluxDBConnection influxDBConnection;

  public void recordEventData(final Event event) {
    try (InfluxDBClient influxDBClient = influxDBConnection.buildConnection()) {
      final Point point =
          Point.measurement(event.getEventType().toString()).time(Instant.now(), WritePrecision.MS);
      event
          .getEventParameters()
          .forEach(
              eventParameter -> point.addField(eventParameter.getName(), eventParameter.getValue()));
      final WriteApiBlocking writeApiBlocking = influxDBClient.getWriteApiBlocking();
      writeApiBlocking.writePoint(point);
    }
  }
}
