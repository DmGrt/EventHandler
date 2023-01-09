package com.hrytsyshyn.eventhandler.service.time;

import com.hrytsyshyn.eventhandler.model.entity.Event;
import com.hrytsyshyn.eventhandler.service.common.EventService;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxQLQueryApi;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.domain.InfluxQLQuery;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import com.influxdb.query.InfluxQLQueryResult;
import java.time.Instant;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeSeriesService {
  @Value("${management.influx.metrics.export.partitioning}")
  private final String partitioningRange;

  private final EventService eventService;
  private final InfluxDBConnection influxDBConnection;

  public void recordEventData(final Event event) {
    try (InfluxDBClient influxDBClient = influxDBConnection.buildConnection()) {
      final Point point =
          Point.measurement(event.getEventType().toString()).time(Instant.now(), WritePrecision.MS);
      event
          .getEventParameters()
          .forEach(
              eventParameter ->
                  point.addField(eventParameter.getName(), eventParameter.getValue()));
      final WriteApiBlocking writeApiBlocking = influxDBClient.getWriteApiBlocking();
      writeApiBlocking.writePoint(point);
    }
  }

  public InfluxQLQueryResult getStatistic(final String fieldName, final LocalDateTime fromTime) {
    try (InfluxDBClient influxDBClient = influxDBConnection.buildConnection()) {
      final InfluxQLQueryApi influxQLQueryApi = influxDBClient.getInfluxQLQueryApi();
      final InfluxQLQuery query =
          new InfluxQLQuery(
              String.format("SELECT * FROM %s WHERE %s.date > %s", fieldName, fieldName, fromTime),
              "db");
      return influxQLQueryApi.query(query);
    }
  }
}
