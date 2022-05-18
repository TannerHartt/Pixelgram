package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Clients.CommentFeignClient;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import com.cognizant.capybarasfems.Services.CommentService;
import com.cognizant.capybarasfems.Services.PostUIService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.LocalDate;

public class CommentServiceTest {
    CommentService commentService;

    @BeforeEach
    public void setup() {
        commentService = new CommentService(new MockCommentClient()) {
        };
    }

    @Test
    public void getCommentByPostIdTest(){
        PageOfItems<Comment> commentResult = commentService.getComment(5,1,5);
        Assertions.assertEquals(5, commentResult.getItems().get(0).getPostId());
        Assertions.assertEquals(1, commentResult.getItems().get(0).getId());
    }

    @Test
    public void getPageOfCommentsTest(){
        PageOfItems<Comment> commentResult = commentService.getComment(1,2,5);
        Assertions.assertEquals(6, commentResult.getTotalElements());
        Assertions.assertEquals(true, commentResult.isHasNext());
        }
}
