package com.threadlock;

public class Workermain {

	public static void main(String[] args) {
		
		System.out.println("synchronied object lock :");
		WorkerObjectLock w1 = new WorkerObjectLock();
		w1.main();
		
		System.out.println("synchronied method lock :");
		WorkerMethodLock w2 = new WorkerMethodLock();
		w2.main();

	}

}
