package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Product{
	private int productid;
	private String productname;
	private int price;
	
	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = (int) price;
	}

public Product(int productid, String name, int price ) {
	this.productid=productid;
	this.price=price;
	this.productname=productname;
	
}
	
}
public class ProductDemo {

	public static void main(String[] args) {
		List<Product> l = Arrays.asList(new Product(1001,"Boat Eardopes",1200),
				new Product(1002,"realme buds wireless",1700),
				new Product(1003,"boult watch",1500),
				new Product(1004,"apple iphone 16",150000),
				new Product(1005,"ugrow capital pen",99));
		Optional<String> p= l.stream().findAny();
		

}
}
