package com.hrytsyshyn.eventhandler.model.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "eventParameter")
@Builder
@AllArgsConstructor
public class EventParameter {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @Column(name = "name")
  private String name;
}
