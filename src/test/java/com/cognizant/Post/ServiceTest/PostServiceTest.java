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
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PostServiceTest {
    @Mock // @Mock creates a clone of the actual PostRepo
    PostRepository postRepository;

    @InjectMocks //will swap out actual postrepo for @Mock postrepo
    @Spy //Must use to instantiate PostService when using Mockito test annotations.
    PostService postService;
    Post post;
    Post post2;
    Post post3;
    Post post4;
    Post post5;
    Post post6;
    PageOfItems pageOfItems;

    Pageable pageable;

    Page<Post> page;

    @BeforeEach
    public void setupTest() {
        int pageNumber = 0;
        int pageSize = 5;
        pageable = PageRequest.of(pageNumber, pageSize);
        post = new Post(1, 1, "img1", "Cool pic", LocalDate.of(2022, 5, 12));
        post2 = new Post(2, 1, "img2", "Nice pic", LocalDate.of(2022, 5, 12));
        post3 = new Post(3, 1, "img3", "Sweet pic", LocalDate.of(2022, 5, 12));
        post4 = new Post(1, 2, "img4", "Dope pic", LocalDate.of(2022, 5, 12));
        post5 = new Post(2, 2, "img5", "Great pic", LocalDate.of(2022, 5, 12));
        post6 = new Post(3, 2, "img6", "Good pic", LocalDate.of(2022, 5, 12));
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        postList.add(post6);
        page = new PageImpl<>(postList, pageable, pageSize);
        pageOfItems = new PageOfItems(postList, true, 6);

    }
// Orignal Test
   /* @Test
    public void isGetPageItems() {
        ArrayList<Post> postArrayList = new ArrayList<Post>();
        postArrayList.add(post);
        Page<Post> page = new PageImpl<Post>(postArrayList);
        when(postRepository.findAll(any(Pageable.class))).thenReturn(page);
        Assertions.assertEquals(page.getContent(), postService.getPostList(post));
    }*/

    @Test
    public void addPostTest() {
        postService.addPost(post);
        postService.addPost(post2);
        postService.addPost(post3);

        Assertions.assertEquals(post.getUserId(), 1);
        Assertions.assertEquals(post2.getUserId(),1);
        Assertions.assertEquals(post3.getUserId(),1);


        }
        @Test
        public void getPostPageTest(){
        int pageNumber = 0;
        int pageSize = 5;
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        postService.addPost(post6);
        page = new PageImpl<Post>(postList);
        //When calling all post in postRepository then return a Page<Post> page.
       when(postRepository.findAll(PageRequest.of(pageNumber,pageSize))).thenReturn(page);

       Page<Post> result = postService.getPostPage(0,5);


       System.out.println(page.getContent());
       System.out.println(result.getTotalPages());
        Assertions.assertEquals(page.getTotalElements(), result.getTotalElements());

        }

        @Test
        public void getAllPostsTest(){
            int pageNumber = 0;
            int pageSize = 5;
            List<Post> postList = new ArrayList<>();
            postList.add(post);
            postList.add(post2);
            postList.add(post3);
            postList.add(post4);
            postList.add(post5);
            page = new PageImpl<Post>(postList, pageable,pageSize);
            //Return a page, when postService getPostPage method is used
            Mockito.doReturn(page).when(postService).getPostPage(pageNumber,pageSize);

            pageOfItems = postService.getAllPost(pageNumber,pageSize);

             System.out.println(pageOfItems);
            Assertions.assertEquals(pageOfItems.getTotalElements(),5);
            Assertions.assertEquals(pageOfItems.isHasNext(), false);


        }
    }

