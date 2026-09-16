package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee{
	
	private int id;
	private String name;
	private String department;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
public Employee(int id, String name, String department, double salary) {
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
}


public class Test8 {
	public static void main(String[] args) {
	List<Employee> e=Arrays.asList(new Employee(101,"Shoaib","IT",75000),
			new Employee(102,"Manoj","IT",70000),
			new Employee(103,"Rehan","IT",60000),
			new Employee(104,"Shabu","Finance",31000),
			new Employee(105,"Dileep","Finance",15000),
			new Employee(106,"Chetan","Data",13000),
			new Employee(109,"Dhanush","IT",26000),
			new Employee(131,"Varun","Finance",30000));
	
	List<String> r=e.stream().filter(employe->employe.getDepartment().equals("IT"))
			.filter(employe->employe.getSalary()>50000)
			.map(employe->employe.getName())
			.sorted().toList();
		System.out.println(r);
		
	}
}