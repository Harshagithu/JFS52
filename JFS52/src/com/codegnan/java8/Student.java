package com.codegnan.java8;

public class Student {

	String name;
	int marks;
	
	public Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
