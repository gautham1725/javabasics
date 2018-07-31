package com.threadlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkerMethodLock {

	private final Object lock1 = new Object();
	private final Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList();
	private List<Integer> list2 = new ArrayList();
	
	private Random random = new Random();
	public synchronized void stageOne() {
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		
		
	}
	
	
	/**
	  
	 if method is made synchonized , all objects of this methods are locked ..
	 it not even allow the another to run the another method of this 
	 object .. 
	 " Intersink lock "  
	 
	 */
	
		public  synchronized void stageTwo() {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
	}
	
	public void process() {
		for(int i=0; i<1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public void main() {
		System.out.println("starting ...");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				process();
			}
		});
		
		Thread t2 = new Thread( new Runnable() {
			public void run() {
				process();
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken = "+(end - start ));
		System.out.println("list1 "+list1.size()+"; list2 "+list2.size());
	}
}
