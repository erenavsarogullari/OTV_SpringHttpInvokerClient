package com.otv.http.client;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otv.http.server.IHttpUserService;
import com.otv.user.User;


/**
 * Http User Service Client
 * 
 * @author  onlinetechvision.com
 * @since   24 Feb 2012
 * @version 1.0.0
 *
 */
public class HttpUserServiceClient {  
	
	private static Logger logger = Logger.getLogger(HttpUserServiceClient.class);
	
	/**
	 * Main method of the Http User Service Client
	 * 
	 */
	public static void main(String[] args) {
		
		logger.debug("Http User Service Client is starting...");
		
		//Http Client Application Context is started... 
		ApplicationContext context = new ClassPathXmlApplicationContext("httpClientAppContext.xml");
		
		//Remote User Service is called via Http Client Application Context...
		IHttpUserService httpClient = (IHttpUserService) context.getBean("HttpUserService");

		//New User is created...
		User user = new User();
		user.setId(1);
		user.setName("Bruce");
		user.setSurname("Willis");
		
		//The user is added to the remote cache...
		httpClient.addUser(user);
		
		//The users are gotten via remote cache...
		httpClient.getUserList();
		
		//The user is deleted from remote cache...
		httpClient.deleteUser(user);
		
		//The users are gotten via remote cache...
		httpClient.getUserList();
		
		logger.debug("Http User Service Client is stopped...");
	}
}
