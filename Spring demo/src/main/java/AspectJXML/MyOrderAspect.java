package AspectJXML;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 15 星期二 上午 10:59
 * 描述:
 */
public class MyOrderAspect {

	public void before() {
		System.out.println("前置增强……");
	}

	public void after() {
		System.out.println("最终增强……");
	}

	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕增强---前……");
		proceedingJoinPoint.proceed();
		System.out.println("环绕增强---后……");
	}

	public void afterThrow(Throwable exception) {
		System.out.println("异常增强…… 异常信息为：" + exception.getMessage());
	}

	public void afterReturning(Object returnValue) {
		System.out.println("后置返回增强…… 方法返回值为：" + returnValue);
	}
}
