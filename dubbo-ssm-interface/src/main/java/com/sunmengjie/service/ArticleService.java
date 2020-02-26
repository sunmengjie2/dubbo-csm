package com.sunmengjie.service;


import com.github.pagehelper.PageInfo;
import com.sunmengjie.pojo.Article;
import com.sunmengjie.pojo.Sun;

public interface ArticleService {

	PageInfo<Article> list(int pageNum, Sun sun);

}
