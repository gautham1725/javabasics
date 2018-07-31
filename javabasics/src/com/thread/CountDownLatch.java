package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CountDownLatchex2{
	
	public static void main(String[] args) {
	    
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<3; i++) {
     		executor.submit(new Proccesor(latch));
		}
		executor.shutdown();
		
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("completed...");
	
	}
}


