package AspectJAnnotation;

import org.springframework.stereotype.Component;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 15 星期二 下午 12:16
 * 描述:
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("正在执行 UserDao 的 add 方法");
	}

	@Override
	public void delete() {
		System.out.println("正在执行 UserDao 的 delete 方法");
	}

	@Override
	public int modify() {
		System.out.println("正在执行 UserDao 的 modify 方法");
		return 1;
	}

	@Override
	public void get() {
		System.out.println("正在执行 UserDao 的 get 方法");
	}
}
