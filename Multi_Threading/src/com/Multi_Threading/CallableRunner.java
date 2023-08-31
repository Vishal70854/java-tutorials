package com.Multi_Threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// to return a value from a thread we have to implements Callable Interface
class CallableTask implements Callable<String> { // it will use String object
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000); // sleep for 1 sec
		return "Hello " + name; // return String value
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * callable is used to return value from the threads since Callable has the
		 * call() method that needs to be implemented which returns a result on
		 * completion. Note that a thread can’t be created with a Callable, it can only
		 * be created with a Runnable.
		 */
		// create a threadpool of size 1
		// it means the size of the thread pool will decide how many threads will run
		// parallely at a time
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		// Future<String> is a thread here which will store return values of callable
		// i.e its a promise that there will be result
		Future<String> welcomeFuture = executorService.submit(new CallableTask("in28minutes"));

		System.out.println("new CallableTask(\"in28minutes\") executed");

		// get the return value from the CallableTask class execution
		String welcomeMessage = welcomeFuture.get();

		System.out.println(welcomeMessage);

		System.out.println("\nMain completed.");

		executorService.shutdown();

	}

}
