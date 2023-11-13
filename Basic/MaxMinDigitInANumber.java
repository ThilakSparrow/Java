package com.rntbci.p4_practiceprograms;

import java.util.Scanner;

public class MaxMinDigitInANumber {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int num = scanner.nextInt();
    
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int rem;
    
    while(num > 0) {
        
        //Extracting digits from number
        rem = num % 10;
        
        //checking minimum digit in number
        if(rem < min) {
            min = rem;
        }
        
        //checking maximum digit in number
        if(rem > max) {
            max = rem;
        }
        
        num /= 10;
    }
    
    System.out.println("Max : "+max+" Min : "+min);
}
}