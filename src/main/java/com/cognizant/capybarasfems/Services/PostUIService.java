package com.cognizant.capybarasfems.Services;

import com.cognizant.capybarasfems.Clients.PostFeignClient;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import com.cognizant.capybarasfems.Models.PostUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostUIService implements UIService {
    @Autowired
    PostFeignClient client;

    public PostUIService(PostFeignClient client) {
        this.client = client;
    }

    @Override
    public PageOfItems<PostUI> getPostPage(int pageNumber, int pageSize) {
        PageOfItems<Post> crudPage = client.getPost(pageNumber, pageSize);

        PageOfItems<PostUI> uiPage = new PageOfItems<>(
                null,
                crudPage.isHasNext(),
                crudPage.getTotalElements()
        );

        List<PostUI> uiPosts = new ArrayList<>();
        for (Post p : crudPage.getItems()) {
            PostUI translated = new PostUI(p, null);
            uiPosts.add(translated);
        }

        uiPage.setItems(uiPosts);
        return uiPage;
    }
}
