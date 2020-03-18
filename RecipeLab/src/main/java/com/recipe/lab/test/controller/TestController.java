package com.recipe.lab.test.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recipe.lab.test.service.ITestService;

@Controller
public class TestController {

	@Resource(name="testService")
	private ITestService testService;	
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * @author 김현재
	 * @since 2020.03.16
	 * @brief DB Connection 테스트 및 Test.jsp 페이지 이동
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() throws Exception{
		logger.info("test : GET");
		
		if(testService.dbConnectionTest())
			logger.info("DB Connect Success");
		return "/test";
	}
}
