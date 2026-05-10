package com.codegnan.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("javanotes.txt");
		File dir=new File("mynotes");
		dir.mkdir();
		file.createNewFile();
		System.out.println(file.exists());

	}

}
