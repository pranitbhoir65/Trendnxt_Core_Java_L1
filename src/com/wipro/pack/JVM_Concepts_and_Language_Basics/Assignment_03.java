package com.wipro.pack.JVM_Concepts_and_Language_Basics;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    double minutesInYear = 60 * 24 * 365;
		    // whole year is of 365 days 24 hours and 60 minutes.
		    //for one day total minutes is 60 * 24 * 1 so for year it multiplied by 365
		    
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input the number of minutes: ");
	        double minutes = input.nextDouble();
	        long years = (long) (minutes / minutesInYear);
	        int days = (int) (minutes / 60 / 24) % 365;
	        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}

}
