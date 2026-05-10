package com.codegnan.java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> isPositive=(num)->num>0;
		boolean result = isPositive.test(-23);
		System.out.println(result);
		
		Predicate<String> isLength=(str)->str.length()>5;
		System.out.println(isLength.test("Hello1"));
		
		Predicate<Integer> isEvenOdd=(num)->num%2==0;
		if(isEvenOdd.test(12))
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}

}
