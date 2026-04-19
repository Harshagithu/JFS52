package com.codegnan.oop;

import java.util.*;

public class ArrayDemo {
	
	public static void main(String[] args) {	
		int cpy[]= {1,2,3,4,5,6};
		int cpy1[]=Arrays.copyOf(cpy, cpy.length);
		System.out.println(Arrays.toString(cpy1));
		int cpy2[]=Arrays.copyOfRange(cpy, 2, 5);
		System.out.println(Arrays.toString(cpy2));
		int cpy3[]=new int[10];
		Arrays.fill(cpy3, 1);
		System.out.println(Arrays.toString(cpy3));
	}
	
}