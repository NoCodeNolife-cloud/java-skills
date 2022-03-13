package AnnotationAutowiring;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 13 星期日 下午 9:34
 * 描述:
 */
@Controller("userController")
public class UserController {
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void doStr() {
		userService.out();
		System.out.println("专注于分享优质编程教程。");
	}

}
