package AnnotationAutowiring;

import org.springframework.stereotype.Repository;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 9:31
 * 描述:
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Override
	public void print() {
		System.out.println("C语言中文网");
	}
}