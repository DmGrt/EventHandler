package com.hrytsyshyn.eventhandler.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessagePublisher {
  @Value("${servers.messaging.topic1.name}")
  private final String topicName;

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Scheduled(fixedDelay = 750)
  public void sendMessage(String message) {
    kafkaTemplate.send(topicName, message);
  }
}
