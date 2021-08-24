package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class SwapTwoNumbers {
	  public static void main(String[] args) {

	        int number1,number2;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter first number");
	        number1=sc.nextInt();
	        System.out.println("Enter second number");
	        number2=sc.nextInt();
	        System.out.println("Number1 = "+number1+"\n"+"Number2 = "+number2);
	        int swapContainer=number1;
	        number1=number2;
	        number2=swapContainer;
	        System.out.println("After Swapping");
	        System.out.println("Number1 = "+number1+"\n"+"Number2 = "+number2);
	        sc.close();


	    }

}