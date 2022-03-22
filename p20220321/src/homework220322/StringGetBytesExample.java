package homework220322;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringGetBytesExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아무거나 입력하면 바이트 배열로 바꿔드립니다. 츄라이츄라이 \r\n" + "▼입력▼");
		
		String str = scn.next();
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {

			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
