package com.cognizant.Comment.services;

import com.cognizant.Comment.models.Comment;
import com.cognizant.Comment.models.PageOfItems;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface CommentServiceInterface {
    PageOfItems<Comment> getAllComment(int postId, int pageNumber, int pageSize);
    Page<Comment> getCommentPage(int postId, int pageNumber, int pageSize);
    Object addComment(Comment comment);
}
