package com.cognizant.Comment.servicesTest;

import com.cognizant.Comment.models.Comment;
import com.cognizant.Comment.models.PageOfItems;
import com.cognizant.Comment.repos.CommentRepo;
import com.cognizant.Comment.services.CommentService;
import com.cognizant.Comment.services.CommentServiceInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class commentServiceTests {
    @Mock
    CommentRepo commentRepo;

    @InjectMocks
    @Spy

    CommentService commentService;
    Comment comment;
    Comment comment1;
    Comment comment2;
    Comment comment3;
    Comment comment4;
    Comment comment5;
    PageOfItems pageOfItems;

    PageRequest pageable;

    Page<Comment> commentPage;

    @BeforeEach
    public void setUpTest() {
        int pageNumber = 0;
        int pageSize = 5;
        pageable = PageRequest.of(pageNumber, pageSize);
        comment = new Comment(1, 1, "username", "body", LocalDate.of(2022, 1, 1));
        comment1 = new Comment(1, 1, "username", "body", LocalDate.of(2022, 1, 1));
        comment2 = new Comment(2, 2, "username", "body", LocalDate.of(2022, 1, 1));
        comment3 = new Comment(3, 3, "username", "body", LocalDate.of(2022, 1, 1));
        comment4 = new Comment(4, 4, "username", "body", LocalDate.of(2022, 1, 1));
        comment5 = new Comment(5, 5, "username", "body", LocalDate.of(2022, 1, 1));
        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        commentList.add(comment1);
        commentList.add(comment2);
        commentList.add(comment3);
        commentList.add(comment4);
        commentPage = new PageImpl<>(commentList, pageable, pageSize);
        pageOfItems = new PageOfItems(commentList, true, 6);
    }

    @Test
    public void addCommentTest_positive() {
        commentService.addComment(comment);
        commentService.addComment(comment1);
        commentService.addComment(comment2);
        commentService.addComment(comment3);
        commentService.addComment(comment4);
        commentService.addComment(comment5);
    }

    @Test
    public void getCommentTest_positive() {
        int postId = 1;
        int pageNumber = 0;
        int pageSize = 5;
        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        commentList.add(comment1);
        commentList.add(comment2);
        commentList.add(comment3);
        commentList.add(comment4);
        commentList.add(comment5);
        commentPage = new PageImpl<Comment>(commentList);
        when(commentRepo.findByPostId(postId,PageRequest.of(pageNumber, pageSize))).thenReturn(commentPage);

        Page<Comment> results = commentService.getCommentPage(postId, pageNumber, pageSize);
        Assertions.assertEquals(commentPage.getTotalElements(), results.getTotalElements());
    }

    @Test
    public void getAllCommentTest_positive() {
        int postId = 1;
        int pageNumber = 0;
        int pageSize = 5;

        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        commentList.add(comment2);
        commentList.add(comment3);
        commentList.add(comment4);
        commentList.add(comment5);
        commentPage = new PageImpl<Comment>(commentList, pageable, pageSize);
        Mockito.doReturn(commentPage).when(commentService).getCommentPage(postId, pageNumber, pageSize);

        pageOfItems = commentService.getAllComment(postId, pageNumber, pageSize);

        Assertions.assertEquals(pageOfItems.getTotalElements(), 5);
        Assertions.assertEquals(pageOfItems.isHasNext(), false);
    }

}
