package com.hrytsyshyn.eventhandler.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BalanceDTO {
  private UUID id;
  private BigDecimal amount;
  private LocalDateTime creationDate;
  private LocalDateTime validTillDate;
  private UUID currencyId;
}
