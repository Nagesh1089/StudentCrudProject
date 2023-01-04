package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface ServiceInter
{
	
	public Student createInfo(Student st);
	
	public List<Student> getInfo();
	
	
	public Student updateById(int sid,Student std);
	
	
	public void delStu(int sid);
}
