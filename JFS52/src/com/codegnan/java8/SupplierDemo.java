package com.codegnan.java8;

import java.util.function.Supplier;

public class SupplierDemo {
   
	public static void main(String args[]) {
	 	
		Supplier<String> greetingSupplier=()->"Welcome to java supplier functional interface application";
		String message=greetingSupplier.get();
		System.out.println(message);
				
	}
	
}
