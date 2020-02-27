package com.wipro.pack.Threads_Collection_Framework_Garbage_Collection;

public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread() {
            public void run() {
                int x = 0;
                while (x!=10) {
                	System.out.println(java.time.LocalTime.now()); 
                    x++;
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
	}

}


