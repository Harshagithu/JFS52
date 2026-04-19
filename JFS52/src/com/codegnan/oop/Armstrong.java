package com.codegnan.oop;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int temp=n;
        int power=Integer.toString(n).length();
        int sum=0;
        while(n>0)
        {
        	int r=n%10;
        	sum+=Math.pow(r, power);
        	n/=10;
        }
        if(sum==temp)
        {
        	System.out.println("Given number is armstrong number");
        }
        else
        {
        	System.out.println("Given number is not armstrong number");
        }
	}

}
