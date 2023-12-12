package com.book.lzf.service.impl;

import com.book.lzf.dao.CategoryMapper;
import com.book.lzf.entity.Category;
import com.book.lzf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Auther: 34838
 * @Date: 2023/2/9 20:39
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public void addCategory(Category category) {
        //设置UUID
        category.setId(UUID.randomUUID().toString());
        categoryMapper.insertCategory(category);
    }

    @Override
    public List<Category> queryAllCategory() {
        return categoryMapper.selectAllCategory();
    }


    @Override
    public int deleteCategoryById(Category category) {
        //判断是否为一级,且二级存在下属二级类别
        //若是二级类别直接删除
        if (category.getLevels()==1) {
            List<Category> categories = categoryMapper.selectSecondCategoryByFirstId(category.getId());
            if (categories.size()!=0) {
                System.out.println(categories.size());
                throw new RuntimeException("一级类别占用,无法删除");
            }
        }

        categoryMapper.deleteCategory(category.getId());

        if (category.getLevels()==2) {

        }


        return 0;
    }

    @Override
    public List<Category> queryAllFirstCategory() {
        return categoryMapper.selectFirstCategory();
    }

}
