package com.zzr.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.zzr.bean.Student;

@MapperScan()
public interface StudentDao {
	
	void insert(Student stu);
	
	Student findStudentById(Integer id);
}
