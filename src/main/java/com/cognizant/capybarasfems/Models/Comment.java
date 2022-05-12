package com.cognizant.capybarasfems.Models;

import java.time.LocalDate;

public class Comment {
    private long id;
    private long postId;
    private String username;
    private String body;
    private LocalDate createdOn;

    public Comment(long id, long postId, String username, String body, LocalDate createdOn) {
        this.id = id;
        this.postId = postId;
        this.username = username;
        this.body = body;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
