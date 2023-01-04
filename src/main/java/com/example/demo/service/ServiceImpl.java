package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.repository.MyRepository;

@Service
public class ServiceImpl implements ServiceInter
{
	@Autowired
	MyRepository repo;
	
	public Student createInfo(Student st)
	{
		// TODO Auto-generated method stub
		
		
		return repo.save(st);
	}

	
	public List<Student>getInfo() 
	{
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}


	@Override
	public Student updateById(int sid,Student std) 
	{
		// TODO Auto-generated method stub
		
		Student Oldstd=repo.getById(sid);
		Oldstd.setBranch(std.getBranch());
		Oldstd.setFname(std.getFname());
		Oldstd.setLname(std.getLname());
		
		
		return repo.save(Oldstd);
	}


	@Override
	public void delStu(int sid)
	{
		// TODO Auto-generated method stub
		repo.deleteById(sid);
		
		
	}
	
	
	
	
	
	
	
	

}
