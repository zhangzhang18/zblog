package com.zblog.service;

import com.zblog.model.Article;

import java.util.List;

/**
 * Created by hadoop01 on 16-11-29.
 */
public interface ArticleService {
    List<Article> getArticle();

    List<Article> getArticleByZcm();
}
