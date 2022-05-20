package com.cognizant.Comment.services;

import com.cognizant.Comment.models.Comment;
import com.cognizant.Comment.models.PageOfItems;
import com.cognizant.Comment.repos.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class CommentService implements CommentServiceInterface {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public PageOfItems<Comment> getAllComment(int postId, int pageNumber, int pageSize) {
        PageOfItems<Comment> pageOfItems = new PageOfItems<>();
        Page<Comment> pageResult = getCommentPage(postId, pageNumber, pageSize);
        pageOfItems.setItems(pageResult.toList());
        pageOfItems.setHasNext(pageResult.hasNext());
        pageOfItems.setTotalElements((int) pageResult.getTotalElements());
        return pageOfItems;
    }

    @Override
    public Page<Comment> getCommentPage(int postId, int pageNumber, int pageSize) {
        PageRequest fiveComments = PageRequest.of(pageNumber, pageSize);
        return commentRepo.findByPostId(postId, fiveComments);
    }

    @Override
    public Comment addComment(Comment comment) {
        return (Comment) commentRepo.save(comment);
    }
}






