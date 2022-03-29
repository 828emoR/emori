package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		//출력스트림을 문자기반으로 second.txt
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Fuckyou\n");
			fw.write("JAVA\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EOP");
		
	}

}
