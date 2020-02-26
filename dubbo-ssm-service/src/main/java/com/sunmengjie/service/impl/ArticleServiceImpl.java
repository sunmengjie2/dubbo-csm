package com.sunmengjie.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunmengjie.mapper.ArticleMapper;
import com.sunmengjie.pojo.Article;
import com.sunmengjie.pojo.Sun;
import com.sunmengjie.service.ArticleService;

@Service(interfaceClass = ArticleService.class)
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper articleMapper;
	
	@Override
	public PageInfo<Article> list(int pageNum,Sun sun) {
		PageHelper.startPage(pageNum, 10);
		
		return new PageInfo<Article>(articleMapper.list(sun));
	}
	
}
