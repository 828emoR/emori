package com.yedam.myserver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcriptTest {
	@Test
	public void test() {
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder(6);
		String result = enc.encode("test123");
		System.out.println(result);
		assertTrue(enc.matches("test123", result));
	}

}
