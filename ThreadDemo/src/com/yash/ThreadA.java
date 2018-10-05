package com.yash;

public class ThreadA {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB threadB = new ThreadB();
		threadB.start();
		Thread.sleep(1000);
		synchronized (threadB) {
			System.out.println("Wait Calling");
			threadB.wait();
			System.out.println("Wait is over");
			System.out.println("Total = "+threadB.total);
		}
		
		System.out.println("Main");
	}

}
