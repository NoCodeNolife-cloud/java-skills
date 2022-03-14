package PointcutAdvisorAOP;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 14 星期一 上午 11:38
 * 描述:
 */
public class OrderDao {

	public void add() {
		System.out.println("正在执行 UserDao 的 add() 方法……");
	}

	public void adds() {
		System.out.println("正在执行 UserDao 的 adds() 方法……");
	}

	public void delete() {
		System.out.println("正在执行 UserDao 的 delete() 方法……");
	}

	public void modify() {
		System.out.println("正在执行 UserDao 的 modify() 方法……");
	}

	public void get() {
		System.out.println("正在执行 UserDao 的 get() 方法……");
	}
}
