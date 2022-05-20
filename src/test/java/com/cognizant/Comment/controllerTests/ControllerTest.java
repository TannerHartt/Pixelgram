package com.cognizant.Comment.controllerTests;

import com.cognizant.Comment.controllers.CommentController;
import com.cognizant.Comment.models.Comment;
import com.cognizant.Comment.models.PageOfItems;
import com.cognizant.Comment.services.CommentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

@WebMvcTest(CommentController.class)
public class ControllerTest {
    Comment comment;
    @SpyBean
    CommentController commentController;

    @MockBean
    CommentService service;

    @Autowired
    MockMvc mvc;

    @BeforeEach
    public void setup() {
        commentController = new CommentController(service);
        MockitoAnnotations.openMocks(this);
        comment = new Comment(1,1,"username", "body", LocalDate.of(2022,1,1));
    }


    @Test
    public void getComments_notNullTest() {
        int pageNumber = 0;
        int pageSize = 5;
        int postId = 1;
        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        PageOfItems<Comment> commentPage = new PageOfItems<>();
        commentPage.setItems(commentList);
        when(service.getAllComment(postId, pageNumber, pageSize)).thenReturn(commentPage);
        Assertions.assertNotNull(commentController.getComment(postId, pageNumber, pageSize));
    }

    @Test
    public void getCommentEndPt_ReturnsPageOfPosts() throws Exception {
        PageOfItems<Comment> commentPage = new PageOfItems<>();
        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        commentPage.setItems(commentList);
        when(service.getAllComment(1,0,4)).thenReturn(commentPage);

        mvc.perform(MockMvcRequestBuilders.get("/comments?postId=1&pageNumber=0&pageSize=5"));
    }

    @Test
    public void getPageofComments_returnPageOfComments() {
        int pageNumber = 0;
        int pageSize = 5;
        int postId = 1;
        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        PageOfItems<Comment> commentPage = new PageOfItems<>();
        commentPage.setItems(commentList);
        when(service.getAllComment(postId, pageNumber, pageSize)).thenReturn(commentPage);
        commentController.getComment(postId, pageNumber, pageSize);
        verify(service).getAllComment(postId, pageNumber, pageSize);
    }
}
