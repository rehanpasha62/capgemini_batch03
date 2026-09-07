package com.tns.CollectionFramework;

import java.util.TreeSet;

public class Salarysystem {
public static void main(String[] args) {
	
	TreeSet<Integer> t= new TreeSet<>();
	
	t.add(25000000);
	t.add(25000000);
	t.add(20000);
	t.add(35000000);
	t.add(50000);
	t.add(70000);
	t.add(80000);
	
	System.out.println("Salaries: "+t);
	System.out.println("Total salaries: "+t.size());
	
	System.out.println("contains 50000?"+t.contains(50000));
	
//lowest salary
	
	System.out.println("Lowest salary: "+t.first());
	
	System.out.println(t.last());
	
	//below
	
	System.out.println(t.headSet(50000));
	
	//above
	
	System.out.println(t.tailSet(50000));
	
	//in between 
	
	System.out.println(t.subSet(3000, 60000));
	
	System.out.println(t.isEmpty());
	
	System.out.println(t.size());
}
}
