package com.hrytsyshyn.eventhandler.model.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CurrencyDTO {
  private UUID id;
  private String name;
}
