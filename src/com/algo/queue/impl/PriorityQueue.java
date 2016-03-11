package com.algo.queue.impl;

import java.util.ArrayList;
import java.util.List;

import com.algo.queue.base.Queue;

public class PriorityQueue implements Queue {

	private List<Integer> heap;

	public PriorityQueue() {
		heap = new ArrayList<Integer>();
	}

	public int size() {
		return heap.size();
	}

	public void add(Integer obj) {
		heap.add(obj);
		int currentIndex = heap.size() - 1;
		int parent = (currentIndex - 1) / 2;
		while (heap.get(currentIndex) < heap.get(parent)) {
			Integer tmp = heap.get(currentIndex);
			heap.set(currentIndex, heap.get(parent));
			heap.set(parent, tmp);
			currentIndex = parent;
			parent = (currentIndex - 1) / 2;
		}

	}

	public Integer findMin() {
		return heap.get(0);
	}

	public Integer removeMin() {
		int tmp = heap.get(0);
		int current = 0;
		int leftChild;
		int lastElement = heap.remove(heap.size() - 1);
		int minIndex;
		heap.set(current, lastElement);
		while (current < heap.size() - 1) {
			leftChild = 2 * current + 1;
			if(leftChild > heap.size()) break;
			minIndex = leftChild;
			if (leftChild+1 < heap.size() &&  heap.get(leftChild + 1) < heap.get(leftChild)) {
				++minIndex;
			}
			int temp = heap.get(current);
			heap.set(current, heap.get(minIndex));
			heap.set(minIndex, temp);
			
			current = minIndex;
		}
		return tmp;
	}

	public void display() {

		System.out.println(heap);
	}

}
