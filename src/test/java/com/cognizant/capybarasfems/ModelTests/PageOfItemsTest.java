package com.cognizant.capybarasfems.ModelTests;

import com.cognizant.capybarasfems.Models.Comment;
import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PageOfItemsTest {

    PageOfItems<Post> pageOfItems;
    List<Post> items = new ArrayList<>();


    @BeforeEach
    public void setup() {
        pageOfItems = new PageOfItems<Post>(items, true, 20);
    }

    @Test
    public void testConstructorAndGetters() {
        pageOfItems = new PageOfItems<>(
                new ArrayList<>(),
                true,
                20

        );

        Assertions.assertEquals(new ArrayList<>(), pageOfItems.getItems());
        Assertions.assertEquals(true, pageOfItems.isHasNext());
        Assertions.assertEquals(20, pageOfItems.getTotalElements());

    }


    @Test
    public void setItems() {
        pageOfItems.setItems(new ArrayList<>());
        Assertions.assertEquals(new ArrayList<>(), pageOfItems.getItems());
    }

    @Test
    public void testSetPostId() {
        pageOfItems.setHasNext(true);
        Assertions.assertEquals(true, pageOfItems.isHasNext());
    }

    @Test
    public void testSetTotalElements() {
        pageOfItems.setTotalElements(20);
        Assertions.assertEquals(20, pageOfItems.getTotalElements());
    }
}

