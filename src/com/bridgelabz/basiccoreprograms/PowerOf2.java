package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class PowerOf2 {
	public static void main(String[] args) {
		    int numberOfPower;
	        System.out.println("Enter the value of N to print table of power of 2");
	        Scanner sc=new Scanner(System.in);
	        numberOfPower=sc.nextInt();
	        
	        int index=1;
	        int power=2;
	        if(numberOfPower>=0 && numberOfPower<31)
	        while(index<=numberOfPower)
	        { 
	            System.out.println(power);
	            index++;
	            power=power*2;
	        }
	        else
	        	System.out.println("Enter valid value of power");
	        sc.close();
	}
}