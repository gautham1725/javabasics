package com.thread;

public class Synchronized {
	
	private int  count = 0;
	
	public static void main(String[] args) {
		
		Synchronized syn = new Synchronized();
		syn.doWork();
		}
	
	// by declaring method as synchronized method ,
	//	we can avoid this ...

	
	public synchronized void increment() {
		
		count++;
		
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() 
		{
			public void run() {
				for(int i=0; i<10000; i++) {
					increment();
				}
		}
	});
		t1.start();
		
			Thread t2 = new Thread(new Runnable() 
			{
				public void run() {
					for(int i=0; i<10000; i++) {
						increment();
					}
			}
		});
			t2.start();
			
			try {
				t1.join(1000);
				t2.join(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("count is = "+count);
}
}