package com.tns.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book{
	String Category;
	int Price;
	public Book(String category, int price) {
		super();
		Category = category;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [Category=" + Category + ", Price=" + Price + "]";
	}
}
class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//first sort by category
		int result=o1.Category.compareTo(o2.Category);
		//if category is same , sort by price
		if(result==0) {
			result=o1.Price-o2.Price;
		}
		return result;
	}	
}
public class Comparator2Demo {
public static void main(String[] args) {
	List<Book> p=new ArrayList<>();
	p.add(new Book("Java",500));
	p.add(new Book("Python",300));
	p.add(new Book("Java",250));
	p.add(new Book("Python",450));
	p.add(new Book("C++",400));
	
	Collections.sort(p,new BookComparator());
	System.out.println(p);
	
}
}