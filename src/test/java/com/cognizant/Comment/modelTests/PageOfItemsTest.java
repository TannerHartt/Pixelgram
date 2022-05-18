package com.cognizant.Comment.modelTests;

import com.cognizant.Comment.models.PageOfItems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PageOfItemsTest<T> {

    PageOfItems<Integer> page;

    @BeforeEach
    public void Setup() {
        page = new PageOfItems<Integer>();
    }

    @Test
    public void ConstructorTest_positive() {
        List<Integer> list = new ArrayList<>();
        page = new PageOfItems<Integer>(list, false, 3);
        Assertions.assertEquals(list, page.getItems());
        Assertions.assertFalse(page.isHasNext());
        Assertions.assertEquals(page.getTotalElements(), 3);
    }
    @Test
    public void ItemsSetterTest_positive() {
        List<Integer> list = new ArrayList<>();
        page.setItems(list);
        Assertions.assertEquals(list, page.getItems());
    }

    @Test
    public void hasNextTest() {
        page.setHasNext(true);
        Assertions.assertTrue(page.isHasNext());
    }

    @Test
    public void totalElementsTest() {
        page.setTotalElements(5);
        Assertions.assertEquals(page.getTotalElements(), 5);
    }
}
