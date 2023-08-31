package com.javaCollections.QueueInterface;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// custom comparator to sort element based on length of word in ascending order
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueOperations {
	public static void main(String[] args) {
		// in PriorityQueue order for the elements is by default ascending order
		// if we have new LinkedList<>() or ArrayList<> for type Queue then
		// order is not maintained here. it will be stored as given by user
		// here we have passed new StringLengthComparator() i.e constructor of
		// comparator
		// to sort priority elements in order of length of strings. by default it is
		// ascending
		Queue<String> queue = new PriorityQueue<String>(new StringLengthComparator());

		// add multiple elements in queue by addAll()
		queue.addAll(List.of("zebra", "monkey", "cat"));

		// poll() removes and return the front element of queue if present else returns
		// null
		System.out.println("poll() called - " + queue.poll()); // get element based on length
		System.out.println("poll() called - " + queue.poll());
		System.out.println("poll() called - " + queue.poll());
		System.out.println("poll() called - " + queue.poll());

		// add an element at rear of queue by offer() method
		queue.offer("Apple");
		System.out.println("added by offer() - " + queue);

		// get and remove the element from front of queue
		String poppedElement = queue.poll();
		System.out.println("popped element using poll() - " + poppedElement);
	}
}
