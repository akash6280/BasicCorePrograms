package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
	 int number;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The number");
     number=sc.nextInt();
     if(number%2==0)
         System.out.println("Even Number");
     else
         System.out.println("Odd Number");
     sc.close();

 }
} 