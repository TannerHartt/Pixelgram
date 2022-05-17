package com.cognizant.Post.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "img")
    private String img;
    @Column(name = "description")
    private String description;


    @Column(name = "created_on", columnDefinition = "DATE")
    private LocalDate createdOn;
    // LocalDate and Date are different
    // LocalDate is what we're using for this project
    // SQL will return a Date
    //
    // Date -> LocalDate
    // {Date object}.toLocalDate();
    //
    // LocalDate -> Date
    // Date.valueOf({LocalDate object});
}
