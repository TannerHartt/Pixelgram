package com.cognizant.capybarasfems.Controller;

import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.PostUI;
import com.cognizant.capybarasfems.Services.CommentService;
import com.cognizant.capybarasfems.Services.PostUIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//
@CrossOrigin(origins = "${ui.UI_URL}", allowCredentials = "true")
@RestController
@RequestMapping("/")
public class PostUIController {
    @Autowired
    private PostUIService postUIService;

    @Autowired
    private CommentService commentService;

    public PostUIController(PostUIService postUIService, CommentService commentService) {
        this.postUIService = postUIService;
        this.commentService = commentService;
    }

    @GetMapping("/posts")
    public PageOfItems<PostUI> getPost(@RequestParam("pNum") int pageNumber, @RequestParam("pSize") int pageSize) {
        PageOfItems<PostUI> page = postUIService.getPostPage(pageNumber, pageSize);
        return page;
    }

    @GetMapping("/comments")
    public PageOfItems<Comment> getCommentByPostID(@RequestParam("pId") int postId, @RequestParam("pNum") int pageNumber, @RequestParam("pSize") int pageSize){
        PageOfItems<Comment> comment = commentService.getComment(postId, pageNumber, pageSize);
        return comment;
    }

    @GetMapping("/posts/{pId}/comments")
    public PageOfItems<PostUI> getByPostIdComment(@PathVariable("pId") int postId, @RequestParam("pNum") int pageNumber, @RequestParam("pSize") int pageSize) {
        PageOfItems<PostUI> pageId = postUIService.getPostPage(pageNumber, pageSize);
        return pageId;
    }
}




/*
"/posts?pageNumber={int}&pageSize={int}"
PageOfItems<T> {
    items: List<T>,
    hasNext: boolean,
    totalElements: int
}
 */
