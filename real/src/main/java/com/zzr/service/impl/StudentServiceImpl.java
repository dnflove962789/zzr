package com.zzr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzr.bean.Student;
import com.zzr.dao.StudentDao;
import com.zzr.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao userDao;
	
	public Student getStudent(int id) {
		return userDao.findStudentById(id);
	}

}
