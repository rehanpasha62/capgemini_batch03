package com.tns.abstraction;

abstract class Delivery{
	//abstarct method
	abstract double calculatecharge(double distance);
	//concrete method
	void showDeliverType() {
		System.out.println("delivery service selected");
	}
}
class BikeDelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
	
}
class DroneDelivery extends Delivery{


@Override
double calculatecharge(double distance) {
	// TODO Auto-generated method stub
	return distance*20;
}
}
public class Abstractiondemo {
public static void main(String[] args) {
	BikeDelivery b= new BikeDelivery();
		System.out.println("bike charge:"+b.calculatecharge(5));
		
	DroneDelivery d = new DroneDelivery();
	System.out.println("drone charge"+d.calculatecharge(5));
}
}