package com.cognizant.Post.controllers;

import com.cognizant.Post.Service.PostService;
import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:4200/posts")
@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }
    
    @GetMapping
    public PageOfItems<Post> getPosts(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize) {
        PageOfItems<Post> page = postService.getAllPost(pageNumber, pageSize);
        return page;
    }


}
