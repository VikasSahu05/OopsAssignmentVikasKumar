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
			tablet.getDetails(50,"5-6-2024");
			tablet.displayLabel();
			
		}
		else if(j==2) 
		{
			Syrup syrup = new Syrup();
			syrup.getDetails(100,"14-6-2020");
			syrup.displayLabel();
		}
		else if(j==3) 
		{
			Ointment ointment = new Ointment();
			ointment.getDetails(70,"5-10-2023");
			ointment.displayLabel();
		}else {
			System.out.println("No madicine");
		}
		
	}

}
