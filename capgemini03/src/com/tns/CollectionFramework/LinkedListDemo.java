package com.tns.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<String> h = new LinkedList();
	
	h.add("google");
	h.add("youtube");
	h.add("github");
	h.add("python");
	h.add("java");
	
	System.out.println(h);
	
	h.addFirst("sql");
	h.addLast("postgreaql");
	//view first without removing
	
	System.out.println("First: "+h.peekFirst());
	//remove first
	
	System.out.println("removed: "+h.pollFirst());
	System.out.println(h);
}
}
