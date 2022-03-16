package com.tutorialspoint;

import javax.sql.DataSource;
import java.util.List;

/**
 * 项目名:  Spring_programmatic_transaction_management
 * 开发者:  Administrator
 * 创建于:  2022 三月 16 星期三 下午 3:13
 * 描述:
 */
public interface StudentDAO {
	/**
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource ds);

	/**
	 * This is the method to be used to create
	 * a record in the Student and Marks tables.
	 */
	public void create(String name, Integer age, Integer marks, Integer year);

	/**
	 * This is the method to be used to list down
	 * all the records from the Student and Marks tables.
	 */
	public List<StudentMarks> listStudents();
}
