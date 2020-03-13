package com.practise.ik.queues;

import java.util.Stack;

public class QueueUsing2Stacks {
	Stack<Integer> enqStack;
	Stack<Integer> deqStack;
	
	QueueUsing2Stacks(){
		enqStack = new Stack<Integer>();
		deqStack = new Stack<Integer>();
	}
	
	public void enqueue(int value) {
		enqStack.push(value);
	}
	
	public Integer deque() {
		if(deqStack.isEmpty()) {
			while(!enqStack.isEmpty()) {
				deqStack.push(enqStack.pop());
			}
		}
		
		if(!deqStack.isEmpty()) {
			return deqStack.pop();
		}
		return null;
	}

	public static void main(String[] args) {
		
		QueueUsing2Stacks q2s = new QueueUsing2Stacks();
		q2s.enqueue(3);
		q2s.enqueue(4);
		q2s.enqueue(5);
		q2s.enqueue(6);
		System.out.println("Pop Element:(3) :"+q2s.deque());
		q2s.enqueue(6);
		System.out.println("Pop Element:(4) :"+q2s.deque());
		System.out.println("Pop Element:(5) :"+q2s.deque());
		System.out.println("Pop Element:(6) :"+q2s.deque());
		System.out.println("Pop Element:(6) :"+q2s.deque());
		System.out.println("Pop Element:(null) :"+q2s.deque());

	}

}
