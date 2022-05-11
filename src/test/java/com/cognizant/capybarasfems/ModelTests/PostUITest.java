package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.PostUI;
import com.cognizant.capybarasfems.Models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class PostUITest {

    PostUI postUI;

    @BeforeEach
    public void setup() {
        postUI = new PostUI(
                1,
                new User(1,"karlos","pimage"),
                "image",
                "Hello, World!",
                LocalDate.of(2022, 5, 11),
                new PageOfItems<Comment>(
                        new ArrayList<>(),
                        true,
                        30
                )
        );
    }

    @Test
    public void testConstructorAndGetters() {
       User tempUser=  new User(2,"bob","pimage2");
       PageOfItems<Comment> tempComment = new PageOfItems<Comment>(new ArrayList<>(),true,30);
        postUI = new PostUI(
                2,
                tempUser,
                "image2",
                "Hey",
                LocalDate.of(2000, 1, 1),
                tempComment
        );

        Assertions.assertEquals(2, postUI.getId());
        Assertions.assertEquals(tempUser, postUI.getUser());
        Assertions.assertEquals("image2", postUI.getImg());
        Assertions.assertEquals("Hey", postUI.getDescription());
        Assertions.assertEquals(LocalDate.of(2000,1,1), postUI.getCreatedOn());
        Assertions.assertEquals(tempComment, postUI.getComments());
    }

    @Test
    public void testSetId() {
        postUI.setId(2);
        Assertions.assertEquals(2, postUI.getId());
    }

    @Test
    public void testSetUser() {
        User tempUser = new User(2,"bob","pimage2");
        postUI.setUser(tempUser);
        Assertions.assertEquals(tempUser, postUI.getUser());
    }

    @Test
    public void testSetImg() {
        postUI.setImg("image2");
        Assertions.assertEquals("image2", postUI.getImg());
    }

    @Test
    public void testSetDescription() {
        postUI.setDescription("Hey");
        Assertions.assertEquals("Hey", postUI.getDescription());
    }

    @Test
    public void testSetCreatedOn() {
        postUI.setCreatedOn(LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(LocalDate.of(2000, 1, 1), postUI.getCreatedOn());
    }

    @Test
    public void TestSetComments(){
       PageOfItems<Comment> tempComment = new PageOfItems<Comment>(new ArrayList<>(), true,30);
        postUI.setComments(tempComment);
        Assertions.assertEquals(tempComment, postUI.getComments());
    }
}

