package com.techment.shape;

public class Rectangle implements Polygon{
	float length=4,breadth=5;
	

	@Override
	public void calcArea() {
		float area =length*breadth; 
		System.out.println("Rectangle of Area :"+area);
		
	}

	@Override
	public void calcPeri() {
		float perimeter =  2*(length+breadth);
		System.out.println("Perimeter of rectangle :"+perimeter);
	}
	
}