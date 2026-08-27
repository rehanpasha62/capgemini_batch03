package com.tns.abstraction;

abstract class Notification{
	abstract void sendMessage(String message);
}
class EmailNotification extends Notification{

	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		String email="rehanapsha62p@gmail.com";
		System.out.println("sending email.....");
		System.out.println("to:"+email);
		System.out.println("message"+message);
		int messagelength=message.length();
		System.out.println("message length:"+messagelength);
	}
	
}
public class Notificationdemo {

	public static void main(String[] args) {
		EmailNotification e= new EmailNotification();
		e.sendMessage("your project is approved");
	}
	
}
