package com.example.OneRoof.service;

import com.example.OneRoof.domain.User;
import com.example.OneRoof.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/18/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public User add(User user) { return userRepository.save(user); }

    @Transactional
    @Override
    public void add(List<User> users) {
        for(User user: users) {
            userRepository.save(user);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(int id) {return getUser(id); }

    @Transactional(readOnly = true)
    @Override
    public List<User> get() { return (List<User>) userRepository.findAll(); }

    @Transactional
    @Override
    public void update(User user) { userRepository.save(user); }

    @Transactional
    @Override
    public void delete(int id) { userRepository.delete(id); }

    private User getUser(int id) {
        User user = userRepository.findOne(id);
        return user;
    }

}
