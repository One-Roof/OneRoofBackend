package com.example.OneRoof.service;

import com.example.OneRoof.domain.FamilyMember;
import com.example.OneRoof.repository.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/18/17.
 */
@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {

    @Autowired
    FamilyMemberRepository familyMemberRepository;

    @Transactional
    @Override
    public FamilyMember add(FamilyMember familyMember) {
        return familyMemberRepository.save(familyMember);
    }

    @Transactional
    @Override
    public void add(List<FamilyMember> familyMembers) {
        for (FamilyMember familyMember : familyMembers) {
            familyMemberRepository.save(familyMember);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public FamilyMember getById(int id) {
        return getFamilyMember(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<FamilyMember> get() {
        return familyMemberRepository.findAll();
    }

    @Transactional
    @Override
    public void update (FamilyMember familyMember) {
        familyMemberRepository.save(familyMember);
    }

    @Transactional
    @Override
    public void delete(int id) {
        familyMemberRepository.delete(id);
    }

    private FamilyMember getFamilyMember(int id) {
        FamilyMember familyMember = familyMemberRepository.findOne(id);
        return familyMember;
    }


}


