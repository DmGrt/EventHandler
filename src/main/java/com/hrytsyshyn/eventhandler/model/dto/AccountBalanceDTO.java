package com.hrytsyshyn.eventhandler.model.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountBalanceDTO {
  private UUID id;
  private UUID accountId;
  private UUID balanceId;
}
