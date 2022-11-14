package com.codegym.blog_sort_page.restcontroller;

import com.codegym.blog_sort_page.models.Blog;
import com.codegym.blog_sort_page.models.BlogDTO;
import com.codegym.blog_sort_page.service.IBlogService;
import com.codegym.blog_sort_page.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class RestControllerBlog {

    final int MAX_DISPLAY = 4;

    @Autowired
    ICategoryService categoryService;

    @Autowired
    IBlogService blogService;


    @GetMapping("")
    public Page<Blog> goList(@RequestParam(value = "name_search", defaultValue = "") String name_search,
                             @PageableDefault(size = MAX_DISPLAY, sort = "name", direction = Sort.Direction.ASC) Pageable pageable) {
        return blogService.findAllByName(name_search, pageable);
    }

}
