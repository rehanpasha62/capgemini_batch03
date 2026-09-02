package com.tns.MultiThreadingProgarms;

class Whatps implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse id:"+""+Thread.currentThread().getId());
		}
	}
}
public class ImplementingRunnable {
public static void main(String[] args) {
	
	Whatps w = new Whatps();
	Thread obj = new Thread(w);
	obj.start();
	System.out.println("main id"+""+Thread.currentThread().getId());
}
}
