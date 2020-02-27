package com.wipro.pack.Threads_Collection_Framework_Garbage_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("pranit");
		hs.add("joydeep");
		hs.add("vishal");
		hs.add("karan");
		hs.add("prashant");
		hs.add("shubham");
		hs.add("lalit");
		hs.add("ayush");
		hs.add("rahul");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			Object ob1 = it.next();
			System.out.println(ob1);
		}
				
				
		
	}

}
