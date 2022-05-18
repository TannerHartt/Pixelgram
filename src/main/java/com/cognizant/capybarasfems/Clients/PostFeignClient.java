package com.cognizant.capybarasfems.Clients;

import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//Needs value of Post-CRUD and corresponding Post URL
@FeignClient(value = "postCrud", url = "${postCrud.POST_URL}")
public interface PostFeignClient {
    //
    @GetMapping("/posts?pageNumber={int}&pageSize={int}")
    PageOfItems<Post> getPost(@PathVariable int pageNumber, @PathVariable int pageSize);

    //Sends Post from PostController
    @PostMapping("")
    Post addPost(@RequestBody Post post);

}
