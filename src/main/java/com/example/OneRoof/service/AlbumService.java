package com.example.OneRoof.service;

import com.example.OneRoof.domain.Album;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
@Service
public interface AlbumService {
    Album add(Album familyMember);
    void add(List<Album> familyMembers);
    void update(Album familyMember);
    Album getById(int id);
    List<Album> get();
    void delete(int id);
}
