package com.cognizant.capybarasfems.ServiceTests;

import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.PostUI;
import com.cognizant.capybarasfems.Services.PostUIService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostUIServiceTest {
    PostUIService service;

    @BeforeEach
    public void setup() {
        service = new PostUIService(new MockPostClient());
    }

    @Test
    public void getPostPage_positive() {
        PageOfItems<PostUI> result = service.getPostPage(1, 5);

        Assertions.assertEquals("image1", result.getItems().get(0).getPost().getImg());
        Assertions.assertEquals("descr 2", result.getItems().get(1).getPost().getDescription());
        Assertions.assertEquals(3, result.getItems().get(2).getPost().getId());
        Assertions.assertNull(result.getItems().get(0).getComments());
        Assertions.assertEquals(3, result.getTotalElements());
    }
}
