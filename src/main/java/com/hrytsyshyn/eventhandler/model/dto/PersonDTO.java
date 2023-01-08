package com.hrytsyshyn.eventhandler.model.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonDTO {
  private UUID id;
  private String name;
  private String surname;
  private String email;
  private String phoneNumber;
  private LocalDateTime birthDate;
}
