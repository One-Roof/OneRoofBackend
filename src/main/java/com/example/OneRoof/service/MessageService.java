package com.example.OneRoof.service;

import com.example.OneRoof.domain.Message;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
public interface MessageService {
    Message add(Message familyMember);
    void add(List<Message> familyMembers);
    void update(Message familyMember);
    Message getById(int id);
    List<Message> get();
    void delete(int id);
}
