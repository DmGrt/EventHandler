package com.hrytsyshyn.eventhandler.model.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountDTO {
  private UUID id;
  private UUID typeId;
  private LocalDateTime creationDate;
  private LocalDateTime validTillDate;
}
