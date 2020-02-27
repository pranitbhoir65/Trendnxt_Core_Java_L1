package com.wipro.pack.Threads_Collection_Framework_Garbage_Collection;

import java.util.Random;

class Runnable1 implements Runnable{
    public void run(){

    }
    
    public void factorial (int end){
    	int fact =1;
    	for(int i=1;i<=end;i++){
    		fact = fact*i;
    	}
    	System.out.println("Number : "+end);
    	System.out.println("factorial of "+end+" : "+ fact);
    }
}



public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Runnable r = new Runnable1();
	        Thread t = new Thread(r);
	        t.start();
	        int min=1;
	        int max=5;
	        for (int i=min;i<=max;i++){
	        Random random = new Random();
	        int ran=0;
	        
	        while (true){
	        	ran = random.nextInt((max-min)+1)+min;
	        	 ((Runnable1) r).factorial(ran);
	        	if(ran!=0)break;
	        }
	        }
	        
		    
		
	}

}
