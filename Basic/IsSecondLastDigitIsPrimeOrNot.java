package com.rntbci.p4_practiceprograms;

import java.util.Scanner;

public class IsSecondLastDigitIsPrimeOrNot {

	    public static void main(String args[]) {
	    	int num, digit;
	    	Scanner sc = new Scanner(System.in);  
	    	System.out.print("Enter the number: ");  
	    	num = sc.nextInt(); 
	      
	        digit = (num /10) % 10;
	      System.out.println(num + " second last digit number is: " + digit);
	    }
	    
}