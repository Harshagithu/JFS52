package com.codegnan.oop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int sum=0;
		int pro=1;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
				pro*=i;
			}
		}
		if(sum==pro)
		{
			System.out.println("Given Number is spy number");
		}
		else
		{
			System.out.println("Given Number is not a spy number");
		}

	}

}
