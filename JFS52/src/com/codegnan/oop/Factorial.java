package com.codegnan.oop;
import java.util.*;
public class Factorial {
    public static int fact(int n) {
    	if(n==0)
    	{
    		return 1;
    	}
    	return n*fact(n-1);
    }
    
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		System.out.println(fact(n));

	}

}
