package com.game.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.service.*;


@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String cpassword = request.getParameter("cpass");
		
        boolean isTrue;
		
		RequestDispatcher rd;
		
		isTrue = GPlayerDBUtil2.enter(name,email, password,cpassword);
		

		try
		{
			if(isTrue ==true) 
			{

				rd = request.getRequestDispatcher("GameLog.jsp");
				rd.forward(request, response);
			}
			else 
			{
				rd = request.getRequestDispatcher("Signup.jsp");
				rd.forward(request, response);
			}
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	

}
