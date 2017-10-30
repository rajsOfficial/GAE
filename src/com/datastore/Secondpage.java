package com.datastore;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.*;

public class Secondpage extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		DatastoreService ds= DatastoreServiceFactory.getDatastoreService();
		
		res.getWriter().print(GAEServlet.e.getKey());
		res.setContentType("text/plain");
		res.getWriter().println("Saved succesfully   ");
	}

}
