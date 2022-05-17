package com.cognizant.Post.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageOfItems<T> {
    //small change
    List<T> items;
    boolean hasNext;
    long totalElements;



    public void isHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
}
