package com.algo.queue.test;

import java.util.Arrays;
import java.util.Random;

import com.algo.queue.base.Queue;
import com.algo.queue.impl.PriorityQueue;

public class Main {
 
	public static void main(String[] args) {
		 
		Queue pq = new PriorityQueue();
		int[] arr = {10,5,20,3,9,6,13};
		System.out.println(Arrays.toString(arr));
		for(int i : arr)
		{
			pq.add(i);
		}
		
		pq.display();
		System.out.println("Remove Min element : "+ pq.removeMin());
		pq.display();

	}

}
