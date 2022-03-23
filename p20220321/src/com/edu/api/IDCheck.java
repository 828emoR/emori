package com.edu.api;

public class IDCheck {

	public String getGender(String Gen) {

		char gender = Gen.charAt(7);

		Gen= Gen.replace("-" , "");
		Gen= Gen.replace(" " , "");
		
		switch (gender) {
		case '1':
		case '3':
			return "남정네";
		case '2':
		case '4':
			return "여편네";

		}
		return null;
	}
}
