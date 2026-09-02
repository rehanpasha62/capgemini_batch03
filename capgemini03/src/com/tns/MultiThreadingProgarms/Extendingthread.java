package com.tns.MultiThreadingProgarms;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse id:"+""+Thread.currentThread().getId());
	}
}

class Onenote extends Thread{
	public void run() {
		System.out.println("onenote id:"+""+Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("chrome id: "+""+Thread.currentThread().getId() );
	}
}

public class Extendingthread {
public static void main(String[] args) {
	Eclipse e = new Eclipse();
	e.start();
	Onenote n = new Onenote();
	n.start();
	
	Chrome c = new Chrome();
	c.start();
	
	for(int i=0;i<5;i++) {
		System.out.println("Main method thread id"+""+Thread.currentThread().getId());
	}
}
}