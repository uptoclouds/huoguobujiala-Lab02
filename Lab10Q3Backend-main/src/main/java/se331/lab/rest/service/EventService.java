package se331.lab.rest.service;

import se331.lab.rest.entity.Event;
import se331.lab.rest.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Page<Event> getEvents(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
}