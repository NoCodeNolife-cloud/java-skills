package com.cod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;
/**
 * 项目名:  Spring Log4j demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 18 星期五 上午 11:38
 * 描述:
 */
public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		log.info("Going to create HelloWorld Obj");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		log.info("Exiting the program");
	}
}
