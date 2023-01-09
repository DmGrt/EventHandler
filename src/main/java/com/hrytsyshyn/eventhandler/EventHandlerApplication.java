package com.hrytsyshyn.eventhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventHandlerApplication {
  public static void main(String[] args) {
    SpringApplication.run(EventHandlerApplication.class, args);
  }
}
