package com.shuang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shuang.services.AccessCodeService;

@RestController
public class AccessController extends BaseController {
	
	@Autowired
	private AccessCodeService accessCodeService;
	
	@RequestMapping(value="/accesscode", method = RequestMethod.POST)
	public String getAccodeCode(@RequestBody final String access) {
		String code = accessCodeService.getAccess(access);
		return code;
		
	}
}
