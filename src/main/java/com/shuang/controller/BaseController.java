package com.shuang.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value="/kservice")
public class BaseController {
	
	protected MediaType version1json = new MediaType("application","vnd.fnma-v1+json");
	
	public MediaType getVersion1json() {
		return this.version1json;
	}
	
	protected boolean isMediaTypeValid(final String mediaType) {
		return mediaType.contains(MediaType.APPLICATION_JSON_VALUE) || mediaType.equals(this.getVersion1json().toString());
	}
	

}
