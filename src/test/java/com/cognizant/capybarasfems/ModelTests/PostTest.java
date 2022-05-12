package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PostTest {

    Post post;

    @BeforeEach
    public void setup() {
        post = new Post(
                1,
                1,
                "image",
                "Hello, World!",
                LocalDate.of(2022, 5, 11)
        );
    }

    @Test
    public void testConstructorAndGetters() {
        post = new Post(
                2,
                2,
                "image2",
                "Hey",
                LocalDate.of(2000, 1, 1)
        );

        Assertions.assertEquals(2, post.getId());
        Assertions.assertEquals(2, post.getUserId());
        Assertions.assertEquals("image2", post.getImg());
        Assertions.assertEquals("Hey", post.getDescription());
        Assertions.assertEquals(LocalDate.of(2000,1,1), post.getCreatedOn());
    }

    @Test
    public void testSetId() {
        post.setId(2);
        Assertions.assertEquals(2, post.getId());
    }

    @Test
    public void testSetUserId() {
        post.setUserId(2);
        Assertions.assertEquals(2, post.getUserId());
    }

    @Test
    public void testSetImg() {
        post.setImg("image2");
        Assertions.assertEquals("image2", post.getImg());
    }

    @Test
    public void testSetDescription() {
        post.setDescription("Hey");
        Assertions.assertEquals("Hey", post.getDescription());
    }

    @Test
    public void testSetCreatedOn() {
        post.setCreatedOn(LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(LocalDate.of(2000, 1, 1), post.getCreatedOn());
    }
}

