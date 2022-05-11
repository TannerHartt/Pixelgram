package com.cognizant.capybarasfems.Models;

import java.time.LocalDate;

public class PostUI {
    private long id;
    private User user;
    private String img;
    private String description;
    private LocalDate createdOn;
    private PageOfItems<Comment> comments;

    public PostUI(long id, User user, String img, String description, LocalDate createdOn, PageOfItems<Comment> comments) {
        this.id = id;
        this.user = user;
        this.img = img;
        this.description = description;
        this.createdOn = createdOn;
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public PageOfItems<Comment> getComments() {
        return comments;
    }

    public void setComments(PageOfItems<Comment> comments) {
        this.comments = comments;
    }
}
