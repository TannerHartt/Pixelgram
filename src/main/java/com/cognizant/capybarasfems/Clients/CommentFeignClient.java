package com.cognizant.capybarasfems.Clients;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "commentCrud", url= "${commentCrud.COMMENT_URL}")
public interface CommentFeignClient {
    @GetMapping("/posts/{postId}/comments?pageNumber={pageNumber}&pageSize={pageSize}")
    PageOfItems<Comment>getComment(@PathVariable long postId, @PathVariable int pageNumber, @PathVariable int pageSize);
}
