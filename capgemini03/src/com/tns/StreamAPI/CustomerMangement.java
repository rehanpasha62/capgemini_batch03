package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	
	public Customer(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
}
	
public class CustomerMangement {

	public static void main(String[] args) {
		List<Customer> c = Arrays.asList(new Customer ("Manish","bangalore"),
				new Customer ("uday","hyd"),
				new Customer ("ajay","belgavi"),
				new Customer ("vidhya","mumbai"),
				new Customer ("roshni","dubai"),
				new Customer ("rani","bangalore"),
				new Customer ("sameer","bangalore"));
		c.stream().filter(c1->c1.getCity().equals("bangalore")).forEach(c1->System.out.println(c1.getName()+" "+c1.getCity()));
				
				

	}

}
