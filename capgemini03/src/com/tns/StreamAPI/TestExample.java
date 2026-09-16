package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		List<Integer> no = Arrays.asList(5,10,15,20,25,30,35,40,45,50,98,10);
		no.stream().filter(n->n%5==0).forEach(System.out::println);
	}

}