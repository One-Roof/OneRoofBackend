package com.example.OneRoof.service;

import com.example.OneRoof.domain.Event;
import com.example.OneRoof.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 9/5/17.
 */
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;

    @Transactional
    @Override
    public Event add(Event event) {
        return eventRepository.save(event);
    }

    @Transactional
    @Override
    public void add(List<Event> events) {
        for (Event event : events) {
            eventRepository.save(event);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Event getById(int id) {
        return getEvent(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Event> get() {
        return eventRepository.findAll();
    }

    @Transactional
    @Override
    public void update (Event event) {
        eventRepository.save(event);
    }

    @Transactional
    @Override
    public void delete(int id) {
        eventRepository.delete(id);
    }

    private Event getEvent(int id) {
        Event event = eventRepository.findOne(id);
        return event;
    }
}
