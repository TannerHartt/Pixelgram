package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.*;
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
                new Post(
                        1,
                        1,
                        "img",
                        "Hello",
                        LocalDate.of(2022, 5, 11)
                ),
                new PageOfItems<>(
                        new ArrayList<>(),
                        true,
                        30
                )
        );
    }

    @Test
    public void testConstructorAndGetters() {
        Post tempPost = new Post(2, 2, "image2", "Hey", LocalDate.of(2000, 1, 1));
        PageOfItems<Comment> tempComment = new PageOfItems<>(new ArrayList<>(), true, 30);
        postUI = new PostUI(
                tempPost,
                tempComment
        );

        Assertions.assertEquals(tempPost, postUI.getPost());
        Assertions.assertEquals(tempComment, postUI.getComments());
    }

    @Test
    public void testSetPost() {
        Post tempPost = new Post(2, 2, "image2", "Hey", LocalDate.of(2000, 1, 1));
        postUI.setPost(tempPost);

        Assertions.assertEquals(tempPost, postUI.getPost());
    }

    @Test
    public void TestSetComments() {
        PageOfItems<Comment> tempComment = new PageOfItems<>(new ArrayList<>(), true, 30);
        postUI.setComments(tempComment);
        Assertions.assertEquals(tempComment, postUI.getComments());
    }
}

