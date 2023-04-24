package com.board.config;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class DataSourceTest {
	
	@Setter(onMethod_= @Autowired)
	private DataSource dataSource;
	
	@Setter(onMethod_= @Autowired)
	private SqlSessionFactory sqlsessionFactory;
	
	@Test
	public void dataSourceTest() {
		try(Connection con = dataSource.getConnection()) {
			log.info(con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void sqlsessionFactoryTest() {
		try(SqlSession session = sqlsessionFactory.openSession();
				Connection con = session.getConnection();
				) {
			log.info(session);
			log.info(con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
