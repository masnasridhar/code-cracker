package com.thread;

public class Test2Runnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Test2Runnable" + Thread.currentThread().getName());
	}

}
