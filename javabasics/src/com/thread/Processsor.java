package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Proccesor implements Runnable{
	
	public CountDownLatch latch;
	
	public Proccesor(CountDownLatch latch ) {
		this.latch = latch;
	}
	
	public void run() {
		
		System.out.println("starting ..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	       latch.countDown();					// latch value gets decreased
		}
		
	}
	
}
class CountDownLatchex{
	
	public static void main(String[] args) {
	    
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<3; i++) {
     		executor.submit(new Proccesor(latch));
		}
		executor.shutdown();
		
		
		try {
			latch.await();     // when latch becomes zero , wait releases ...
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("completed...");
	
	}
}


