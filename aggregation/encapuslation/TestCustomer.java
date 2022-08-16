package com.techment.aggregation.encapuslation;

//Assignment 1 & 4 in same as per the question

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer customer = new Customer("John",new Address("Ist Main HSR Layout","Banglore"),new Address("Ist Main Electronics city", "Bangalore"));
		
		customer.getCustomerDetails();

		
	}

}
