package com.cognizant.Post.Service;

import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostServiceInterface {

    PageOfItems<Post> getAllPost(int pageNumber, int pageSize);
    Page<Post> getPostPage(int pageNumber, int pageSize);
    Post addPost(Post post);


}
