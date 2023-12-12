package com.book.lzf.service;

import com.book.lzf.entity.Category;

import java.util.List;


/**
 * @Auther: 34838
 * @Date: 2023/2/9 20:40
 * @Description:
 */

public interface CategoryService {
    void addCategory(Category category);
    List<Category> queryAllCategory();
    int deleteCategoryById(Category category) ;
    //查询所有一级类别
    List<Category> queryAllFirstCategory();
}
