package com.tutorialspoint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 项目名:  spring_declarative_transaction_management
 * 开发者:  Administrator
 * 创建于:  2022 三月 17 星期四 上午 12:42
 * 描述:
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setYear(rs.getInt("year"));
		return studentMarks;
	}
}
