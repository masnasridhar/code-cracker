package com.thread.callable;

import java.util.concurrent.Callable;

public class TaskOne implements Callable<String> {

@Override
public String call() throws Exception {
	Thread.sleep(10000);
    String message = "Task One here. . .";
    return message;
    }
}

