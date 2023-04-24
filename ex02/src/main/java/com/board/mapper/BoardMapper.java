package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	//기본키 알 필요 없을 때
	public void insert(BoardVO board);
	
	//기본키 알아야 할 때 (쿼리 2번 수행)
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public int getTotalCount(Criteria cri);
	
	public int updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
}
