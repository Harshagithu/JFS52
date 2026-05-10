package com.codegnan.collectionframeworks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EmployeeDemo {
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(100,"Raj",50));
		empList.add(new Employee(101,"john",20));
		empList.add(new Employee(10,"Kishor",30));
		empList.add(new Employee(200,"Ram",45));
		System.out.println(empList);
		Collections.sort(empList);
		for(Employee e:empList)
		{
			System.out.print(e);
		}
		
		
		
		
	}

}