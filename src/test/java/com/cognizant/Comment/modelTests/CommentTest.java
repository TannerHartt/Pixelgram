package com.cognizant.Comment.modelTests;

import com.cognizant.Comment.models.Comment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;

public class CommentTest {
    Comment comment;

    @BeforeEach
    public void Setup() {
    comment = new Comment();
    }

    @Test
    public void CommentConstructorTest_positive() {
        comment = new Comment(
                1,
                2,
                "testName",
                "testBody",
                LocalDate.of(2022, 5, 18)
        );
        Assertions.assertEquals(comment.getId(), 1);
        Assertions.assertEquals(comment.getPostId(), 2);
        Assertions.assertEquals(comment.getUsername(), "testName");
        Assertions.assertEquals(comment.getBody(), "testBody");
        Assertions.assertEquals(comment.getCreatedOn(), LocalDate.of(2022,5,18));
    }

    @Test
    public void setIdTest() {
        comment.setId(1);
        Assertions.assertEquals(comment.getId(), 1);
    }

    @Test
    public void setPostIdTest() {
        comment.setPostId(2);
        Assertions.assertEquals(comment.getPostId(), 2);
    }

    @Test
    public void setUserNameTest() {
        comment.setUsername("testName");
        Assertions.assertEquals(comment.getUsername(), "testName");
    }

    @Test
    public void setCreatedOn() {
        comment.setCreatedOn(LocalDate.of(2021,1,1));
        Assertions.assertEquals(comment.getCreatedOn(), LocalDate.of(2021,1,1));
    }

}
