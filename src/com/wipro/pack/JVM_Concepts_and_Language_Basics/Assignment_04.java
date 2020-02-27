package com.wipro.pack.JVM_Concepts_and_Language_Basics;

import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the month number : ");
		int input = new Scanner (System.in).nextInt();
		
		switch (input){
	
		case 1 : System.out.println("January"); break;
		case 2 : System.out.println("February"); break;
		case 3 : System.out.println("March"); break;
		case 4 : System.out.println("April"); break;
		case 5 : System.out.println("May"); break;
		case 6 : System.out.println("June");break;
		case 7 : System.out.println("July");break;
		case 8 : System.out.println("August");break;
		case 9 : System.out.println("September");break;
		case 10 : System.out.println("october");break;
		case 11 : System.out.println("Novemeber");break;
		case 12 : System.out.println("December");break;
		default : System.out.println("You have entered wrong month number. Please enter number between 1 to 12.");
		
		
		}

	}

}
