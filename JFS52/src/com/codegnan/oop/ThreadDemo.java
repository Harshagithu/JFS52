package com.codegnan.oop;

public class ThreadDemo implements Runnable {
    public void run()
    {
    	for(int i=1;i<=10;i++)
    	{
    	 System.out.println(i);
    	 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			e.printStackTrace();
 		}
    	}
    }
	public static void main(String[] args) {
	    ThreadDemo r=new ThreadDemo();
		Thread td=new Thread(r);
		td.start();
	}

}
