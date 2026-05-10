package com.codegnan.java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String args[])
	{
		Student student=new Student("Sam",60);
		Consumer<Student> addBonusMarks= (s) -> s.setMarks(s.getMarks()+20);
		addBonusMarks.accept(student);
		System.out.println(student.getMarks());
	}
}
