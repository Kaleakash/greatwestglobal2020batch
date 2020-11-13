package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		/* ArrayList value store using index position. Every value independent. 
		 * In Java LinkedList internally follow double linked list concept. 
		 * List it also known as node ---> Every node hold details about previous 
		 * node as well as next node. 
		 * node divided into three parts <---Ref---CurrentValue--->Ref 
		 * 
		 * If we retrieve one node which intenrally connect previous node as well next 
		 * node. 
		 * 
		 * More retrieve operation : ArrayList good option 
		 * Insert / Delete ---> LinkedList 
		 * 
		 */
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.add(2,100);
		System.out.println(ll);
		ll.remove(2);				//remove using index position 
		System.out.println(ll);
		ll.remove(new Integer(30));		// remove using value 
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}


