package com.board.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.board.config.RootConfig.class})
public class BoardMapperTest {
	
	@Setter(onMethod_= @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void getListTest() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void insertTest() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("타이틀");
//		board.setContent("내용");
//		board.setWriter("작성자2");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void insertSelctKeyTest() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("new타이틀");
//		board.setContent("new내용");
//		board.setWriter("new작성자2");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info("insertSelectKey : "+board);
//	}
//	
//	@Test
//	public void readTest() {
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void deleteTest() {
//		log.info("DELETE COUNT : " + mapper.delete(3L));
//	}
//	
//	@Test
//	public void updateTest() {
//		BoardVO board = new BoardVO();
//		
//		board.setBno(2L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("USER00");
//		
//		int count = mapper.update(board);
//		log.info(count);
//	}
//	
//	@Test
//	public void testPaging() {
//		
//		Criteria cri = new Criteria();
//		
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//	}
	
	@Test
	public void testSearch() {
		
		Criteria cri = new Criteria();
		cri.setKeyword("제목");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
}
