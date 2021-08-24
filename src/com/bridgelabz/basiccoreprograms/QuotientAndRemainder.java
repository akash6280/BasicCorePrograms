package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class QuotientAndRemainder {
	public static void main(String[] args) {

        int dividend,divisor;
        System.out.println("Enter the Dividend ");
        Scanner sc=new Scanner(System.in);
        dividend=sc.nextInt();
        System.out.println("Enter Divisor");
        divisor=sc.nextInt();
        int quotient,remainder;
        quotient=dividend/divisor;
        remainder=dividend%divisor;
        System.out.println("Quotient= "+quotient+"\n"+"Remainder= "+remainder);
        sc.close();

	}
}