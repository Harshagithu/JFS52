package com.codegnan.java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String args[])
	{
		BiPredicate<String,String> isFirstCharEqual=
				(str1,str2)->
		         {
			         char char1=str1.charAt(0);
			         char char2=str2.charAt(0);
			         return char1==char2;
		         };
		         
		if(isFirstCharEqual.test("Apple","Apricod"))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		if(isFirstCharEqual.test("Apple","Banana"))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
	
}
