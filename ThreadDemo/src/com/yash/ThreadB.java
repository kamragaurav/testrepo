package com.yash;

public class ThreadB extends Thread {
	
	int total=0;
	@Override
	public void run() {
		System.out.println("Run initiate");
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total = total+i;
				System.out.println(total);
			}
			this.notify();
		}
	}

}
