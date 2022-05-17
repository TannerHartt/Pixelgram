package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Clients.PostFeignClient;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;

import java.time.LocalDate;
import java.util.ArrayList;

public class MockPostClient implements PostFeignClient {
    @Override
    public PageOfItems<Post> getPost(int pageNumber, int pageSize) {
        ArrayList<Post> list = new ArrayList<>();

        list.add(new Post(
           1,
           1,
           "image1",
           "descr 1",
           LocalDate.of(2022, 1, 1)
        ));

        list.add(new Post(
                2,
                2,
                "image2",
                "descr 2",
                LocalDate.of(2022, 2, 2)
        ));

        list.add(new Post(
                3,
                3,
                "image3",
                "descr 3",
                LocalDate.of(2022, 3, 3)
        ));

        return new PageOfItems<>(
                list,
                false,
                3
        );
    }

    @Override
    public Post addPost(Post post) {
        return null;
    }
}
