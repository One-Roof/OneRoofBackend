package com.example.OneRoof.service;

import com.example.OneRoof.domain.User;

import java.util.List;

/**
 * Created by Ethan on 8/18/17.
 */
public interface UserService {
    User add(User user);
    void add(List<User> users);
    void update(User user);
    User getById(int id);
    List<User> get();
    void delete(int id);
}
