package com.practise.ik.queues;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {
	
	//queue to maintain keys
	private Deque<Integer> dq;
	
	//set to maintain objects coresponding to keys
	private Set<Integer> map;
	
	//cache size
	private int capacity;
	
	private LRUCache(int size) {
		dq = new LinkedList<Integer>();
		map = new HashSet<Integer>();
		capacity =size;
		
	}
	
	public void refer(int value) {
		if(!map.contains(value)) {
			if(map.size() == capacity) {
				map.remove(dq.removeLast());
			}//if
		}else {
			dq.remove(value);
			map.remove(value);
			
		}
		
		dq.push(value);
		map.add(value);
		
		
	}
	
	public void display() {
		
		dq.forEach(p -> System.out.print(p + " "));
		System.out.println();
		map.forEach(p -> System.out.print(p + " "));
		System.out.println();
		
	}
	
	public void displayItr() {
		Iterator<Integer> itr = dq.iterator(); 
        while(itr.hasNext()) 
        { 
            System.out.print(itr.next()+" "); 
        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache ca = new LRUCache(4);
		ca.refer(1);  
        ca.refer(2);  
        ca.refer(3);  
        ca.refer(1);  
        System.out.println("\nExpcted: [2 3 1]");
        ca.display(); 
        ca.refer(4);  
        System.out.println("\nExpcted: [2 3 1 4]");
        ca.display(); 
        ca.refer(5);  
        System.out.println("\nExpcted: [3 1 4 5]");
        ca.display(); 
        ca.refer(6);  
        System.out.println("\nExpcted: [1 4 5 6]");
        ca.display(); 
        System.out.println("\nExpcted: [4 5 6 1]");
        ca.refer(1);  
        /*ca.display(); 
        System.out.println("\nDisplay through Deque Iterator: ");
        ca.displayItr(); 
        */

	}

}

;