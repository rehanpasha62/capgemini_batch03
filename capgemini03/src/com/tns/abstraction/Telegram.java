package com.tns.abstraction;

abstract class Message{
	abstract void sendmoviename(String name);
	
}
class Movie extends Message{

	@Override
	void sendmoviename(String name) {
		String movie="Fast and Furious";
		System.out.println("sending movie");
		System.out.println("here"+movie);
		
	}
	
}
public class Telegram {
public static void main(String[] args) {
	moviename m = new movie
}
}
