package com.shuang.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shuang.common.GlobalConstants;


@RestController
public class CustomerController extends BaseController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

//	@Autowired 
//	private CustomerService customerService;
//	
//	@RequestMapping(value="/retrieveCustomerData", produces= { MediaType.APPLICATION_JSON_VALUE, GlobalConstants.JSON_TYPE}, method = RequestMethod.POST)
//	public List<CustomerDTO> getCustomerData(){
//		List<CustomerDTO> customerList = null;
//		customerList = this.customerService.getAllCustomer();
//		return customerList;
//	}
	
}
