package com.example.OneRoof.repository;

import com.example.OneRoof.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 8/18/17.
 */
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer> {
}
