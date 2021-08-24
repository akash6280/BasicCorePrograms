package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class Factors {
	public static void main (String[] args)
    {
        System.out.println("Enter The number for prime factorization");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while (number%2==0)
        {
            System.out.print(2 + " ");
            number=number/2;
        }
 
        for (int factor = 3; factor*factor<=number; factor++)
        {
            while (number%factor == 0)
            {
                System.out.print(factor + " ");
                number= number/factor;
            }
        }
 
        if (number>2)
            System.out.print(number);
        sc.close();
    }
}