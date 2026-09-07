package com.tns.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String> p = new ArrayList<>();
	
	
	p.add("Laptop");
	p.add(null);
	p.add("Headphones");
	p.add("Mobile");
	p.add("Headphones");
	p.add("Headphones");
	p.add("Headphones");
	p.add("Headphones");
	p.add("Headphones");
	
	System.out.println(p);
	
	System.out.println("Product 1: "+p.get(1));
	
	System.out.println("contains Mobile ?"+p.contains("Mobile"));
	
	System.out.println(p.size());
	
	p.remove("Headphones");
	
	System.out.println(p);
	
	for(String i:p) {
		System.out.println(i);
	}
}
}
