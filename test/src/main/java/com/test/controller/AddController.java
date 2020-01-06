package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Employee;

@RestController
@RequestMapping("/GetEmp")
public class AddController {

	@GetMapping("/List")
	public List<Employee> getEmployee(){
		
		List<Employee> eList=new ArrayList<Employee>();
		
		Employee e1= new Employee("Pooja",1,20.00);
		Employee e2= new Employee("Shri",1,20.00);
		
		eList.add(e1);
		eList.add(e2);
		
		return eList;
	}
}
