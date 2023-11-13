package com.rntbci.p4_practiceprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	    
	    int num, reversedNum = 0, remainder;
	    
	    Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt(); 

	    int originalNum = num;

	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
        if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	}
