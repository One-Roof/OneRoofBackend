package com.example.OneRoof.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ethan on 9/5/17.
 */
@Data
@Entity
@Table(name = "event")
public class Event {

    private int id;
    private String title;
    private boolean allDay;
    private Date start;
    private Date done;
    private String description;

    public Event() {}

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

    @Column(name = "allday")
    public boolean isAllDay() {
        return allDay;
    }

    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDone() {
        return done;
    }

    public void setDone(Date done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
