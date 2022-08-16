package com.techment.Abstraction;

abstract class Medicine {
	
	float price;
	String expiryDate;
	String name;
	
	public void getDetails(float price,String expiryDate ,String name) {
		System.out.println(""+name);
		System.out.println("Price :"+price);
		System.out.println("ExpiryDate :"+expiryDate);
	}
	
	  abstract void displayLabel();  
}


 class Tablet extends Medicine{

	@Override
	void displayLabel() {
		System.out.println("store in a cool dry place");
		
	}
	
}
 
 class Syrup extends Medicine{

	@Override
	void displayLabel() {
		System.out.println("Take with Warm Water");
		
	}
	 
 }
 
 class Ointment  extends Medicine{

	@Override
	void displayLabel() {
		System.out.println("for external use only");
		
	}
	 
 }