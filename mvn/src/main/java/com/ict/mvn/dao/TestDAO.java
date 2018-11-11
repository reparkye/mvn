package com.ict.mvn.dao;

import java.util.List;

import com.ict.mvn.vo.TestVO;

public interface TestDAO {

	public List<TestVO> selectTestVOList(TestVO test);
	public TestVO selectTestVO(Integer tnum);
	
}
