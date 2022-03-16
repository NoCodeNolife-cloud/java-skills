package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名:  spring_declarative_transaction_management
 * 开发者:  Administrator
 * 创建于:  2022 三月 17 星期四 上午 12:44
 * 描述:
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAO studentJDBCTemplate =
				(StudentDAO) context.getBean("studentJDBCTemplate");
		System.out.println("------Records creation--------");
		studentJDBCTemplate.create("Zara", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha", 20, 97, 2010);
		studentJDBCTemplate.create("Ayan", 25, 100, 2011);
		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}
}
