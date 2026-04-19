package com.codegnan.oop;

import java.util.Scanner;

public class CharactersCount {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		String str=Sc.nextLine();
		int count1=0,count2=0,count3=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				count1++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				count2++;
			}
			else
			{
				count3++;
			}
		}
		System.out.println(count1+" alphabets");
		System.out.println(count2+" digits");
		System.out.println(count3+" Special Characters");

	}

}
