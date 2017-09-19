package com.example.OneRoof.service;

import com.example.OneRoof.domain.Message;
import com.example.OneRoof.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Transactional
    @Override
    public Message add(Message message) {
        return messageRepository.save(message);
    }

    @Transactional
    @Override
    public void add(List<Message> messages) {
        for (Message message : messages) {
            messageRepository.save(message);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Message getById(int id) {
        return getMessage(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Message> get() {
        return messageRepository.findAll();
    }

    @Transactional
    @Override
    public void update (Message message) {
        messageRepository.save(message);
    }

    @Transactional
    @Override
    public void delete(int id) {
        messageRepository.delete(id);
    }

    private Message getMessage(int id) {
        Message message = messageRepository.findOne(id);
        return message;
    }
    
}
