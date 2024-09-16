package com.vivek.javacodes4;

public class InterestTest 
{
	public static void main(String[] args) 
	{
		Bank b = new SBI();
		Bank p = new PNB();
		
		System.out.println("SBI ROI: " + b.rateOfInterest());
		System.out.println("PNB ROI: " + p.rateOfInterest());
	}

}
