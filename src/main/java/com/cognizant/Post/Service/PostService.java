package com.cognizant.Post.Service;

import com.cognizant.Post.model.PageOfItems;
import com.cognizant.Post.model.Post;
import com.cognizant.Post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements PostServiceInterface{
    @Autowired
    private PostRepository postRepository;
  /*  public List<Post> getPostList(Post post) {
        Pageable fivePost = PageRequest.of(0, 5);
        Page<Post> getFivePost = postRepository.findAll(fivePost);
        List<Post> fivePostList = getFivePost.getContent();
            return fivePostList;
    }*/

    @Override
    public PageOfItems<Post> getAllPost(int pageNumber, int pageSize) {
        PageOfItems<Post> pageOfItems = new PageOfItems<Post>();
        Page<Post> pageResult = getPostPage(pageNumber, pageSize);
        pageOfItems.setItems(pageResult.toList());
        pageOfItems.isHasNext(pageResult.hasNext());
        pageOfItems.setTotalElements(pageResult.getTotalElements());
        return pageOfItems;
    }

    @Override
    public Page<Post> getPostPage(int pageNumber, int pageSize) {
        Pageable fivePost = PageRequest.of(pageNumber,pageSize);
        return postRepository.findAll(fivePost);
    }

    @Override

    public Post addPost(Post post) {

        return postRepository.save(post);
    }
}
