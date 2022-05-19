package com.cognizant.capybarasfems.Clients;
import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "commentCrud", url= "${commentCrud.COMMENT_URL}")
public interface CommentFeignClient {
    @GetMapping("/comments?postId={pId}&pageNumber={pNum}&pageSize={pSize}")
    PageOfItems<Comment>getComment(@PathVariable("pId") int postId, @PathVariable("pNum") int pageNumber, @PathVariable("pSize") int pageSize);
}
