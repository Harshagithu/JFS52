package com.codegnan.collectionframeworks;

import java.util.Set;
import java.util.LinkedHashSet;

public class StudentSetDemo1 {

	public static void main(String[] args) {
		Set<Student> s=new LinkedHashSet<>();
		s.add(new Student(1,"harsha"));
		s.add(new Student(2,"sathvik"));
		s.add(new Student(3,"Dp"));
		s.add(new Student(1,"harsha"));
		for(Student student:s)
		{
			System.out.println(student);
		}

	}

}
