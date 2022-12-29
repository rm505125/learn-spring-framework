package com.code.spring.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.spring.enterprise.example.data.DataService;

@Component
public class BusinessService {

	// Field dependency injection
	// @Autowired
	private DataService dataService;

	// constructor dependency injection
	public BusinessService() {
		this.dataService = dataService;
	}

	
	  // setter dependecy injection
	/*
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	*/
	   public long calculateSum() 
	   { 
	   List<Integer> data = dataService.getData(); 
	   return data.stream().reduce(Integer::sum).get(); 
	   }
	 

	

}
