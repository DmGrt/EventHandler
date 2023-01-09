package com.hrytsyshyn.eventhandler.service.time;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InfluxDBConnection {
  @Value("${spring.influx.url}")
  private final String url;

  @Value("${management.influx.metrics.export.token}")
  private final String token;

  @Value("${management.influx.metrics.export.bucket}")
  private final String bucket;

  @Value("${management.influx.metrics.export.org}")
  private final String org;

  public InfluxDBClient buildConnection() {
    return InfluxDBClientFactory.create(url, token.toCharArray(), org, bucket);
  }
}
