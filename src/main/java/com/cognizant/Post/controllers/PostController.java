package com.cognizant.Post.controllers;

import com.cognizant.Post.Service.PostService;
import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


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
       /* if (page == null)
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No posts available");
*/
        return page;
    }


}
