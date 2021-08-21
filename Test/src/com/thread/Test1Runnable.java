package com.thread;

public class Test1Runnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Test1Runnable" + Thread.currentThread().getName());
	}

}
