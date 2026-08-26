package com.tnsif.Encapsulationprogram;

class Product{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0) {
		this.price = price;
	}
	else {
		System.out.println("invalid price");
	}
	
}

public class Productmain {
public static void main(String[] args) {
	Product p=new Product();
	p.setPrice(25000);
	System.out.println("product price "+p.getPrice());
	p.setPrice(-600);
}
}
}