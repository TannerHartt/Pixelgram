package com.cognizant.Comment.controllers;

import com.cognizant.Comment.models.Comment;
import com.cognizant.Comment.models.PageOfItems;
import com.cognizant.Comment.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping
    public PageOfItems<Comment> getComment(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize){
        return service.getAllComment(pageNumber, pageSize);
    }

}
