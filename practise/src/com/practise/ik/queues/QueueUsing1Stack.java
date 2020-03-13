package com.practise.ik.queues;

import java.util.Stack;

public class QueueUsing1Stack {
	
	Stack<Integer> stack;
	
	
	QueueUsing1Stack(){
		stack = new Stack();
	}
	
	public void enqueue(int value) {
		stack.push(value);
	}
	
	
	public Integer deque() {
		if(stack.isEmpty()) {
			return null;
		}
		return deque(stack.pop());	
		
	}
	
	private Integer deque(int popElement) {
		if(stack.isEmpty()) {
			return popElement;
		}
		int result = deque(stack.pop());
		stack.push(popElement);
		return result;
		
	}

	public static void main(String[] args) {
		QueueUsing1Stack q1s = new QueueUsing1Stack();
		q1s.enqueue(3);
		q1s.enqueue(4);
		q1s.enqueue(5);
		q1s.enqueue(6);
		System.out.println("Pop Element:(3) :"+q1s.deque());
		q1s.enqueue(7);
		q1s.enqueue(8);
		System.out.println("Pop Element:(4) :"+q1s.deque());
		System.out.println("Pop Element:(5) :"+q1s.deque());
		System.out.println("Pop Element:(6) :"+q1s.deque());
		System.out.println("Pop Element:(7) :"+q1s.deque());
		System.out.println("Pop Element:(8) :"+q1s.deque());
		System.out.println("Pop Element:(null) :"+q1s.deque());
	}

}
