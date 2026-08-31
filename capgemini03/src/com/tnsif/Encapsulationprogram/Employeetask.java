package com.tnsif.Encapsulationprogram;


class Employee{
	
	// Private data members
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	//Parameterized Consturctor
	
	Employee(int employeeId,String employeeName,double salary,String department) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.department=department;
	}
	
	//getter() and setter()
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeid) {
		this.employeeId = employeeid;
	}
	public String getEmployeename() {
		return employeeName;
	}
	
	public void setEmployeename(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	 // Method to  increase salary
	
	public void incresesalary(double percentage) {
		if(percentage>0) {
			salary=salary+(salary*percentage/100);
		}
	}
	
		//Display employee details
		
		public void displayEmployeeDetails() {
			System.out.println("EmployeeId :"+employeeId);
			System.out.println("EmployeeName :"+employeeName);
			System.out.println("Department :"+department);
			System.out.println("Salary :"+salary);
			System.out.println();
		}
}

public class Employeetask {
	public static void main(String[] args) {
		
		//Creating objects using constructor
		
		Employee emp1=new Employee(101,"Rahul",40000,"IT");
		Employee emp2=new Employee(102,"Priya",35000,"HR");
		
		System.out.println("Employee Details; ");
		System.out.println();
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
		//Increase Rahul's salary by 10%
		
		emp1.incresesalary(10);
		System.out.println("After Salary increase");
		System.out.println();
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
	}
}