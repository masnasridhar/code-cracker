package com.thread.callable;

import java.util.concurrent.Callable;

public class TaskTwo implements Callable<String> {

@Override
public String call() throws Exception {
	Thread.sleep(20000);
    String message = "Task Two here . . . ";
    return message;
    }
}
