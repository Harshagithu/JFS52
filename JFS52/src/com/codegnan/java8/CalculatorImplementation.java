package com.codegnan.java8;

public class CalculatorImplementation  {

	
	public static void main(String args[])
	{
		Calculator add=(first,second) -> first + second;
		Calculator product=(first,second)-> first * second;
		System.out.println(add.calculate(20, 10));
		System.out.println(product.calculate(5,2));
	}
}
