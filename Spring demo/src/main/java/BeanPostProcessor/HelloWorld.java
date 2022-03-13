package BeanPostProcessor;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 2:57
 * 描述:
 */
public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Message : " + message);
	}

	public void init() {
		System.out.println("Bean 正在初始化");
	}

	public void destroy() {
		System.out.println("Bean 将要被销毁");
	}
}
