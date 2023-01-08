package com.hrytsyshyn.eventhandler.model.repository;

import com.hrytsyshyn.eventhandler.model.entity.Account;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {}
