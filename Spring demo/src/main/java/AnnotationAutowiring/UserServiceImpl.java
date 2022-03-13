package AnnotationAutowiring;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 9:32
 * 描述:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void out() {
		userDao.print();
		System.out.println("一个精美而实用的网站");
	}
}
