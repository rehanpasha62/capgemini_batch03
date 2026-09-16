package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(20,80,90,56,62);
		n.stream().sorted().forEach(number->System.out.println(number));

	}

}
