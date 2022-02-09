package com.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 项目名:  untitled
 * 开发者:  Administrator
 * 创建于:  2022 二月 06 星期日 21:05
 * 描述:
 */
@Data
public class Student implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    private String specialty;

    private String grade;

    private static final long serialVersionUID = 1L;
}