package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    User user;

    @BeforeEach
    public void setup(){
        user = new User(1,"waaik","pimg");

    }

    @Test
    public void testConstructorAndGetter(){
        User user = new User(2,"bobby","pimg2");
        Assertions.assertEquals(2, user.getId());
        Assertions.assertEquals("bobby", user.getUsername());
        Assertions.assertEquals("pimg2", user.getProfileImg());

    }

    @Test
    public void setId(){
        user.setId(2);
        Assertions.assertEquals(2, user.getId());
    }

    @Test
    public void setUserName(){
        user.setUsername("bobby");
        Assertions.assertEquals("bobby", user.getUsername());

    }

    @Test
    public void setProfileImage(){
        user.setProfileImg("pimg2");
        Assertions.assertEquals("pimg2", user.getProfileImg());
    }
}

