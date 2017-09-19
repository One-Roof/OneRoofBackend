package com.example.OneRoof.repository;

import com.example.OneRoof.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by Ethan on 8/22/17.
 */

@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface UserRepository extends JpaRepository<User, Integer> {

//    @Override
//    @PreAuthorize("#user?.admin == null || #employee?.admin?.name == authentication?.name")
//    User save (@Param("user") User user);
//
//    @Override
//    @PreAuthorize("@userRepository.findOne(#id)?.admin?.name == authentication?.name")
//    void delete(@Param("id") Integer id);
//
//    @Override
//    @PreAuthorize("#user?.admin?.name == authentication?.name")
//    void delete(@Param("user") User user);

}
