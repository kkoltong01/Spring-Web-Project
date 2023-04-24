package com.board.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Log4j
@Component
public class LogAdvice {
	
	@Before("execution(* com.board.service.BoardService*.get(Long)) && args(bno)")
	public void logBefore(Long bno) {
		
		log.info("=====================================");
		log.info("get :" + bno);
	}
	
	@AfterThrowing(pointcut = "execution(* com.board.service.BoardService*.*(..))",
									throwing="exception")
	public void logExcption(Exception exception) {
		log.info("Exception----------------------------");
		log.info("exception :" + exception);
	}
}
