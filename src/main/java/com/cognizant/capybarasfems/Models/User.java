package com.cognizant.capybarasfems.Models;

public class User {
    private long id;
    private String username;
    private String profileImg;

    public User(long id, String username, String profileImg) {
        this.id = id;
        this.username = username;
        this.profileImg = profileImg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
}
