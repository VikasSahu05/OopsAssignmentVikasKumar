package com.techment.encapsulation.inheritance;

public class EngineeringBook extends Book {
	private String category;
	
	public void getBookDetails() {
		System.out.println(" Book No:"+getBookNo());
		System.out.println("Book Title :"+getTitle());
		System.out.println("Book Author :"+getAuthor());
		System.out.println("Book Price : "+getPrice());
		System.out.println("Book Category :"+getCategory());
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
