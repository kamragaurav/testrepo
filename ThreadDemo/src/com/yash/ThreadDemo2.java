package com.yash;

class MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Child");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Intrupted");
			}
			
		}
	}
}
 
public class ThreadDemo2 {
public static void main(String[] args) {
	MyThread1 myThread1 = new MyThread1();
	myThread1.start();
	myThread1.interrupt();
	for (int i = 0; i < 50; i++) {
		System.out.println("Main");
	}
}
}
