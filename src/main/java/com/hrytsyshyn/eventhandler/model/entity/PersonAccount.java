package com.hrytsyshyn.eventhandler.model.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "personAccount")
@Builder
@Data
@AllArgsConstructor
public class PersonAccount {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @Column(name = "personId")
  private UUID personId;

  @Column(name = "accountId")
  private UUID accountId;
}
