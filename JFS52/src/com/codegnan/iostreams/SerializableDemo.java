package com.codegnan.iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo{

	public static void main(String args[])
	{
		Employee employee=new Employee(100,"Raj",25);
		
		try(FileOutputStream fos=new FileOutputStream("employee.ser");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
				ObjectOutputStream oos=new ObjectOutputStream(bos);
				){
			oos.writeObject(employee);
			System.out.println("Employee Object serialized successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
