package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		Test1Runnable test1Runnable=new Test1Runnable();
		Test2Runnable test2Runnable=new Test2Runnable();
		exec.submit(test1Runnable);
		exec.submit(test2Runnable);
	}

}
