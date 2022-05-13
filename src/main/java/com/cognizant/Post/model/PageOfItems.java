package com.cognizant.Post.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class PageOfItems<Post> {
    //small change
    List<Post> items;
    boolean hasNext;
    int totalElements;

}
