package com.hrytsyshyn.eventhandler.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "balance")
@Builder
@Data
@AllArgsConstructor
public class Balance {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @Column(name = "amount")
  private BigDecimal amount;

  @Column(name = "creationDate")
  private LocalDateTime creationDate;

  @Column(name = "validTillDate")
  private LocalDateTime validTillDate;

  @JoinColumn(name = "currencyId")
  private Currency currency;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "accountId")
  private Account account;
}
