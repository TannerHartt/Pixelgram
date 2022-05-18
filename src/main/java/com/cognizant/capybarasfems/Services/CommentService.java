package com.cognizant.capybarasfems.Services;

import com.cognizant.capybarasfems.Clients.CommentFeignClient;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import com.cognizant.capybarasfems.Models.PostUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentService implements CommentServiceInterface{

    @Autowired
    CommentFeignClient commentFeignClient;

    public CommentService(){}

    public CommentService(CommentFeignClient commentFeignClient){
       this.commentFeignClient = commentFeignClient;
    }

    @Override
    public PageOfItems<Comment> getComment(long postId, int pageNumber, int pageSize){
       PageOfItems<Comment> commentCrudPage = commentFeignClient.getComment(postId, pageNumber, pageSize);

        PageOfItems<Comment> commentPage = new PageOfItems<>(
                null,
                commentCrudPage.isHasNext(),
                commentCrudPage.getTotalElements()
        );

        List<Comment> comment = new ArrayList<>();
        for (Comment c : commentCrudPage.getItems()) {
            Comment translated = new Comment(c.getId(),c.getPostId(), c.getUsername(),c.getBody(),c.getCreatedOn() );
            comment.add(translated);
        }
        commentPage.setItems(comment);
        return commentPage;
    }
}