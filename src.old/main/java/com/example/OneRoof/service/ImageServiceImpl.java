package com.example.OneRoof.service;

import com.example.OneRoof.domain.Image;
import com.example.OneRoof.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepository imageRepository;

    @Transactional
    @Override
    public Image add(Image image) {
        return imageRepository.save(image);
    }

    @Transactional
    @Override
    public void add(List<Image> images) {
        for (Image image : images) {
            imageRepository.save(image);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Image getById(int id) {
        return getImage(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Image> get() {
        return imageRepository.findAll();
    }

    @Transactional
    @Override
    public void update (Image image) {
        imageRepository.save(image);
    }

    @Transactional
    @Override
    public void delete(int id) {
        imageRepository.delete(id);
    }

    private Image getImage(int id) {
        Image image = imageRepository.findOne(id);
        return image;
    }
}
