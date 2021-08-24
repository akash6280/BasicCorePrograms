package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class HarmonicNumber {
		public static void main(String[] args) {
			
			System.out.println("Enter value of n");
			int nthHarmonicNumber;
			Scanner sc=new Scanner(System.in);
			nthHarmonicNumber=sc.nextInt();
			float nthHarmonicValue = 1.0f;
			
			if(nthHarmonicNumber>0) {
			    for (int i = 2; i <= nthHarmonicNumber; i++) {
			    	nthHarmonicValue+= (float)1 / i;
			    }
			    System.out.println(nthHarmonicValue);
			}
			else
				System.out.println("Enter Positive value of n");
		    sc.close();
		}
}