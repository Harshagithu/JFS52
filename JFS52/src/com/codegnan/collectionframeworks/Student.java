package com.codegnan.collectionframeworks;

public class Student {
   int id;
   String name;
   public Student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }
   
   public String toString()
   {
	   return "ID: "+id+" Name: "+name;
   }
   
   public int hashCode()
   {
	   return id;
   }
   
   public boolean equals(Object obj)
   {
	   Student s=(Student)obj;
	   return s.id==this.id;
   }
}
