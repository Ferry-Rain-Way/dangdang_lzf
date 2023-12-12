package com.book.lzf.controller;

import com.book.lzf.entity.Category;
import com.book.lzf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 34838
 * @Date: 2023/2/13 20:40
 * @Description:
 */
@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    HttpServletRequest request;
    //类别管理
    @RequestMapping("selectAllCategory")
    public String selectAllCategory(){

        List<Category> categories = categoryService.queryAllCategory();
        request.setAttribute("list",categories);
        return "back/category/show";
    }


    //删除
    // <div class="button" onclick="location.href='${pageContext.request.contextPath }/category/deleteCategoryById?id=${category.id}&levels=${category.levels}' ">删除 &raquo;</div>
    //springboot可以自动将前端传入的数据进行封装categor
    //但要求前端传入的?key=value&key1=value2 中的key与实体类的属性名一致
    @RequestMapping("deleteCategoryById")
    public String deleteCategoryById(Category category){
//        Category category = new Category();
//        String id = request.getParameter("id");
//        category.setId(id);
//        int levels = Integer.parseInt(request.getParameter("levels"));
//        category.setLevels(levels);

        try{
            categoryService.deleteCategoryById(category);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            return "redirect:/category/selectAllCategory";
        }
    }


    //查询二级类别
    @RequestMapping("selectAllFirst")
    public String selectAllFirst(){
        List<Category> categories = categoryService.queryAllFirstCategory();
        request.setAttribute("list",categories);
        return "back/category/add-second";
    }

    //类别提交
    @RequestMapping("addCategory")
    public String categoryCommit(Category category){
        categoryService.addCategory(category);
        return "redirect:/category/selectAllCategory";
    }
}







