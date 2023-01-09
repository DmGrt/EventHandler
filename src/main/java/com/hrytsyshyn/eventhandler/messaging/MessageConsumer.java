package com.hrytsyshyn.eventhandler.messaging;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageConsumer {

  private final EventProducer eventProducer;

  @Scheduled(fixedDelay = 1000)
  public void consumeFromQueue() {
    try (Producer<String, String> producer = eventProducer.producerFactory().createProducer()) {
      producer.beginTransaction();
    }
  }
}
