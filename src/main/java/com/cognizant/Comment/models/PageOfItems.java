package com.cognizant.Comment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PageOfItems<T> {
    List<T> items;
    boolean hasNext;
    int totalElements;

}
