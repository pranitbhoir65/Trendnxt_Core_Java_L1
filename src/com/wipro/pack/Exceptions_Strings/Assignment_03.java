package com.wipro.pack.Exceptions_Strings;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = Integer.parseInt(args[0]);
		int sum=0;
		try{
		int n1 = Integer.parseInt(args[1]);
		int n2 = Integer.parseInt(args[2]);
		int n3 = Integer.parseInt(args[3]);
		int n4 = Integer.parseInt(args[4]);
		int n5 = Integer.parseInt(args[5]);
		
		System.out.println("Avg of 5 no : "+((n1+n2+n3+n4+n5)/no));
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bound Exception ");
		}
		
	    
		
		
		
/*
		System.out.println("Number of elements you want : ");
		int no = new Scanner(System.in).nextInt();
		int a[] = new int[no];
		int sum=0;
		try{
		for (int i=0;i<no;i++){
			a[i] = new Scanner(System.in).nextInt();
		}
		for(int i=0;i<no;i++){
			sum+= a[i];
		}
		
		System.out.println("The avg of 5 numbers : "+sum);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception "+e);
		}
*/		
		
	}

}
