package com.codegnan.oop;

import java.util.Scanner;

public class CountofEvenDigit {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int EvenDigitCount=0;
        while(n>0)
        {
        	int r=n%10;
        	if(r%2==0)
        	{
        		EvenDigitCount++;
        	}
        	n/=10;
        }
        System.out.println(EvenDigitCount);

	}

}
