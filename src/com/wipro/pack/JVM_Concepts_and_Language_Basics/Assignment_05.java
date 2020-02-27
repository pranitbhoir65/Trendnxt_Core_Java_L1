package com.wipro.pack.JVM_Concepts_and_Language_Basics;

import java.util.Scanner;

public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter only 4 digit number : ");
		int no = new Scanner(System.in).nextInt();
		int sum =0;
		int digit = 0;
		while (no!=0){
			
			digit = no % 10;
			sum += digit;
			no /= 10;
		}
		
		System.out.println("The total sum is : "+sum);
		
		
	}

}
