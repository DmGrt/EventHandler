package com.hrytsyshyn.eventhandler.model.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CurrencyCountryDTO {
  private UUID id;
  private UUID currencyId;
  private UUID countryId;
}
