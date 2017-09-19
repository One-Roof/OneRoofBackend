package com.example.OneRoof.service;

import com.example.OneRoof.domain.Album;
import com.example.OneRoof.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    @Transactional
    @Override
    public Album add(Album album) {
        return albumRepository.save(album);
    }

    @Transactional
    @Override
    public void add(List<Album> albums) {
        for (Album album : albums) {
            albumRepository.save(album);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Album getById(int id) {
        return getAlbum(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Album> get() {
        return albumRepository.findAll();
    }

    @Transactional
    @Override
    public void update (Album album) {
        albumRepository.save(album);
    }

    @Transactional
    @Override
    public void delete(int id) {
        albumRepository.delete(id);
    }

    private Album getAlbum(int id) {
        Album album = albumRepository.findOne(id);
        return album;
    }
}
