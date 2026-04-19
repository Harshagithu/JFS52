package com.codegnan.oop;

public class Student {
   int id;
   String name;
   String course;
   double fee;
   Student(int id, String name, String course, double fee)
   {
	   this.id=id;
	   this.name=name;
	   this.course=course;
	   this.fee=fee;
   }
   
   Student(String name)
   {
	   this(1,name,"Course Not assigned",1.0);
   }
   void display()
   {
	  System.out.println("ID: "+id);
	  System.out.println("Name: "+name);
	  System.out.println("Course: "+course);
	  System.out.println("Fee: "+fee);
    }
   public static void main(String args[])
   {
	   Student student=new Student("hv");
	   student.display();
   }
}
