package com.techment.encapsulation.inheritance;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	
	public void setBookDetails(int bookNo,String title,String author,float price) {
		this.setBookNo(bookNo);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
