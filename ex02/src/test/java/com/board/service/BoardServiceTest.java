package com.board.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {com.board.config.RootConfig.class})
public class BoardServiceTest {
	
	@Autowired
	private BoardService service;
	
//	@Test
//	public void testService() {
//		log.info(service);
//		log.info(service.getClass().getName());
//	}
	
	@Test
	public void testGet() throws Exception {
		log.info(service.get(1L));
	}
	
//	@Test
//	public void testRegister() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 글");
//		board.setContent("새로운 내용");
//		board.setWriter("user11");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물 번호 : " + board.getBno());
//	}
//	
//	@Test
//	public void testGetList() {
//		
//		Criteria cri = new Criteria();
//		cri.setAmount(10);
//		cri.setPageNum(2);
//		//service.getList().forEach(board -> log.info("getList........." + board));
//		
//		service.getList(cri).forEach(board -> log.info(board));
//	}
//	
//	
//	@Test
//	public void testUpdate() {
//		
//		BoardVO board = service.get(1L);
//		
//		if(board == null) {
//			return;
//		}
//		
//		board.setTitle("수정된 제목ㅎㅎㅎ");
//		log.info("modify--------" + service.modify(board));
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		log.info("DELETE-------------" + service.remove(1L));
//	}
}
