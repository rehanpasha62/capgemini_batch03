package com.tns.CollectionFramework;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<String> s = new Stack<>();
	
	s.add("rehan");
	s.add("tns");
	s.add("core java");
	s.add("course");
	s.add("stack");
	System.out.println(s);
	
	s.push("foundation");
	System.out.println(s);
	
	s.pop();
	System.out.println(s);
	
	s.peek();
	System.out.println(1);
}
}
