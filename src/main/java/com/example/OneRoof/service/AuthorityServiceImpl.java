package com.example.OneRoof.service;

import com.example.OneRoof.domain.Authority;
import com.example.OneRoof.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;

    @Transactional
    @Override
    public Authority add(Authority authority) {
        return authorityRepository.save(authority);
    }

    @Transactional
    @Override
    public void add(List<Authority> authoritys) {
        for (Authority authority : authoritys) {
            authorityRepository.save(authority);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Authority getById(int id) {
        return getAuthority(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Authority> get() {
        return authorityRepository.findAll();
    }

    @Transactional
    @Override
    public void update (Authority authority) {
        authorityRepository.save(authority);
    }

    @Transactional
    @Override
    public void delete(int id) {
        authorityRepository.delete(id);
    }

    private Authority getAuthority(int id) {
        Authority authority = authorityRepository.findOne(id);
        return authority;
    }
}
