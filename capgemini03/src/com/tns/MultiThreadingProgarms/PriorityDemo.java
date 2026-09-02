package com.tns.MultiThreadingProgarms;

class MyTask extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getId());
	}
}

public class PriorityDemo {
public static void main(String[] args) {
	MyTask t1 = new MyTask();
	MyTask t2 = new MyTask();
	MyTask t3 =new MyTask();
	
	t1.setName("Background task");
	t2.setName("Normal Task");
	t3.setName("Important Task");
	
	t1.setPriority(1);
	t2.setPriority(5);
	t3.setPriority(10);
	
	t1.start();
	t2.start();
	t3.start();
}
}
