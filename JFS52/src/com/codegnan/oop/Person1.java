package com.codegnan.oop;

public class Person1 {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static String checkEligibility(int age) throws InvalidAgeException
	{
	   if(age>18)
	   {
		   return "Valid Age";
	   }
	   throw new InvalidAgeException("Invalid age");
	}

	public static void main(String args[])
	{
		try
		{
			String res=checkEligibility(15);
			System.out.println(res);
		}
		catch(InvalidAgeException e)
		{
		   System.out.println(e.getMessage());
		}
	}
}
