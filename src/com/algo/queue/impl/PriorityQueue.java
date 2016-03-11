package com.algo.queue.impl;

import java.util.ArrayList;
import java.util.List;

import com.algo.queue.base.Queue;

public class PriorityQueue implements Queue {

	private List<Integer> heap ;
	public PriorityQueue()
	{
		heap = new ArrayList<Integer>();
	}
	public int size() {
		return heap.size();
	}

	public void add(Integer obj) {
		heap.add(obj);
		int currentIndex = heap.size()-1;
		int parent = (currentIndex-1)/2;
		while(heap.get(currentIndex) < heap.get(parent))
		{
			Integer tmp = heap.get(currentIndex);
			heap.set(currentIndex, heap.get(parent));
			heap.set(parent, tmp);
			currentIndex = parent;
			parent = (currentIndex-1)/2;
		}
		
	}

	public Integer findMin() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer removeMin() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void display() {
		
		System.out.println(heap);
	}

}
