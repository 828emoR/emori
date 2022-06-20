package com.yedam.myserver.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;



@Component
public class LoginSuccesshandler implements AuthenticationSuccessHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginSuccesshandler.class);
	@Override
	public void onAuthenticationSuccess(HttpServletRequest req,HttpServletResponse res, 
    							Authentication authdata)
			throws IOException, ServletException {
			String name = authdata.getName();
			logger.info("Handler ===="+ name);
			res.sendRedirect("top.jsp");
	}
	

}
