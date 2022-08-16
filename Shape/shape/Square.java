package com.techment.shape;

public class Square implements Polygon {
	float side=5;

	@Override
	public void calcArea() {
		float area = side*side;
		System.out.println("Area Of Square "+area);
	}	

	@Override
	public void calcPeri() {
		float perimeter = 4 * side;
		System.out.println("Perimeter of Square"+perimeter);
		
	}
}

