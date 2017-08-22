package com.example.OneRoof.repository;

import com.example.OneRoof.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 8/22/17.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
