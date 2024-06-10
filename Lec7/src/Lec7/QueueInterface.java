//QueueInterface -  first in first out

package Lec7;

import java.util.PriorityQueue;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(11);
		priorityQueue.add(22);
		priorityQueue.add(22);
		priorityQueue.add(44);
		priorityQueue.add(33);
		priorityQueue.add(55);
		priorityQueue.add(66);
		priorityQueue.add(77);
		priorityQueue.add(88);
		
		//show elements
		System.out.println(priorityQueue);
		 
		//show first element
		System.out.println("Queue Peek = " + priorityQueue.peek()); // 11
		
		//poll delete the first element
		System.out.println("Queue Poll = " + priorityQueue.poll()); 
		
		System.out.println("Queue Peek = " + priorityQueue.peek()); // 22
		
		//poll delete the second element
		System.out.println("Queue Poll = " + priorityQueue.poll());  
		
		//show elements
		System.out.println(priorityQueue);
		
	}
	
	
}
