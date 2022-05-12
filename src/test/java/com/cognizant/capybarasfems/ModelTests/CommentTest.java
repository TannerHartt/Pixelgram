package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.Comment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CommentTest {
    Comment comment;

    @BeforeEach
    public void setup() {
        comment = new Comment(
                1,
                1,
                "karlos",
                "Hello, World!",
                LocalDate.of(2022, 5, 11)
        );
    }

    @Test
    public void testConstructorAndGetters() {
        comment = new Comment(
                2,
                2,
                "waaik",
                "Hey",
                LocalDate.of(2000, 1, 1)
        );

        Assertions.assertEquals(2, comment.getId());
        Assertions.assertEquals(2, comment.getPostId());
        Assertions.assertEquals("waaik", comment.getUsername());
        Assertions.assertEquals("Hey", comment.getBody());
        Assertions.assertEquals(LocalDate.of(2000,1,1), comment.getCreatedOn());
    }

    @Test
    public void testSetId() {
        comment.setId(2);
        Assertions.assertEquals(2, comment.getId());
    }

    @Test
    public void testSetPostId() {
        comment.setPostId(2);
        Assertions.assertEquals(2, comment.getPostId());
    }

    @Test
    public void testSetUsername() {
        comment.setUsername("waaik");
        Assertions.assertEquals("waaik", comment.getUsername());
    }

    @Test
    public void testSetBody() {
        comment.setBody("Hey");
        Assertions.assertEquals("Hey", comment.getBody());
    }

    @Test
    public void testSetCreatedOn() {
        comment.setCreatedOn(LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(LocalDate.of(2000, 1, 1), comment.getCreatedOn());
    }
}
