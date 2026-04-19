package com.codegnan.oop;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int sum=0;
        while(n>0)
        {
        	int r=n%10;
        	sum+=r;
        	n/=10;
        }
        System.out.println(sum);
	}

}
