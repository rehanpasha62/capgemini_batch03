package com.tns.StreamAPI;

import java.util.List;
import java.util.Arrays;
public class Test5 {

	public static void main(String[] args) {
		List<String> p =Arrays.asList("Laptop","Mobile","tablet","keyboard","Go pro","mouse");
		List<String> result = p.stream().limit(3).toList();
		System.out.println("product name: "+result);

	}

}
