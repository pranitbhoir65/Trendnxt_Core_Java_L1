package com.wipro.pack.Exceptions_Strings;

class InvalidAgeException extends Exception{
	
	public String toString(){
		
		return "Age must be >=18 and <60";
	}
}


public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		if(age>=18 && age<60)
			System.out.println(name+"'s age is "+age);
		else 
			try{
				throw new InvalidAgeException();
			}catch(InvalidAgeException e){
				System.out.println(e.toString());
			}

	}

}
