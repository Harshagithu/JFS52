package com.codegnan.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String args[]) throws IOException {
		
		//FileWriter(String filename)
		FileWriter writer=new FileWriter("fileWriter.txt");
		writer.write("India is great");
		writer.write("\n");
		writer.write("India is a big country");
		writer.write("\n");
		char charArray[]= {'a','b','c','d','e'};
		char myChar='A';
		writer.write(charArray);
		writer.write("\n");
		writer.write(myChar);
		writer.flush();
//		//FileWriter(File f)
//		File file=new File("fileWriter2.txt");
//		FileWriter writer1=new FileWriter(file);
		
	}
}
