package com.codegnan.java8;

@FunctionalInterface
public interface MyInterface {
  public void myMethod1();
  public static void myMethod2()
  {
	  System.out.println("My static method");
  }
  default void myMethod3()
  {
	  System.out.println("My default method");
  }
}
