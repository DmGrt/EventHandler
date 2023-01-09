package com.hrytsyshyn.eventhandler.service.common;

import com.hrytsyshyn.eventhandler.model.entity.Event;
import com.hrytsyshyn.eventhandler.model.repository.EventParameterRepository;
import com.hrytsyshyn.eventhandler.model.repository.EventTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService extends BaseService<Event> {
    private final EventParameterRepository eventParameterRepository;
    private final EventTypeRepository eventTypeRepository;
}
