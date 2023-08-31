package com.Multi_Threading;

//create Thread by extending Thread class
class Task1 extends Thread {
	@Override
	public void run() { // SIGNATURE
		System.out.println("Task 1 started");
		for (int i = 10; i <= 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n task1 done");
	}
}

// create Thread by implementing Runnable interface
class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task 2 started.");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n task2 done");

	}

}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * we can limit the execution of threads i.e one at a time by using synchronized
		 * keyword i.e by synchronization. in synchronization, only one thread can use a
		 * block at a time and other threads have to wait for the the current thread to
		 * wait. it like a lock is acquired once a thread is in executing state and once
		 * it completes the lock is released and other thread will acquire the lock to
		 * execute code.
		 */
		// Task1 -1 to 99

		/*
		 * setPriority() tries to set the priority of threads before other threads
		 * however it does not guarantee that a particular threads will always be given
		 * priority. MAX_PRIORITY = 10, MIN_PRIORITY = 1, NORMAL_PRIORITY = 5
		 */

		// create an object of Task1 class and invoke the Thread by start()
		System.out.println("task1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1); // 10 means max priority, 1 means min priority
		task1.start(); // invoking Thread using start() method

		System.out.println("\n task1 done");
		System.out.println("task2 kicked off");

		// Task2
		Task2 task2 = new Task2(); // created object of Task2
		Thread task2Thread = new Thread(task2); // pass task2 in Thread constructor
		task2Thread.setPriority(10); // 10 means max priority, 1 means min priority
		task2Thread.start();// invoking Thread using start() method

		System.out.println("task3 kicked off");

		/*
		 * lets say we want our task1 thread and task2 thread to complete execution and
		 * after that other threads should be done it can be done by .join() ex :
		 * task1.join() means wait for task1 to complete and then execute other threads
		 */

		task1.join(); // wait for task1 to complete and then execute others
		task2Thread.join(); // wait for task2Thread to complete and then execute others

		// Task3
		System.out.println("\n Task3 started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n task3 done");

		System.out.println("Main done");
	}
}
