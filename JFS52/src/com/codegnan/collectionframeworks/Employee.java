package com.codegnan.collectionframeworks;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	public Employee(int id, String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Employee id=" +id +", name="+name+",age="+age;
	}
	public int compareTo(Employee o) {
		return Integer.compare(this.age,o.age);
	}
	

}