package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List <Integer> a = Arrays.asList(10,3,46,7,78,989,235,54,78,300,2,23,1,56,2,4,10);
		long count = a.stream().distinct().count();
		System.out.println("unique values: "+count);

	}

}
