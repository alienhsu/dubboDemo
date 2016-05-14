package com.alienhsu.ConsumerDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alienhsu.dubboDemoInterface.DemoService;

public class Consumer {
	public static void main(String[] args) {
		String path = "file:"+System.getProperty("user.dir")+"/src/main/resources/dubboConsumer.xml";
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);  
	        context.start();  
	        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理  
	        String hello = demoService.sayHello("world"); // 执行远程方法 
	        System.out.println(hello);  

	}
}
