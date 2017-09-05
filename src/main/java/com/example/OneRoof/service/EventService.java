package com.example.OneRoof.service;


import com.example.OneRoof.domain.Event;

import java.util.List;

/**
 * Created by Ethan on 9/5/17.
 */
public interface EventService {

    Event add(Event event);
    void add(List<Event> events);
    void update(Event event);
    Event getById(int id);
    List<Event> get();
    void delete(int id);
}
