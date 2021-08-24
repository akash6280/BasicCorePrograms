package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year>=1000&year<10000) {
			if(year%400==0)
				System.out.println("Leap year");
			else if((year%4==0) && (year%100!=0))
				System.out.println("Leap year");
			else 
				System.out.println("Not a Leap year");
			sc.close();
	   }	
		else
		System.err.println("Enter year in 4 digit");
		}
	

}