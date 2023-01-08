package com.hrytsyshyn.eventhandler.model.repository;

import com.hrytsyshyn.eventhandler.model.entity.EventParameter;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventParameterRepository extends JpaRepository<EventParameter, UUID> {}
