package com.bit.controller;

public class MapperServlet {
	
	public static ProcessController getMapper(String cmd) {
		ProcessController processController=null;

		if(cmd.equalsIgnoreCase("multi")) {
			processController = new MultiSelectController("dbBase/multiView.jsp", false);
		}

		if(cmd.equalsIgnoreCase("login")) {
			processController = new AccountController("login/tmp.jsp", false);
		}


		return processController;
	}

}
