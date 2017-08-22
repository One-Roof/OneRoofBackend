package com.example.OneRoof.service;

import com.example.OneRoof.domain.FamilyMember;

import java.util.List;

/**
 * Created by Ethan on 8/18/17.
 */
public interface FamilyMemberService {
    FamilyMember add(FamilyMember familyMember);
    void add(List<FamilyMember> familyMembers);
    void update(FamilyMember familyMember);
    FamilyMember getById(int id);
    List<FamilyMember> get();
    void delete(int id);
}
