package com.example.OneRoof.service;

import com.example.OneRoof.domain.Authority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorityService {
    Authority add(Authority authority);
    void add(List<Authority> authoritys);
    void update(Authority authority);
    Authority getById(int id);
    List<Authority> get();
    void delete(int id);
}
