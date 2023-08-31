package com.Multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//create Thread by extending Thread class
class Task extends Thread {
	// state/field
	private int number;

	// constructor
	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // SIGNATURE
		System.out.println("Task " + number + " Started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n task " + number + " Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		/*
		 * ExecutorService is used for Multi-Threading
		 * 
		 * The ExecutorService interface extends Executor by adding methods that help
		 * manage and control the execution of threads. It is defined in
		 * java.util.concurrent package. It defines methods that execute the threads
		 * that return results, a set of threads that determine the shutdown status. The
		 * ExecutorService interface is implemented in a utility class called Executors.
		 * It defines methods that provide an implementation of the ExecutorService
		 * interface and many other interfaces, with some default settings.
		 * 
		 */

		// create a ExecutorService
		// run a single thread at a time by using newSingleThreadExecutor()
		/*
		 * --here one thread will start and complete then next thread will start and
		 * complete example is mentioned in line 48, 49, 50
		 */
		System.out.println("single executor thread example started");
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(new Task(1)); // run Task1() thread
		executorService1.execute(new Task(2)); // run Task2() thread
		System.out.println("single executor thread example ended");
		// here after Task1 thread will complete then only Task2 thread will run and
		// complete

		// create a fixed pool thread of a given size where all the threads can run
		// parallely -> newFixedThreadPool(5) it means 5 threads at a time
		ExecutorService executorService = Executors.newFixedThreadPool(5);// thread of size 5

		executorService.execute(new Task(1)); // run Task1() thread
		executorService.execute(new Task(2)); // run Task2() thread
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));

		// we have to shutdown the executorService after operations are completed
		executorService.shutdown();
		executorService1.shutdown();
	}

}
