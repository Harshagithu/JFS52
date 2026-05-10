package com.codegnan.java8;

public class MyImpl {
	
	public static void main(String args[])
	{
		MyInterface m= ()->System.out.println("My Method implementation using lambda expression");
		m.myMethod1();
	}
    
}
