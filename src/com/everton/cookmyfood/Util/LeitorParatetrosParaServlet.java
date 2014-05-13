package com.everton.cookmyfood.Util;

import javax.servlet.http.HttpServletRequest;

public class LeitorParatetrosParaServlet {

	public static String ler(String string, HttpServletRequest request) {
		try {
			return request.getParameter(string);
		} catch (Exception e) {
			return "";
		}
	}

}
