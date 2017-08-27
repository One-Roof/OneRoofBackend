package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ethan on 8/27/17.
 */
@Data
@Entity
@Table(name = "image")
public class Image {

    private int id;
    private String title;
    private Date date;
    private String imageUrl;
//    private int userid;

    public Image() {}

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

//    @ManyToOne(targetEntity = User.class)
//    @JoinColumn(name = "userid")
//    public int getUserid() { return userid; }
//
//    public void setUserid(int userid) { this.userid = userid; }
}
