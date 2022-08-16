/* Inheritance and Abstraction
Create an abstract class Medicine to represent a drug manufactured by a pharmaceutical company with attributes price and expiry date and a method getDetails() to print them.
Also include an abstract function displayLabel() in the Medicine class. 

Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.

Create a class TestMedicine with the main method that declares an array of Medicine references of size 5. Create a medicine object of the type Tablet/Syrup/Ointment as decided by a randomly generated integer in the range 1 to 3. (Refer Java API Documentation to find out random number generation)
Check the polymorphic behavior of the displayLabel() method.*/

package com.techment.Abstraction;

public class TestMedicine{

	public static void main(String[] args) {
		Medicine m[] = new Medicine[5];
		double i = Math.random()*4;
	
		int j = (int)i;
//		System.out.println(j);
		
		if(j==1) 
		{
			Tablet tablet = new Tablet();
			tablet.getDetails(50,"5-6-2024","Tablet");
			tablet.displayLabel();
			
		}
		else if(j==2) 
		{
			Syrup syrup = new Syrup();
			syrup.getDetails(100,"14-6-2020","Syrup");
			syrup.displayLabel();
		}
		else if(j==3) 
		{
			Ointment ointment = new Ointment();
			ointment.getDetails(70,"5-10-2023","Ointment");
			ointment.displayLabel();
		}else {
			System.out.println("Refresh to see the medicine details");
		}
		
	}

}
