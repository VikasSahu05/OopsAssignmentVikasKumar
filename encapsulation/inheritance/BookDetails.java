package com.techment.encapsulation.inheritance;

//Assignment 2
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {

		EngineeringBook book=new EngineeringBook();
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		System.out.print("Enter Book No: ");
		book.setBookNo(inputInt.nextInt());
		System.out.print("Enter Title: ");
		book.setTitle(inputString.nextLine());
		System.out.print("Enter Author: ");
		book.setAuthor(inputString.nextLine());
		System.out.print("Enter Price: ");
		book.setPrice(inputInt.nextFloat());
		System.out.print("Enter Book Category: ");
		book.setCategory(inputString.nextLine());
		
		
		book.setBookDetails(book.getBookNo(), book.getTitle(), book.getAuthor(), book.getPrice());
		book.setCategory(book.getCategory());
		book.getBookDetails();

	}

}
