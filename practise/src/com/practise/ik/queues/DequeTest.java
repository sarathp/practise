package com.practise.ik.queues;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(1);
		dq.add(5);
		dq.add(2);
		dq.add(6);
		dq.remove();
		dq.forEach(p -> System.out.print(p+ " "));
		System.out.println();
		
		dq.offer(1);
		dq.offer(5);
		dq.poll();
		dq.forEach(p -> System.out.print(p+ " "));
		System.out.println();
		
		dq.push(1);
		dq.push(5);
		dq.pop();
		dq.forEach(p -> System.out.print(p+ " "));
		System.out.println();
		
		dq.push(6);
		dq.pollLast();
		dq.forEach(p -> System.out.print(p+ " "));

	}

}

