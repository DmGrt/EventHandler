package com.hrytsyshyn.eventhandler.messaging;

import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessagePublisher {
  @Value("${servers.messaging.topic1.name}")
  private final String topicName;

  private KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {
    CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);
  }
}
