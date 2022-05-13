package com.cognizant.Post.Service;

import com.cognizant.Post.model.Post;
import com.cognizant.Post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getPostList(Post post) {
        Pageable fivePost = PageRequest.of(0, 5);
        Page<Post> getFivePost = postRepository.findAll(fivePost);
        List<Post> fivePostList = getFivePost.getContent();
            return fivePostList;
    }
}
