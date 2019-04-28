package com.shuang.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value="/moment")
public class BaseController {
	
	protected MediaType version1json = new MediaType("application");
	
	
	public MediaType getVersion1json() {
		return this.version1json;
	}
	
	protected boolean isMediaTypeValid(final String mediaType) {
		return mediaType.contains(MediaType.APPLICATION_JSON_VALUE) || mediaType.equals(MediaType.TEXT_PLAIN_VALUE) || mediaType.equals(this.getVersion1json().toString());
	}
	

}
