package com.cognizant.Post.ControllerTest;

import com.cognizant.Post.Service.PostService;
import com.cognizant.Post.controllers.PostController;
import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import com.cognizant.Post.repository.PostRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(PostController.class)
@ExtendWith(SpringExtension.class)
public class PostControllerTest {
    Post post;
    @SpyBean
    PostController postController;

    @MockBean
    PostService service;

    @Autowired
    MockMvc mvc;



    @BeforeEach
    public void setup() {
        postController = new PostController(service);
        MockitoAnnotations.openMocks(this);
        post = new Post(1, 1, "img1", "Cool pic", LocalDate.of(2022, 5, 12));
    }


    @Test
    public void postTest() {
        List<Post> posts = new ArrayList<>();
        posts.add(post);

    }

    @Test
    public void getPostEndpoint__returnsPageOfPosts() throws Exception {
        PageOfItems<Post> postPage = new PageOfItems<>();
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        postPage.setItems(postList);
        when(service.getAllPost(0,4)).thenReturn(postPage);

        mvc.perform(MockMvcRequestBuilders.get("/posts?pageNumber=0&pageSize=4"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getPosts_notNullTest(){
        int pageNumber = 0;
        int pageSize = 5;
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        PageOfItems<Post> postPage = new PageOfItems<>();
        postPage.setItems(postList);
        when(service.getAllPost(pageNumber,pageSize)).thenReturn(postPage);
        Assertions.assertNotNull(postController.getPosts(pageNumber, pageSize));
    }

    @Test
    public void getPageOfPosts_returnPageOfPosts(){
        int pageNumber= 0;
        int pageSize = 5;
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        PageOfItems<Post> postPage = new PageOfItems<>();
        postPage.setItems(postList);
        when(service.getAllPost(pageNumber,pageSize)).thenReturn(postPage);
        System.out.println(postController.getPosts(pageNumber,pageSize));
        verify(service).getAllPost(pageNumber, pageSize);
    }
}
