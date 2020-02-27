package com.wipro.pack.Threads_Collection_Framework_Garbage_Collection;

class finalExample{
	
	protected void finalize(){
		System.out.println("Finalize method called");
	}
	
}



public class Assignment_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalExample f = new finalExample();
		f = new finalExample();
		f = new finalExample();
		//f=null;
	    Runtime.getRuntime().gc();
		
		
		
	}

}
