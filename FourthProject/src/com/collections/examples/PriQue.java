package com.collections.examples;

import java.util.PriorityQueue;

public class PriQue {

	public static void main(String[] args) {
	PriorityQueue<String> q = new PriorityQueue<String>();
	
		q.offer("Twenty");
		q.offer("fourty");
		q.offer("Ninty");
		
		System.out.printf("%s", q);
		System.out.println();
		
		System.out.printf("%s", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s", q);
		}

}
