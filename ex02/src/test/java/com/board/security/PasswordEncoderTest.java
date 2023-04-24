package com.board.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.board.config.RootConfig.class,com.board.config.SecurityConfig.class})
@Log4j
public class PasswordEncoderTest {

	@Autowired
	private PasswordEncoder pwEncoder;
	
	@Test
	public void testEncoder() {
		
		String str = "member";
		
		String enStr = pwEncoder.encode(str);
		
		//$2a$10$RAwRs5XlC4wepOpz1RCGOuwPrXidLlXNVVoq887JM8gLrsdD9eM1e
		log.info(enStr);
	}
}
