package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
@Data
@Entity
@Table(name = "album")
public class Album {


    private int id;
    private String title;
    private Date date;
    private List<Image> images = new ArrayList<>();

    public Album() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(targetEntity = Image.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "imageid")
    public List<Image> getImages() { return images; }

    public void setImages(List<Image> images) { this.images = images; }
    
}
