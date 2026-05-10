package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(100,20,20,250,1,300,250);
		
		//filter() - selects elements based on conditions
		Stream<Integer> stream=numbers.stream();
		List<Integer> evenNumbers=stream.filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//Map() - to transform each element of the stream
		List<String> namesList=Arrays.asList("Ali","Raj","Bose","Sravan","john");
		List<String> transformedList=namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(transformedList);
		
		//limit
		List<String> limitedList=transformedList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedList);

		//Sorted()
		List<Integer> result=numbers.stream().filter(n->n%2==0).distinct().map(n->n*10).sorted().collect(Collectors.toList());
		System.out.println(result);
		
		//Reduce() - combine all elements of a stream into a single result.
		List<Integer> numList=Arrays.asList(1,2,3,4);
		int sum=numList.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		//forEach() - iterate the elements
		numList.stream().forEach(n->System.out.println(n));
	}

}
