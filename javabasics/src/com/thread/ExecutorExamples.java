package com.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorExamples implements Runnable{
	private int id;
	
	public ExecutorExamples(int id ) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("starting ..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	        e.printStackTrace();
		}
		System.out.println("completed"+id);
	}
	
}

class ExecutorEx {
	
	public static void main(String[] args) {
	    
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0; i<2; i++) {
			executor.submit(new ExecutorExamples(i));
		}
		executor.shutdown();
		
		System.out.println("all task submitted ..");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("all task completed ..");
	}
}
