package com.shuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController extends BaseController {

	@RequestMapping(value="/ping/v1", method = RequestMethod.GET)
	public String ping() {
		return "Kevin!";
	}
}
