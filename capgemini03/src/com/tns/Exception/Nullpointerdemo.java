package com.tns.Exception;

public class Nullpointerdemo {

	public static void main(String[] args) {
		String Employeename="Rehan";
		String Department=null;
		String Designation="Developer";
		
		try {
			System.out.println("Employee: "+Employeename);
			System.out.println("Designation: "+Designation.toUpperCase());
			
			System.out.println("Department: "+Department.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("Department information is missing........");
			System.out.println(e);
		}
		System.out.println("Program Continue.........");

	}

}
