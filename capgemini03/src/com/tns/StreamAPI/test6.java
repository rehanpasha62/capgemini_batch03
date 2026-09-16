package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class test6 {

	public static void main(String[] args) {
		List<String> p1= Arrays.asList("apple","mango","orange","banana");
		Optional <String> r =p1.stream().skip(2).findFirst();
		System.out.println(r.orElse("product not found"));

	}

}
