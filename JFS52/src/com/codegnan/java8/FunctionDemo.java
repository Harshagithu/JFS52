package com.codegnan.java8;

import java.util.function.Function;

public class FunctionDemo {
	
   public static void main(String args[]) {
	   
	   Function<String,Integer> StringLengthFinder= str-> str.length();
	   System.out.println(StringLengthFinder.apply("Harsha"));
	   
	   Function<Integer,Integer> doublenumber= num-> num*2;
	   System.out.println(doublenumber.apply(10));
	   
	   Function<Integer,Integer> add10=i->i+5;
	   Function<Integer,Integer> doubleThenAdd10=doublenumber.andThen(add10);
	   System.out.println(doubleThenAdd10.apply(10));
	   
	   Function<Integer,Integer> Add10ThenDouble=doublenumber.compose(add10);
	   System.out.println(Add10ThenDouble.apply(10));
   }
   
}
