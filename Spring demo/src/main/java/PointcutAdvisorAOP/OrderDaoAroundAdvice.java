package PointcutAdvisorAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 14 星期一 上午 11:43
 * 描述:
 */
public class OrderDaoAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("环绕增强前********");
		//执行被代理对象中的逻辑
		Object result = methodInvocation.proceed();
		System.out.println("环绕增强后********");
		return result;
	}
}