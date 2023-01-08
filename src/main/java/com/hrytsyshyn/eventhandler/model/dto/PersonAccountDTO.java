package com.hrytsyshyn.eventhandler.model.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonAccountDTO {
  private UUID id;
  private UUID personId;
  private UUID accountId;
}
