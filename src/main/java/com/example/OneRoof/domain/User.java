package com.example.OneRoof.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Ethan on 8/18/17.
 */
@Data
@Entity
@ToString(exclude = "password")
@Table(name = "appuser")
public class User {

    private int id;
    private String name;
    private String email;
    @com.fasterxml.jackson.annotation.JsonIgnore private String password;
    private int age;
    private boolean admin;
    private boolean child;

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "isadmin")
    public boolean isAdmin() { return admin; }

    public void setAdmin(boolean admin) { this.admin = admin; }

    @Column(name = "ischild")
    public boolean isChild() { return child; }

    public void setChild(boolean child) { this.child = child; }
}
