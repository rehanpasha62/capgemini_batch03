package com.tnsif.Interfacedemo;

interface OrderService{
	boolean validateorder(double amount);
	void processpayment(double amount);
	void generateInvoice(String orderId, double amount);
	void updateOrderStatus(String orderId, String status);
}

class Onlineorder implements OrderService{

	private String customername;
	private String orderid;
	
	public Onlineorder(String customername, String orderid) {
		super();
		this.customername= customername;
		this.orderid= orderid;
		
	}
	@Override
	public boolean validateorder(double amount) {
		if(amount>0) {
			System.out.println("order validation successfull");
		return true;
	}
		System.out.println("invalid order amount");
		return false;
	}
    
	@Override
	public void processpayment(double amount) {
		System.out.println("procession payment: "+amount);
		System.out.println("payment successful");
		
	}

	@Override
	public void generateInvoice(String orderId, double amount) {
		System.out.println("invoice generated");
		System.out.println("orderid: "+orderId);
		System.out.println("Customer name: "+customername);
		System.out.println("Amount: "+amount);
		
	}

	@Override
	public void updateOrderStatus(String orderId, String status) {
		System.out.println("order"+orderId+"status updated to :"+status);
		
	}
	
}

public class Mainmethod {
public static void main(String[] args) {
	Onlineorder o = new Onlineorder("Ruth","ORD1001");
	double amount=1000;
	if(o.validateorder(amount)) {
		o.processpayment(amount);
		o.generateInvoice("ORD1001", amount);
		o.updateOrderStatus("ORD1001", "confirmed");
	}
}
}
