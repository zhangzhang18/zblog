package com.zblog.service.impl;

import com.zblog.dao.ArticleMapper;
import com.zblog.model.Article;
import com.zblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hadoop01 on 16-11-29.
 */
@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public List<Article> getArticle() {
        return articleMapper.getArticle();
    }

    public List<Article> getArticleByZcm() {
        return articleMapper.getArticleByZcm();
    }
}
