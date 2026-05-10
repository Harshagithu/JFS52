package com.codegnan.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDirectoryDemo {

	public static void main(String args[]) throws IOException
	{
		File dir=new File("mydirectory");	
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
		
		File file1=new File(dir,"File1.txt");
		File file2=new File(dir,"File2.txt");
		File file3=new File(dir,"File3.txt");
		File file4=new File(dir,"File4.txt");
		File file5=new File(dir,"File5.txt");
		
		System.out.println("File1.txt created"+file1.createNewFile());
		System.out.println("File2.txt created"+file2.createNewFile());
		System.out.println("File3.txt created"+file3.createNewFile());
		System.out.println("File4.txt created"+file4.createNewFile());
		System.out.println("File5.txt created"+file5.createNewFile());
		
		String fileNamesArray[]=dir.list();
		for(String fileName: fileNamesArray){
			System.out.println(fileName);
		}
		
	}
}
