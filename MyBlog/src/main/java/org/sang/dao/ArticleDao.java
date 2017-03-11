package org.sang.dao;


import org.apache.ibatis.annotations.Param;
import org.sang.entity.Article;
import org.sang.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 17-3-10.
 */
@Repository
public interface ArticleDao {
    public Article getArticleById(@Param("id") Long id);

    public List<Article> getFirst10Article();

    public List<Article> getArticlesByCategoryName(Long categoryId);

    public List<Category> getCategories();

    public void writeBlog(Article article);

    public Long getCategoryIdByName(String name);

    public void deleteArticleById(Long id);

    public void updateArticleById(Article article);

    public Category getCategoryById(Long id);
}
