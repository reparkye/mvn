package com.ict.mvn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ict.mvn.dao.TestDAO;
import com.ict.mvn.dao.Impl.TestDAOImpl;

/**
 * Unit test for simple App.
 */
public class AppTest{ 

	private TestDAO tdao = new TestDAOImpl();
	
	@Test
	public void test() {
		assertEquals(2,tdao.selectTestVOList(null).size());
	}

	
}
