import AnnotationAutowiring.UserController;
import AutoWiring.Employee;
import BeanPostProcessor.HelloWorld;
import C.CEmployee;
import CascadingAttributeAssignment.ExampleBean;
import Collections.JavaCollection;
import Constructor.ContructorStudent;
import InnerConstructor.InnerConstructorEmployee;
import InnerSetter.InnerSetterEmployee;
import LifeCycleBean.LifeCycleBean;
import P.PEmployee;
import PrototypeBean.PrototypeBean;
import RefCollections.RefJavaCollection;
import Setter.SetterStudent;
import Singleton.SingletonBean;
import SpringBeanInheritance.Dog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 10 星期四 下午 2:38
 * 描述:
 */
public class MainApp {
	private static final Log LOGGER = LogFactory.getLog(MainApp.class);

	public static void main(String[] args) {
		//获取 ApplicationContext 容器
		ApplicationContext contructorcontext = new ClassPathXmlApplicationContext("constructorBeans.xml");
		//获取名为 student 的 Bean
		ContructorStudent constructorstudent = contructorcontext.getBean("student", ContructorStudent.class);
		//通过日志打印学生信息
		LOGGER.info(constructorstudent.toString());

		//获取 ApplicationContext 容器
		ApplicationContext settercontext = new ClassPathXmlApplicationContext("setterBeans.xml");
		//获取名为 student 的 Bean
		SetterStudent setterstudent = settercontext.getBean("student", SetterStudent.class);
		//通过日志打印学生信息
		LOGGER.info(setterstudent.toString());

		//获取 ApplicationContext 容器
		ApplicationContext pcontext = new ClassPathXmlApplicationContext("PBeans.xml");
		//获取名为 employee 的 Bean
		PEmployee pemployee = pcontext.getBean("employee", PEmployee.class);
		//通过日志打印信息
		LOGGER.info(pemployee.toString());

		//获取 ApplicationContext 容器
		ApplicationContext ccontext = new ClassPathXmlApplicationContext("CBeans.xml");
		//获取名为 employee 的 Bean
		CEmployee cemployee = ccontext.getBean("employee", CEmployee.class);
		//通过日志打印信息
		LOGGER.info(cemployee.toString());

		//获取 ApplicationContext 容器
		ApplicationContext innercontext = new ClassPathXmlApplicationContext("InnerSetterBeans.xml");
		//获取名为 employee 的 Bean
		InnerSetterEmployee inneremployee = innercontext.getBean("employee", InnerSetterEmployee.class);
		//通过日志打印员工信息
		LOGGER.info(inneremployee.toString());

		//获取 ApplicationContext 容器
		ApplicationContext innerconstructorcontext = new ClassPathXmlApplicationContext("InnerConstructorBeans.xml");
		//获取名为 employee 的 Bean
		InnerConstructorEmployee innerconstructoremployee = innerconstructorcontext.getBean("employee", InnerConstructorEmployee.class);
		//通过日志打印员工信息
		LOGGER.info(innerconstructoremployee.toString());

		//获取 ApplicationContext 容器
		ApplicationContext collectionscontext = new ClassPathXmlApplicationContext("CollectionsBeans.xml");
		//获取名为 employee 的 Bean
		JavaCollection javaCollection = collectionscontext.getBean("javaCollection", JavaCollection.class);
		//通过日志打印员工信息
		LOGGER.info(javaCollection.toString());

		//获取 ApplicationContext 容器
		ApplicationContext refcollectionscontext = new ClassPathXmlApplicationContext("RefCollectionsBeans.xml");
		//获取名为 employee 的 Bean
		RefJavaCollection refjavaCollection = refcollectionscontext.getBean("javaCollection", RefJavaCollection.class);
		//通过日志打印员工信息
		LOGGER.info(refjavaCollection.toString());

		//获取 ApplicationContext 容器
		ApplicationContext nullapplicationContext = new ClassPathXmlApplicationContext("NullBeans.xml");
		//获取名为 employee 的 Bean
		NullExample nullExample = nullapplicationContext.getBean("exampleBean", NullExample.class);
		//通过日志打印员工信息
		LOGGER.info(nullExample.toString());

		//获取 ApplicationContext 容器
		ApplicationContext cascadingAttributeAssignmentContext = new ClassPathXmlApplicationContext("CascadingAttributeAssignmentBeans.xml");
		//获取名为 employee 的 Bean
		ExampleBean cascadingAttributeAssignmentExample = cascadingAttributeAssignmentContext.getBean("exampleBean", ExampleBean.class);
		//通过日志打印员工信息
		LOGGER.info(cascadingAttributeAssignmentExample.toString());

		//单例测试
		//获取 ApplicationContext 容器
		ApplicationContext singletoncontext = new ClassPathXmlApplicationContext("SingletonBeans.xml");
		SingletonBean singletonBean = singletoncontext.getBean("singletonBean", SingletonBean.class);
		SingletonBean singletonBean2 = singletoncontext.getBean("singletonBean", SingletonBean.class);
		System.out.println(singletonBean);
		System.out.println(singletonBean2);

		//原型测试
		//获取 ApplicationContext 容器
		ApplicationContext prototypecontext = new ClassPathXmlApplicationContext("PrototypeBeans.xml");
		PrototypeBean prototypeBean = prototypecontext.getBean("prototypeBean", PrototypeBean.class);
		PrototypeBean prototypeBean2 = prototypecontext.getBean("prototypeBean", PrototypeBean.class);
		System.out.println(prototypeBean);
		System.out.println(prototypeBean2);

		//获取 ClassPathXmlApplicationContext 容器
		ClassPathXmlApplicationContext lifecyclecontext = new ClassPathXmlApplicationContext("LifeCycleBeans.xml");
		LifeCycleBean lifeCycleBean = lifecyclecontext.getBean("lifeCycleBean", LifeCycleBean.class);
		LOGGER.info(lifeCycleBean);
		//手动销毁 Bean
		lifecyclecontext.close();

		AbstractApplicationContext postprocessorcontext = new ClassPathXmlApplicationContext("BeanPostProcessorBeans.xml");
		HelloWorld obj = (HelloWorld) postprocessorcontext.getBean("helloWorld");
		obj.getMessage();
		postprocessorcontext.registerShutdownHook();

		//获取 ClassPathXmlApplicationContext 容器
		ApplicationContext springbeaninheriancecontext = new ClassPathXmlApplicationContext("SpringBeanInheritance.xml");
		Dog dog = springbeaninheriancecontext.getBean("dog", Dog.class);
		System.out.println(dog);

		//byName
		ApplicationContext bynameapplicationContext = new ClassPathXmlApplicationContext("autowire/byName.xml");
		Employee bynameemployee = bynameapplicationContext.getBean("employee", Employee.class);
		System.out.println(bynameemployee);

		//byName
		ApplicationContext bytypeapplicationContext = new ClassPathXmlApplicationContext("autowire/byType.xml");
		Employee bytypeemployee = bytypeapplicationContext.getBean("employee", Employee.class);
		System.out.println(bytypeemployee);

		//byconstructor
		ApplicationContext byconstructorContext = new ClassPathXmlApplicationContext("autowire/constructor.xml");
		Employee byconstructoremployee = byconstructorContext.getBean("employee", Employee.class);
		System.out.println(byconstructoremployee);

		//byconstructor
		ApplicationContext annotationautowiringContext = new ClassPathXmlApplicationContext("AnnotationAutowiringBeans.xml");
		UserController annotationautowiringusercontroller = annotationautowiringContext.getBean("userController", UserController.class);
		annotationautowiringusercontroller.doStr();
	}
}