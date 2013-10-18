package org.mikechabot.web.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mikechabot.web.Controller;

public class RequestController extends Controller {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected String basePath() { return ""; }	
	
	@Override
	protected void initActions() {
		addAction("/get", new GetAction());
	}

	@Override
	protected Action defaultAction() {
		return new GetAction();
	}
	
	public class GetAction implements Action {
		public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
						
			String cookieName = "jsessionid";
			String jSessionId = null;
			
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
			     for (Cookie temp : cookies) {
                     if(temp.getName().equalsIgnoreCase(cookieName)) {
                    	 jSessionId = temp.getValue();
                     }
			     }
			}	
			
	        request.setAttribute("jSessionId", jSessionId);
			return basePath() + "/index.jsp";		
		}
	}
}