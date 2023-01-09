package com.hrytsyshyn.eventhandler.model.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "person")
@Builder
@Data
@AllArgsConstructor
public class Person {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private UUID id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "email")
  @Pattern(regexp = "^(.+)@(\\S+)$", message = "Email is invalid!")
  private String email;

  @Column(name = "phoneNumber")
  @Pattern(regexp = "^(\\d{3}[- .]?){2}\\d{4}$", message = "Phine number is invalid!")
  private String phoneNumber;

  @Column(name = "birthDate")
  private LocalDateTime birthDate;

  @OneToMany(mappedBy = "person")
  private List<Account> accounts;
}
