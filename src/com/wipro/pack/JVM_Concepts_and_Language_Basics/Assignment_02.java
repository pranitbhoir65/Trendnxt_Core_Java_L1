package com.wipro.pack.JVM_Concepts_and_Language_Basics;

public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Assignment 2:  Write a Java program to print the result of the following 
	 * operations. Declare variables and initialize them with given values 
	 *  a. -5 + 8 * 6 
	 *  b. (55+9) % 9  
	 *  c. 20 + -3*5 / 8  
	 *  d. 5 + 15 / 3 * 2 - 8 % 3  
 
	 * */
		
		int a=5,b=8,c=6,d=55,e=9,f=20,g=3,h=15,i=2;
		
		int result1 = -a + b * c;
		int result2 = (d + e) % e;
		int result3 = f + -g * a / b;
		int result4 = a + h / g * i - b % g;
		
		System.out.println("Result1 : "+result1);
		System.out.println("Result2 : "+result2);
		System.out.println("Result3 : "+result3);
		System.out.println("Result4 : "+result4);
	
	}

}
