package com.tutorialspoint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 项目名:  Spring_JDBC_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 16 星期三 上午 11:56
 * 描述:
 */
public class StudentMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}
}
