package com.techment.inheritance.abstraction;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Amount :");
		double amount = input.nextDouble();
	
		TravelCard tc = new TravelCard();
		tc.rechargeCard(amount); 

		
		 System.out.println("Enter the Amount in USD: ");
	        double USD = input.nextDouble();
	        double INR = 60 * USD;
	        
	        tc.CardNo = (int) (100000 + Math.random() * 900000);
	        System.out.println("Card No: "+tc.CardNo);
	        tc.swipeCard(INR);
	        tc.rewardPoints(INR);
	}

}
