package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class test7 {

	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(30000,5000,40000,15000,25000,9000,7900,80000,45000);
		boolean r=s.stream().filter(salary->salary>10000).anyMatch(salary->salary>10000);
		System.out.println("salary found: "+r);

	}

}
