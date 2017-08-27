package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ethan on 8/27/17.
 */
@Data
@Entity
//@Table(name = "album")
public class Album {

    private int id;
    private String title;
    private Date date;
    private List<Image> images;
    private int userid;

    public Album() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @ManyToOne
    @JoinColumn(name = "userid")
    public int getUserid() { return userid; }

    public void setUserid(int userid) { this.userid = userid; }
}
