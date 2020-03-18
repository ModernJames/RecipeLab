package com.recipe.lab.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.recipe.lab.test.dao.ITestDao;

@Service(value="testService")
public class TestService implements ITestService{

	@Resource(name="testDao")
	private ITestDao testDao;

	/**
	 * @author 김현재
	 * @since 2020.03.16	
	 */
	@Override
	public boolean dbConnectionTest() throws Exception {		
		return testDao.dbConnectionTest();
	}

}
