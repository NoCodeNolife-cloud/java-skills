package AspectJAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 15 星期二 下午 12:16
 * 描述:
 */
@Configuration
@ComponentScan(basePackages = "AspectJAnnotation") //注解扫描
@EnableAspectJAutoProxy //开启 AspectJ 的自动代理
public class AppConfig {
}
