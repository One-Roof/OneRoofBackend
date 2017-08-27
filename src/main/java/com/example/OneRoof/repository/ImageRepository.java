package com.example.OneRoof.repository;

import com.example.OneRoof.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ethan on 8/27/17.
 */
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
