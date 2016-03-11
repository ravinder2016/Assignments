package com.algo.queue.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = {10,5,7,2,8,3,1};
		for(int i : arr)
		{
			list.add(i);
		}
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		

	}

}
