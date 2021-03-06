package AspectJAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 15 星期二 下午 12:17
 * 描述:
 */
@Component // 定义成 Bean
@Aspect //定义为切面
public class MyAspect {
	@Before("execution(* AspectJAnnotation.UserDao.add(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置增强……" + joinPoint);
	}

	@After("execution(* AspectJAnnotation.UserDao.get(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("最终增强……" + joinPoint);
	}


	/**
	 * 将 net.biancheng.c.dao包下的 UserDao 类中的 get() 方法 定义为一个切点
	 */
	@Pointcut(value = "execution(* AspectJAnnotation.UserDao.get(..))")
	public void pointCut1() {

	}

	/**
	 * 将 net.biancheng.c.dao包下的 UserDao 类中的 delete() 方法 定义为一个切点
	 */
	@Pointcut(value = "execution(* AspectJAnnotation.UserDao.delete(..))")
	public void pointCut2() {

	}

	//使用切入点引用
	@Around("MyAspect.pointCut2()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕增强……1");
		proceedingJoinPoint.proceed();
		System.out.println("环绕增强……2");
	}

	//使用切入点表达式
	@AfterReturning(value = "execution(* AspectJAnnotation.UserDao.modify(..))", returning = "returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("后置返回增强……,方法返回值为：" + returnValue);
	}
}
