package com.wipro.pack.Threads_Collection_Framework_Garbage_Collection;

import java.util.HashMap;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("sachin", 1234567891);
		hm.put("virat", 1432167890);
		hm.put("rohit", 1256789346);
		hm.put("dhoni", 1234567543);
		
		System.out.println("phone number is : "+hm.get("rohit"));
	}

}
