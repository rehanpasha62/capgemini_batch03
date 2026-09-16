package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("rahul","priya","dileep","manoj");
		List<String> uppernames = names.stream().map(name->name.toUpperCase()).toList();
		System.out.println("all converted: "+uppernames);
	}
}