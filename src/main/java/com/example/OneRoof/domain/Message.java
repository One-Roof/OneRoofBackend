package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ethan on 8/27/17.
 */
@Data
@Entity
@Table(name = "message")
public class Message {

    private int id;
    private String content;
    private Date date;
    private User user;

    public Message() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne
    @Column(name = "userid")
    public String getUser() {
        System.out.println(user.getUsername());
        return "hello";
    }

    public void setUser(User user) { this.user = user; }
}
