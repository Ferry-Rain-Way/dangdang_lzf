package com.book.lzf.entity;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * @Auther: 34838
 * @Date: 2023/2/7 19:28
 * @Description:Category实体类
 */
public class Category implements Serializable {
    private String id;
    private String name;
    private String parentId;
    private Integer levels;
    private Category first;
    private List<Category> categories;

    //无参构造
    public Category() {
    }
    //习惯写一个除了主键外的构造方法
    public Category(String name, String parentId, Integer levels, Category first, List<Category> categories) {
        this.name = name;
        this.parentId = parentId;
        this.levels = levels;
        this.first = first;
        this.categories = categories;
    }

    public Category(String id, String name, Integer levels) {
        this.id = id;
        this.name = name;
        this.levels = levels;
    }

    //全参构造
    public Category(String id, String name, String parentId, Integer levels, Category first, List<Category> categories) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.levels = levels;
        this.first = first;
        this.categories = categories;
    }
    //get、set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Category getFirst() {
        return first;
    }

    public void setFirst(Category first) {
        this.first = first;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Category.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("parentId='" + parentId + "'")
                .add("levels=" + levels)
                .add("first=" + first)
                .add("categories=" + categories)
                .toString();
    }


    public String toJson() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"parentId\":\"")
                .append(parentId).append('\"');
        sb.append(",\"levels\":")
                .append(levels);
        sb.append(",\"first\":")
                .append(first);
        sb.append(",\"categories\":")
                .append(categories);
        sb.append('}');
        return sb.toString();
    }
}
