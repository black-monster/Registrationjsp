package com.nissan.training.registration_assignment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nissan.training.registration_assignment.bean.RegistrationBean;
import com.nissan.training.registration_assignment.services.RegistrationServices;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    RegistrationBean user = new RegistrationBean();
		
	     user.setUsername(username);
	     user.setPassword(password);
	     RegistrationServices registerUser = new RegistrationServices();
	     System.out.println("hi");
	     registerUser.connect();
	     
	     registerUser.addUser(user);
	     
	     RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
	     rd.forward(request, response);
	     


	}

}
