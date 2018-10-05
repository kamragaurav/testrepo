package com.yash;

public class Display {

	public static void wish(String name) throws InterruptedException {
		synchronized (Display.class) { // gaurav

			for (int i = 0; i < 40; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "Xyz");
			}

		}

	}

	public static void Wish2(String name) throws InterruptedException {
		synchronized (Display.class) { // yashendra
			Thread.sleep(1000);
			for (int i = 0; i < 40; i++) {
				System.out.println(Thread.currentThread().getName() + "String");
			}

		}
	}

}
