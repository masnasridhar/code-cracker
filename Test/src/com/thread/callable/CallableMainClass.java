package com.thread.callable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMainClass {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		// set of Callable types
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		// add tasks to Set
		callables.add(new TaskOne());
		callables.add(new TaskTwo());
		// list of Future<String> types stores the result of invokeAll()
		try {
			List<Future<String>> futures = service.invokeAll(callables);
			// iterate through the list and print results from get();
			for (Future<String> future : futures) {
				System.out.println(future.get());
			}
			System.out.println("completed");
			service.shutdown();
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e);
		}
		service = Executors.newFixedThreadPool(2);
		try {
			Future<String> submit = service.submit(new TaskOne());
			Future<String> submit2 = service.submit(new TaskTwo());
			System.out.println(submit.get());
			System.out.println(submit2.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e);
		}
		System.out.println("completed");
		service.shutdown();
	}

}
