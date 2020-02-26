package com.sunmengjie.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.sunmengjie.pojo.Article;
import com.sunmengjie.pojo.Sun;
import com.sunmengjie.service.ArticleService;

@Controller
public class ArticleController {

	@Reference(url="dubbo://127.0.0.1:20881")
	ArticleService articleService;

	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int pageNum,Model model, Sun sun){
		
		
		PageInfo<Article> pageInfo = articleService.list(pageNum,sun);
		
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("sun", sun);
		
		
		return "list";
	}
	
}
