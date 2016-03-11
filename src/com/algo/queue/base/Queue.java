package com.algo.queue.base;

public interface Queue {
	public int size();
	public void add(Integer obj);
	public Integer findMin();
	public Integer removeMin();
	public void display();
}
