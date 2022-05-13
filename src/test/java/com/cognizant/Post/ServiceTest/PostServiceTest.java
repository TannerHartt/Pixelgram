package com.cognizant.Post.ServiceTest;

import com.cognizant.Post.Service.PostService;
import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import com.cognizant.Post.repository.PostRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
        ArrayList<Post> postArrayList = new ArrayList<Post>();
        postArrayList.add(post);
        Page<Post> page = new PageImpl<Post>(postArrayList);
        when(postRepository.findAll(any(Pageable.class))).thenReturn(page);
        Assertions.assertEquals(page.getContent(), postService.getPostList(post));
    }
}
