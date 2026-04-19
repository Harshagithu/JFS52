package com.codegnan.oop;

import java.util.Scanner;

public class VowOrCon {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		char ch=Sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			System.out.println(ch+" is a consonant");
		}

	}

}
