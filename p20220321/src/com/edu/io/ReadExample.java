package com.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadExample {
	public static void main(String[] args) {
		try {
			//문자기반 스트림(한문자씩) 입력스틂==람
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read()){
				System.out.println((char)readChar);
			}
 			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				}

}
