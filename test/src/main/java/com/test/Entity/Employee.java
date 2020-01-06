package com.test.Entity;

public class Employee {

	private String name;
	private Integer eid;
	private Double salary;
	
	public Employee(){}

	public Employee(String name, Integer eid, Double salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
