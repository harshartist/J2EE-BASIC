package com.java.lambda;

public class SecondLambda {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
/*		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0 ; i<5 ; i++) {
					System.out.println("hello dev this is from thread["+
				Thread.currentThread().getName()+"]");
					}	
			}
		}; */
		
		
		Runnable runnable =()->
		{
			
			for(int i=0 ; i<5 ; i++) 
			{
				System.out.println("hello dev this is from thread["+
			Thread.currentThread().getName()+"]");
				}
			
		};	
		
		Thread t1= new Thread(runnable);
		t1.start();
		t1.join();
		
	    }
	}
