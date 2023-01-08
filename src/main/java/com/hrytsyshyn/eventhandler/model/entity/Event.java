package com.hrytsyshyn.eventhandler.model.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Event {

  private EventType eventType;
  private List<EventParameter> eventParameters;
}
