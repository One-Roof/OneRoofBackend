package com.example.OneRoof.repository;

import com.example.OneRoof.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 8/27/17.
 */
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
