package com.wipro.pack.Exceptions_Strings;

import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a string : ");
		String str = new Scanner(System.in).next();
		
		//char c1[] = str.toCharArray();
		int count=0;
		for (int i=0; i<str.length()/2;i++){
			
			if(str.charAt(i)==(str.charAt( (str.length()-1)-i))){
				continue;
			}
			else {
			count++;
			}
			
		}
		if(count==0){
			System.out.println("Given String "+str+" is palindrome");
		}
		else{
			System.out.println("Given String "+str+" isn't palindrome");
				
		}
		
		
		
	}

}
