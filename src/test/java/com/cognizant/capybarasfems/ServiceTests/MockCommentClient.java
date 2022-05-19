package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Clients.CommentFeignClient;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import java.time.LocalDate;
import java.util.ArrayList;

public class MockCommentClient implements CommentFeignClient {
    @Override
    public PageOfItems<Comment> getComment(int postId, int pageNumber, int pageSize) {
        ArrayList<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment(1, 5, "user1", "body1", LocalDate.now()));
        commentList.add(new Comment(2, 5, "user1", "body2", LocalDate.now()));
        commentList.add(new Comment(3, 5, "user1", "body3", LocalDate.now()));
        commentList.add(new Comment(4, 5, "user1", "body4", LocalDate.now()));
        commentList.add(new Comment(5, 5, "user1", "body5", LocalDate.now()));
        commentList.add(new Comment(6, 5, "user1", "body6", LocalDate.now()));

        return new PageOfItems<Comment>(commentList, true, 6);
    }
}
