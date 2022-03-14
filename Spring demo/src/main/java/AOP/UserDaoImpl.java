package AOP;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 14 星期一 上午 9:56
 * 描述:
 */
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("正在执行 UserDao 的 add() 方法……");
	}

	@Override
	public void delete() {
		System.out.println("正在执行 UserDao 的 delete() 方法……");
	}

	@Override
	public void modify() {
		System.out.println("正在执行 UserDao 的 modify() 方法……");
	}

	@Override
	public void get() {
		System.out.println("正在执行 UserDao 的 get() 方法……");
	}
}
