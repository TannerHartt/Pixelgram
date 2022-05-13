package com.cognizant.Post.ServiceTest;

import com.cognizant.Post.Service.PostService;
import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import com.cognizant.Post.repository.PostRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;

import java.time.LocalDate;
import java.util.ArrayList;

public class PostServiceTest {
    @Mock // @Mock creates a clone of the actual PostRepo
    PostRepository postRepository;
    @InjectMocks //will swap out actual postrepo for @Mock postrepo
    PostService postService;
    Post post;
    PageOfItems pageOfItems;

    @BeforeEach
    public void setTest() {
        post = new Post(1,1, "img","Cool pic", LocalDate.of(2022,5,12));
        pageOfItems = new PageOfItems(new ArrayList(), true, 20);
    }

    @Test
    public void isGetPageItems() {
        postService.getPostList(post);
        Assertions.assertEquals(new ArrayList<Post>(), postService.getPostList(post));
    }
}
