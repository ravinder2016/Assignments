package com.set;

public class Employee{

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee : "+this.name;
	}
 
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		int hash = this.id;
		hash+=this.name.hashCode();
		System.out.println("Hash : "+hash);
		return hash;
		
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return (this.id == e.id) && (this.name.equals(e.name));
	}
	
}
