package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ProcessController {
	public ForWardController execute(HttpServletRequest request,
			                          HttpServletResponse response); 

}
