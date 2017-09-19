package com.example.OneRoof.repository;

import com.example.OneRoof.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 9/5/17.
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
}
