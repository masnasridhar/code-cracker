package com.thread.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("Task " + number + " Started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask " + number + " Done");
	}
}

public class ExecutorServiceRunner {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		System.out.println("1");
		executorService.execute(new Task(2));
		System.out.println("2");
		executorService.execute(new Task(3));
		System.out.println("3");
		executorService.shutdown();
	}
}