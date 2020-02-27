package com.wipro.pack.JVM_Concepts_and_Language_Basics;

import java.util.Scanner;

public class Assignment_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number : ");
		int ip = new Scanner(System.in).nextInt();	
		System.out.println("The factorial of "+ip+" is :"+factorial(ip));
		
		
	}

	private static int factorial(int ip) {
		// TODO Auto-generated method stub
		
		
		if(ip>=1)
		return ip * factorial(ip-1);
		else
			return 1;
	}

}
