package com.hrytsyshyn.eventhandler.model.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EventParametersDTO {
  private UUID id;
  private String name;
}
