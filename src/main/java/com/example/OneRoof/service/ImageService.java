package com.example.OneRoof.service;

import com.example.OneRoof.domain.Image;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
@Service
public interface ImageService {
    Image add(Image familyMember);
    void add(List<Image> familyMembers);
    void update(Image familyMember);
    Image getById(int id);
    List<Image> get();
    void delete(int id);
}
