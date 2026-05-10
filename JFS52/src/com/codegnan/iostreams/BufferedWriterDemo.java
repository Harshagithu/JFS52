package com.codegnan.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String args[])
	{
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"))) {
			writer.write("Hello Codegnan");
			writer.newLine();
			writer.write("Buffered Writer is faster for large text files");
			writer.flush();
			System.out.println("Data written successfully to output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
