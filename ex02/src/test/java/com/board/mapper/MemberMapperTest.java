package com.board.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.board.domain.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={com.board.config.RootConfig.class})
@Log4j
public class MemberMapperTest {

  @Setter(onMethod_ = @Autowired)
  private MemberMapper mapper;
  
  
  @Test
  public void testRead() {
    
    MemberVO vo = mapper.read("admin90");
    
    log.info(vo);
    
    vo.getAuthList().forEach(authVO -> log.info(authVO));
    
  }
  
}


