package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class VowelOrConsonant {
	public static void main(String[] args) {
	 char ch;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Alphabet");
     ch = sc.next().charAt(0);
     switch (ch) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'I':
         case 'E':
         case 'O':
         case 'U':

             System.out.println(ch + " is vowel");
             break;
         default:
             System.out.println(ch + " is consonant");


     }
     sc.close();
 }

}