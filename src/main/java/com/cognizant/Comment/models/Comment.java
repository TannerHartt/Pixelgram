package com.cognizant.Comment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "post_id")
    private long postId;
    @Column(name = "username")
    private String username;
    @Column(name = "body")
    private String body;
    @Column(name = "created_on", columnDefinition = "DATE")
    private LocalDate createdOn;
}
