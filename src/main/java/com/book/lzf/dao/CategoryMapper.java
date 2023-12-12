package com.book.lzf.dao;

import com.book.lzf.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/7 19:16
 * @Description:"类型"对应的数据访问层接口
 */
@Repository
public interface CategoryMapper {

    void insertCategory(Category category);

    int deleteCategory(String id);

    List<Category> selectAllCategory();

    List<Category> selectFirstCategory();

    List<Category> selectSecondCategoryByFirstId(String id);

}
