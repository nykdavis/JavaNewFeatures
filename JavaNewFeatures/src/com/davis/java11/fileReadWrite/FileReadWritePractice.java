package com.davis.java11.fileReadWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadWritePractice {

	public static void main(String[] args) {
		var path = "D:\\File\\Java11.txt";

		try {
			//Writting into the file
			Files.writeString(Path.of(path), "2. Read and Write File  -> reduct hte coading effort from "
					+ "reading and writting into the file.", StandardOpenOption.APPEND);
			
			//Reading from the File
			String Data = Files.readString(Path.of(path));
			System.out.println(Data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
