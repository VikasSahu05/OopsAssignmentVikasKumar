package com.techment.inheritance.abstraction;

import java.util.Scanner;

interface Rewardable{
	
	void rewardPoints(double amount);
}


public class TravelCard extends PrepaidCard implements Rewardable {

	@Override
	public void rewardPoints(double INR) {
		
		int rewardPoints = 0;
		
		if(INR >= 100 &&  INR <= availableBalance) {
			rewardPoints+=5;
			System.out.println("Reward Points : "+rewardPoints);
		}else {
			System.out.println("Reward Points : "+rewardPoints);
		}
		
	}


	@Override
	void swipeCard(double swip) {
		
			if(swip > availableBalance) {
				System.out.println("Not enough balance");
				swipeLimit--;
			}else {
				
				availableBalance-=swip;
				double processingCharge = (availableBalance*5)/100;
				availableBalance-=processingCharge;
				System.out.println("Available Balance :"+availableBalance);
				
				swipeLimit--;
				System.out.println("SwipLimit :"+swipeLimit);
			
		}
	}
	
}
