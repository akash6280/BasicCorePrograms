package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class LargestNumber {
	public static void main(String[] args) 
    {
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        number1= sc.nextInt();
        System.out.print("Enter the second number:");
        number2= sc.nextInt();
        System.out.print("Enter the third number:");
        number3 = sc.nextInt();
        if(number1 > number2 && number1 > number3)
        {
            System.out.println("Largest number is:"+number1);
        }
        else if(number2 > number3)
        {
            System.out.println("Largest number is:"+number2);
        }
        else
        {
            System.out.println("Largest number is:"+number3);
        }
        sc.close();
 
    }

}