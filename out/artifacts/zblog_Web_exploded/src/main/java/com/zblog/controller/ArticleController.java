package com.zblog.controller;

import com.zblog.model.Article;
import com.zblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hadoop01 on 16-11-29.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/list.do")
    public ModelAndView show(){
        List<Article> articles=articleService.getArticle();
        ModelAndView mav = new ModelAndView("article/article");
        mav.addObject("articles",articles);
        return mav;
    }
    @RequestMapping("/zcmarticle.do")
    public ModelAndView zcm(){
        List<Article> articles=articleService.getArticleByZcm();
        ModelAndView mav = new ModelAndView("article/article");
        mav.addObject("articles",articles);
        return mav;
    }



}
