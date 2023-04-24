package com.board.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {
	@Insert("insert into tbl_sample1 (col) values(#{data})")
	public int insert(String data);
}
