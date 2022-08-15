package com.techment.aggregation.encapuslation;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress; 
	
	Customer(String customerName,Address residentialAddress,Address officialAddress){
		this.customerName=customerName;
		this.residentialAddress=residentialAddress;
		this.officialAddress=officialAddress;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer Name :"+customerName);
		System.out.println("Residential Address :"+residentialAddress.AddressLine+" , "+residentialAddress.city);
		System.out.println("Official Address :"+officialAddress.AddressLine +" , "+officialAddress.city);
	} 
}
