package com.NoCodeNoLife;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("./out.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		PrintWriter printWriter = new PrintWriter(file);
		String resource = "this|is|the|information";
		String[] strings = resource.split("\\|");
		for (int i = 0; i < strings.length; i++) {
			printWriter.println(strings[i]);
			printWriter.flush();
		}
		printWriter.close();
	}
}
