package com.techment.inheritance.abstraction;

abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit=5;
	

	abstract void swipeCard (double input);
	
	
	void rechargeCard(double amount) {
		System.out.println(availableBalance+=amount);
	} 
}
