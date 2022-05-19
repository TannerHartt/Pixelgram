package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Clients.CommentFeignClient;
import com.cognizant.capybarasfems.Clients.PostFeignClient;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import com.cognizant.capybarasfems.Models.PostUI;
import com.cognizant.capybarasfems.Services.CommentService;
import com.cognizant.capybarasfems.Services.PostUIService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class PostUIServiceTest {
    @InjectMocks
    PostUIService service;

    @Mock
    CommentService commentService;

    @Mock
    PostFeignClient postFeignClient;



    @BeforeEach
    public void setup() {}

    @Test
    public void getPostPage_positive() {
        ArrayList<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment(1, 5, "user1", "body1", LocalDate.now()));
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post(1, 1, "image1", "descr 1", LocalDate.of(2022, 1, 1)));
        PageOfItems<Post> pageOfPosts = new PageOfItems<Post>(list,false,1);
        PageOfItems<Comment> pageOfComments = new PageOfItems<Comment>(commentList, false, 1);
        
        when(commentService.getComment(1,1,5)).thenReturn(pageOfComments);
        when(postFeignClient.getPost(1,5)).thenReturn(pageOfPosts);
        PageOfItems<PostUI> result = service.getPostPage(1, 5);


        Assertions.assertEquals("image1", result.getItems().get(0).getPost().getImg());
        Assertions.assertEquals("descr 1", result.getItems().get(0).getPost().getDescription());
        Assertions.assertEquals(1, result.getItems().get(0).getPost().getId());
        Assertions.assertEquals(5,result.getItems().get(0).getComments().getItems().get(0).getPostId());
        Assertions.assertEquals(1, result.getTotalElements());
    }
}
