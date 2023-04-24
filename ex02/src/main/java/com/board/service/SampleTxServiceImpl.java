package com.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.Sample1Mapper;
import com.board.mapper.Sample2Mapeer;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class SampleTxServiceImpl implements SampleTxService {
	
	@Autowired
	private Sample1Mapper mapper1;
	private Sample2Mapeer mapper2;
	
	@Override
	public void addData(String value) {
		log.info("mapper1....................");
		mapper1.insert(value);
		
		log.info("mapper2...................");
		mapper2.insertCol2(value);
		
		log.info("end.........................");
	}
}
