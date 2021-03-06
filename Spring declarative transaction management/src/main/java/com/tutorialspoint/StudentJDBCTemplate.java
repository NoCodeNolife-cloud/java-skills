package com.tutorialspoint;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * 项目名:  spring_declarative_transaction_management
 * 开发者:  Administrator
 * 创建于:  2022 三月 17 星期四 上午 12:43
 * 描述:
 */
public class StudentJDBCTemplate implements StudentDAO {
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(String name, Integer age, Integer marks, Integer year) {
		try {
			String SQL1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplateObject.update(SQL1, name, age);
			// Get the latest student id to be used in Marks table
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplateObject.queryForObject(SQL2, null, Integer.class);
			String SQL3 = "insert into Marks(sid, marks, year) " +
					"values (?, ?, ?)";
			jdbcTemplateObject.update(SQL3, sid, marks, year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			// to simulate the exception.
			throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
	}

	public List<StudentMarks> listStudents() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
				new StudentMarksMapper());
		return studentMarks;
	}
}
