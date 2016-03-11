package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
 
	public static void main(String[] args) {
		
		Set<Employee> hs = new HashSet<Employee>();
		Employee e = new Employee(1,"Ravinder");
		hs.add(e);
		e=new Employee(1, "Ravinder");
		hs.add(e);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
