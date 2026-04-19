package com.codegnan.oop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(sum==temp)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindorme");
		}

	}

}
