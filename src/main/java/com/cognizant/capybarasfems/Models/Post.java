package com.cognizant.capybarasfems.Models;

import java.time.LocalDate;

public class Post {
    private long id;
    private long userId;
    private String img;
    private String description;
    private LocalDate createdOn;

    public Post(long id, long userId, String img, String description, LocalDate createdOn) {
        this.id = id;
        this.userId = userId;
        this.img = img;
        this.description = description;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
