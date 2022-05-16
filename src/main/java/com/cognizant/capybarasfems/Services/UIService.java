package com.cognizant.capybarasfems.Services;

import com.cognizant.capybarasfems.Models.PageOfItems;
import com.cognizant.capybarasfems.Models.PostUI;

public interface UIService {
    PageOfItems<PostUI> getPostPage(int pageNumber, int pageSize);
}
