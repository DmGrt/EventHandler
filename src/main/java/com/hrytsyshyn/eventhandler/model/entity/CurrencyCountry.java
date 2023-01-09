package com.hrytsyshyn.eventhandler.model.entity;

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
@Table(name = "currencyCountry")
@Builder
@Data
@AllArgsConstructor
public class CurrencyCountry {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @JoinColumn(name = "currencyId")
  private Currency currencyId;

  @JoinColumn(name = "countryId")
  @OneToMany
  private List<Country> countries;
}
