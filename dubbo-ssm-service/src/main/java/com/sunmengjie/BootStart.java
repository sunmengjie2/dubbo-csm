package com.sunmengjie;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	
	public static void main(String[] args) throws IOException {
		System.out.println("准备启动.....");
		
		//加载上下文
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		
		//启动环境
		context.start();
		
		//阻塞
		System.in.read();
	}
}
