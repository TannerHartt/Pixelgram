package com.cognizant.capybarasfems.Controller;

import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.PostUI;
import com.cognizant.capybarasfems.Services.PostUIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostUIController {
    @Autowired
    private PostUIService postUIService;

    public PostUIController(PostUIService postUIService){
       this.postUIService = postUIService;
    }

    @GetMapping(value = "/?pageNumber={int}&pageSize={int}")
   public PageOfItems<PostUI> getByPostId(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize){
      PageOfItems<PostUI> page = postUIService.getPostPage(pageNumber, pageSize);
      return page;
   }
/*
"/posts?pageNumber={int}&pageSize={int}"
PageOfItems<T> {
    items: List<T>,
    hasNext: boolean,
    totalElements: int
}
 */
}
