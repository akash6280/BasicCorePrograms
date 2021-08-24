package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter Number of times coin is flipped");
		Scanner sc=new Scanner(System.in);
		int numberOfFlip=sc.nextInt();
		int numberOfHeads=0,numberOfTails=0;
		
		if(numberOfFlip>0) {
			for(int flip=1;flip<=numberOfFlip;flip++) {
		
				double sideCheck= Math.random();
				if(sideCheck<0.5)
					numberOfTails++;
				else
					numberOfHeads++;
				
			}
			float percentageHeads=(float)numberOfHeads/(numberOfHeads+numberOfTails)*100;
			float percentageTails=(float)numberOfTails/(numberOfHeads+numberOfTails)*100;
			System.out.println("Heads Percentage ="+percentageHeads+"\n "+"Tails Percentage ="+percentageTails);
		}
		else
			System.out.println("Enter Positive Integer");
		sc.close();
	}
}