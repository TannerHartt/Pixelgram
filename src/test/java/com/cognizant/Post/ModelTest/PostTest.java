package com.cognizant.Post.ModelTest;


import com.cognizant.Post.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PostTest {
    Post post;
    @BeforeEach
    public void setup(){
        post = new Post(1,1, "img","Cool pic", LocalDate.of(2022,5,12));

    }
    @Test
    public void PostConstructorAndGetterTest(){

        post = new Post(2,2,"img2","Nice pic", LocalDate.of(2000,1,1));
        Assertions.assertEquals(2, post.getId());
        Assertions.assertEquals(2, post.getUserId());
        Assertions.assertEquals("img2", post.getImg());
        Assertions.assertEquals("Nice pic", post.getDescription());
        Assertions.assertEquals(LocalDate.of(2000,1,1), post.getCreatedOn());

    }

    @Test
    public void SetIdTest(){
        post.setId(3);
        Assertions.assertEquals(3, post.getId());
    }

    @Test
    public void SetUserIdTest(){
        post.setUserId(3);
        Assertions.assertEquals(3, post.getUserId());
    }

    @Test
    public void SetImgTest(){
        post.setImg("img3");
        Assertions.assertEquals("img3", post.getImg());
    }

    @Test
    public void SetDescriptionTest(){
        post.setDescription("Great pic");
        Assertions.assertEquals("Great pic", post.getDescription());
    }

    @Test
    public void SetCreatedOn(){
        post.setCreatedOn(LocalDate.of(1991,4,13));
        Assertions.assertEquals(LocalDate.of(1991,4,13), post.getCreatedOn());
    }

}
