package com.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.board.config.RootConfig;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class SampleTxServiceTests {

	@Autowired
	private SampleTxService service;
	
	@Transactional
	@Test
	public void testLong() {
		
		String str = "Starry\r\n" +
					"Starry night\r\n" +
					"No sibal keep going\r\n" +
					"No sibal keep going";
		
		log.info(str.getBytes().length);
		
		service.addData(str);
	}
}
