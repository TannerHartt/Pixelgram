package com.cognizant.capybarasfems.Models;

public class PostUI {
    private Post post;
    private PageOfItems<Comment> comments;

    public PostUI(Post post, PageOfItems<Comment> comments) {
        this.post = post;
        this.comments = comments;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PageOfItems<Comment> getComments() {
        return comments;
    }

    public void setComments(PageOfItems<Comment> comments) {
        this.comments = comments;
    }
}
