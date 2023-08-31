package com.Multi_Threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create a threadpool of size 3
		// it means the size of the thread pool will decide how many threads will run
		// parallely at a time
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("in28minutes"), new CallableTask("Vishal"),
				new CallableTask("Adam"));

		// Future<String> is a thread here which will store return values of callable
		// i.e its a promise that there will be result
		// invokeAny() completes any execution of callable class and then put it in
		// result
		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();
	}

}
