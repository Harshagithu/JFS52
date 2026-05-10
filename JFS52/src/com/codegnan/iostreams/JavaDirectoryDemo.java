package com.codegnan.iostreams;

import java.io.File;
import java.io.IOException;

public class JavaDirectoryDemo {
	
	public static void main(String args[]) throws IOException
	{
		File dir=new File("java");	
		if(!dir.exists())	
		{
			if(dir.mkdir())
			{
				System.out.println("Directory Created: "+dir.getAbsolutePath());
			}
			else
			{
				System.out.println("Failed to create a directory");
			}
		}
		else
		{
			System.out.println("Directory already exits! "+dir.getAbsolutePath());
		}
		
		File file1=new File(dir,"oops.txt");
		File file2=new File(dir,"strings.txt");
		File file3=new File(dir,"exceptions.txt");
		
		System.out.println("oop.txt created"+file1.createNewFile());
		System.out.println("strings.txt created"+file2.createNewFile());
		System.out.println("exceptions.txt created"+file3.createNewFile());
		
		String fileNamesArray[]=dir.list();
		for(String fileName: fileNamesArray){
			System.out.println(fileName);
		}
		
	}
}
