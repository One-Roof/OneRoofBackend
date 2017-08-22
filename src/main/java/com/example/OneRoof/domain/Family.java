package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Ethan on 8/15/17.
 */
@Data
@Entity
@Table(name = "family")
public class Family {

    private int id;
    private String familyName;

    public Family() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "familyname")
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Family family = (Family) o;

        return id == family.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
