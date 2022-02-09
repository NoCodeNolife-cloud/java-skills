package com.mapper;

import com.domain.Student;

/**
 * 项目名:  mybatis
 * 开发者:  Administrator
 * 创建于:  2022 二月 06 星期日 22:07
 * 描述: 
*/
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}