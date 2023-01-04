package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.ServiceImpl;

@Controller
@RequestMapping("req")
public class MyController 
{
	@Autowired
	ServiceImpl service;
	@PostMapping("cre")
	public Student createStd(@RequestBody Student st )
	{
		
		return service.createInfo(st);
	}
	
	@GetMapping("get")
	public List<Student>getInfo()
	{
		return service.getInfo();
	}
	
	@PutMapping("putvalue/{id}")
	public Student updateById(@PathVariable int id,@RequestBody Student std)
	{
		return service.updateById(id, std);
	}
	
	@DeleteMapping("delete/{id}")
	public List<Student>delstd(@PathVariable int id)
	{
		service.delStu(id);
		
		return service.getInfo();
	}
	
	
	
	
	
	
}
