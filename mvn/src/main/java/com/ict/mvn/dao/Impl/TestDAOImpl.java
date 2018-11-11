package com.ict.mvn.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ict.mvn.dao.TestDAO;
import com.ict.mvn.vo.TestVO;

public class TestDAOImpl implements TestDAO {

	private SqlSessionFactory ssf;
	
	private SqlSession ss;
	
	public List<TestVO> selectTestVOList(TestVO test) {
		// TODO Auto-generated method stub
		return ss.selectList("test.mvn.sp.TestMapper.selectTest",test);
	}

	public TestVO selectTestVO(Integer tnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("test.mvn.sp.TestMapper.selectTest",tnum);
	}

}
