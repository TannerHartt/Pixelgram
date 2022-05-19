package com.cognizant.capybarasfems.Services;

import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;

public interface CommentServiceInterface {

    PageOfItems<Comment> getComment(int postId, int pageNumber, int pageSize);
}
