package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ethan on 8/18/17.
 */
@Data
@Entity
@Table(name = "users")
public class User {

    private int id;
    private String username;
    private String password;
    private boolean enabled;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
