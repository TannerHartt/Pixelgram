package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Services.PostUIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PostUIServiceIT {
    @Autowired
    PostUIService service;

    @Test
    public void test() {
        System.out.println(service.getPostPage(1, 3));
    }
}
