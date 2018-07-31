package com.thread;

public class ThreadExample  extends Thread {
	String name;

	public ThreadExample(String name) {
		
		this.name = name;
		setName(name);
		start();
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i+Thread.currentThread());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}



	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample("one");
		ThreadExample t2 = new ThreadExample("two");
		
		try {
			t1.join();
		    t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main done"+Thread.currentThread());
		
	}

}
