package com.thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	private void increment() {
		
		for(int i=0; i<1000; i++) {
			count++;
		}
		
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println(" waiting ");
		cond.await();
		increment();
		lock.unlock();							// using multiple locks in object ..
												// more advantage than synchronized ..
	}									
	
	public void secondThread() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.lock();
		System.out.println(" press return key ");
		new Scanner(System.in).nextLine();
		System.out.println(" got return key ");
		cond.signal();	// unlocks the thread ,when signal is called ...
		increment();
		lock.unlock();
	}

	public void finished() {
		System.out.println("count = "+count);
	}
	}
