package com.board.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapeer {

	@Insert("insert into tbl_sample2 (col2) values (#{data})")
	public int insertCol2(String data);
}
