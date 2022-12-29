package com.code.spring.enterprise.example.web;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.spring.enterprise.example.business.BusinessService;

@Component
public class MyWebController {

	@Autowired
	private BusinessService businessService;

	public long businessServiceMethod() {
		return businessService.calculateSum();
	}

}

