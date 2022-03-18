package com.cod;

/**
 * 项目名:  Spring Log4j demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 18 星期五 上午 11:35
 * 描述:
 */
public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
