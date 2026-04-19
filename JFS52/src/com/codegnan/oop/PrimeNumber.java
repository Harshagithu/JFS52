package com.codegnan.oop;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		else
		{
			for(int i=3;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		if(isPrime(n))
		{
		  System.out.println("Given Number is Prime Number");
		}
		else
		{
			System.out.println("Given Number is not Prime Number");
		}
	}

}
