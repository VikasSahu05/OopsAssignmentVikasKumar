/* Interface

Create a package com.shape containing the following classes and interfaces.
An interface Polygon containing the members as given below:
void calcArea( );	Method to calculate area 
void calcPeri( ); 	Method to calculate perimeter 
Create a class Square that implements Polygon and has the following member:
		side 	float
Create another class Rectangle that implements Polygon and has the following member:
		length		float
		breadth	float
In another package com.test, create a class that imports the above package and instantiates an object of the Square class and an object of the Rectangle class. 
Call the methods on each of the classes to calculate the area and perimeter given the side and the length/breadth of the Square class and the Rectangle class respectively. */

package com.techment.testInterface;
import com.techment.shape.*;

public class Test {

	public static void main(String[] args) {
		
		Square square = new Square();
		square.calcArea();
		square.calcPeri();
		
		Rectangle rectangle = new Rectangle();
		rectangle.calcArea();
		rectangle.calcPeri();
		
	}

}
