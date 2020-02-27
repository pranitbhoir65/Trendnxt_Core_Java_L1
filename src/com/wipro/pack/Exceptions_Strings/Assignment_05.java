package com.wipro.pack.Exceptions_Strings;

public class Assignment_05 {
	
	
	public static void main (String args[]){
		
		String str = "How was your day today";
		char c1 = 'a';
		String c = String.valueOf(c1);
	    int count = str.length() - str.replace(c, "").length();
	    System.out.println("Number of occurances of character 'a' in '"+str+"' are = "+count);
	    
	}


}
