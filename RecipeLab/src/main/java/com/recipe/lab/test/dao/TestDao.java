package com.recipe.lab.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value="testDao")
public class TestDao implements ITestDao {

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;	
	protected final String NAMESPACE = "com.recipe.lab.test.dao.TestDao.";
	
	/**
	 * @author 김현재
	 * @since 2020.03.16	
	 */	
	@Override
	public boolean dbConnectionTest() throws Exception {
		int result = sqlSession.selectOne(NAMESPACE + "testDBConnection");
		if(result == 1)
			return true;
		return false;
	}
	
}
