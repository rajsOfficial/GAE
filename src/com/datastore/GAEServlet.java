package com.datastore;

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;
import com.google.appengine.api.datastore.*;


@SuppressWarnings("serial")
public class GAEServlet extends HttpServlet {
	static Entity e= new Entity("School Table");

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		DatastoreService ds= DatastoreServiceFactory.getDatastoreService();
		
		Entity e= new Entity("School Table");
		e.setProperty("Name",req.getParameter("name"));
		e.setProperty("Mathematics",req.getParameter("math"));
		e.setProperty("Subname",req.getParameter("sname"));
		
		Key k= KeyFactory.createKey("School Table", 123);
		
		ds.put(e);
		req.getRequestDispatcher("second").forward(req, res);
		
	}
}



