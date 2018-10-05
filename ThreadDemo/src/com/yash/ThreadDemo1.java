package com.yash;

class MyThread extends Thread{
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("Start...."+Thread.currentThread().getPriority());
		super.start();
		System.out.println("Start");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnn"+Thread.currentThread().getPriority());
		System.out.println("Run");
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.setPriority(9);
		Thread.currentThread().setPriority(3);
		System.out.println("xxx"+Thread.currentThread().getPriority());
		myThread.start();
		myThread.interrupt();
		System.out.println("Main End");
	}
	

}
