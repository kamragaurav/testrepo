package com.yash;

public class SuncDemo extends Thread{
	
	Display d;
	String name;
	
	public SuncDemo(Display d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			d.Wish2(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Display display = new Display();
		Display display1 = new Display();
		SuncDemo suncDemo = new SuncDemo(display, "Gaurav");
		SuncDemo suncDemo1 = new SuncDemo(display1, "Yashendra"); 
		suncDemo.setName("Gaurav Thread");
		suncDemo1.setName("Yashendra Thread");
		suncDemo.start();
		suncDemo1.start();
	}
}

