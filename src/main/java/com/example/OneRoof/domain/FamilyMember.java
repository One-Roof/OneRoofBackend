package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ethan on 8/15/17.
 */
@Data
@Entity
@Table(name = "familymember")
public class FamilyMember {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FamilyMember() {
    }

    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
