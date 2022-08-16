
/* Encapsulation & Inheritance
a)	Create a class Book which has following members:
	private int bookNo
private String title
private String author
private float price
	Provide getter and setter methods for all the instance variables.
Create a class BookDetails which has the main method. Create an object of the Book class.  Initialize the object by reading inputs for the fields from the user. 

b)	Extend the Book class to create a class EngineeringBook derived from Book with an additional attribute
		private String category 	
Provide setter and getter methods for type instance variable.
Create an object of the EngineeringBook class  and test.
 */

package com.techment.encapsulation.inheritance;
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {

		EngineeringBook book=new EngineeringBook();
		
		try {
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
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
