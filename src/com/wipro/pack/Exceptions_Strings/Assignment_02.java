package com.wipro.pack.Exceptions_Strings;
import java.util.*;

public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		String str[] = new String[2];
		int count;
		for (int i = 0; i < 2;i++) {
			System.out.print("Enter your name : ");
			str[i] = sc.next();
			int subA = 0;
			int subB = 0;
			int subC = 0;
			count=0;
			try {	
				System.out.println("Enter 1st subject marks : ");
				if (sc.hasNextInt()){
					subA = sc.nextInt();
				}
				else{
					System.out.print("1st");
					count++;
					throw new NumberFormatException();		
				}
				System.out.println("Enter 2nd subject marks : ");
				if (sc.hasNextInt()){
					subB = sc.nextInt();
				}
				else{
					System.out.print("2nd");
					count++;
					throw new NumberFormatException();
				}
				System.out.println("Enter 3rd subject marks : ");
				if (sc.hasNextInt()){	
					subC = sc.nextInt();
				}
				else{
					System.out.print("3rd");
					count++;
					throw new NumberFormatException();
				}
				
			} catch (NumberFormatException e) {
				System.out.println("\ncatch block");
				System.out.println(e.getMessage());
			} 
			if(count<1){
				System.out.println("Name: " + str[i]);
				System.out.println("Marks of subject A: " + subA);
				System.out.println("Marks of subject B: " + subB);
				System.out.println("Marks of subject C: " + subC);
				System.out.println("Average of Subjects Marks : "+((subA+subB+subC)/3));
			} else{	
			i--;
			}
		}
		System.out.println("\nfinish program");
		sc.close();
	}

}
