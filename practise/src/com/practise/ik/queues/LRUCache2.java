package com.practise.ik.queues;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache2 {
	Deque<Integer> dq;
	Set<Integer> map;
	int capacity;
	
	LRUCache2(int size){
		dq= new LinkedList<Integer>();
		map = new HashSet<Integer>();
		capacity = size;
	}
	
	public void refer(int value) {
		if(!map.contains(value)) {
			if(dq.size() == capacity) {
				map.remove(dq.removeLast());
			}
		}else {
			map.remove(value);
			dq.remove(value);
		}
		
		dq.push(value);
		map.add(value);
	}
	
	public void display() {
		System.out.println("\nElements in Deque:");
		dq.forEach(p -> System.out.print(p+" "));
		
	}
	
	public static void main(String[] args) {
		LRUCache2 cache = new LRUCache2(3);
		cache.refer(3);
		cache.refer(2);
		cache.display();
		cache.refer(3);
		cache.display();
		cache.refer(4);
		cache.refer(6);
		cache.display();
		cache.refer(4);
		cache.display();
	}

}


