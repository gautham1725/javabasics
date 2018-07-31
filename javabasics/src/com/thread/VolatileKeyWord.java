package com.thread;

public class VolatileKeyWord extends Thread{

	boolean keepRunning = true;
	volatile int count = 0;
	
	
/**		using volatile keyword will always keep
			the variable in main memery itself   ...
			
			changing the value of variable will be
			visible	to all other threads				*/
	
	
	public void run() {
		while(keepRunning) {
			count++;
		}
		System.out.println("Thread Terminated"+count);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		VolatileKeyWord vk = new VolatileKeyWord();
		vk.start();
		Thread.sleep(2000);
		vk.keepRunning = false;
		
		System.out.println("keep running set to false");
	}

}
