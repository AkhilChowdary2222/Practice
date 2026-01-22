package com.klu.model;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 

public class Order {
	 private int OrderId;
	 private String customerName;
	 private int quantity;
	 @Autowired
	 private product product;
	 
	 @Autowired
	  public Order() {
		  this.OrderId=2211;
		  this.customerName="Ram";
		  this.quantity=1;
		  
		  
	  }
	  public void display() {
		  System.out.println("the following are the order details ");
		  System.out.println(" OrderId:"+OrderId) ;
		  System.out.println(" CustomerName:"+customerName) ;
		  System.out.println(" Quantity:"+quantity) ;
		  System.out.println(" ProductId:"+product.getproductId());
		  System.out.println(" ProductName:"+product.getproductName());
		  System.out.println(" ProductPrice:"+product.getPrice());
		  System.out.println(" ProductCategory:"+product.getCategory());

		  
	  }

}
