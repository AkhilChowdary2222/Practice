
package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class product {

 private int productId;
 private String productName;
 private double price;
 private String category;
 
 
 public product() {
	 this.productId=101;
	 this.productName="Bike";
	 this.price=45000.00;
	 this.category="Electric";
	 
 }
  public int getproductId() {
	  return productId;
  }
  public String getproductName() {
	  return productName;
	  
  }
  public double getPrice() {
	  return price;
	  
  }
  public String getCategory() {
  return category;
 
  }
}