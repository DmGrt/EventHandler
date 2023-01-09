package com.hrytsyshyn.eventhandler.model.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "account")
@Builder
@Data
@AllArgsConstructor
public class Account {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @Column(name = "creationDate")
  private LocalDateTime creationDate;

  @Column(name = "validTillDate")
  private LocalDateTime validTillDate;

  @JoinColumn(name = "typeId")
  private AccountType accountType;

  @OneToMany(mappedBy = "account")
  private List<Balance> balances;
}
