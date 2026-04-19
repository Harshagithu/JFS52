package com.codegnan.oop;

public class PrimeRangeNumbers {

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
		for(int i=1;i<=20;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
