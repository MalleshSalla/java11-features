package com.java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {
	public static void main(String[] args) {
		var path = "C://Users//SMALLESH//Desktop//Html//StudentList.txt";
		try {
		
			Files.writeString(Path.of(path), "", StandardOpenOption.APPEND);// adding content to the file
			String data=Files.readString(Path.of(path));// to read data in file
			System.out.println(data);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}  	 	
}
