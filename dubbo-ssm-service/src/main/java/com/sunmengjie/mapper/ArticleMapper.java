package com.sunmengjie.mapper;

import java.util.List;

import com.sunmengjie.pojo.Article;
import com.sunmengjie.pojo.Sun;

public interface ArticleMapper {

	List<Article> list(Sun sun);

}
