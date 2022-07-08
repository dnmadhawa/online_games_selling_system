package com.game.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.service.GPlayerDBUtil2;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("playid");
		String pname = request.getParameter("playname");
		String pmail = request.getParameter("playmail");
		String ppass = request.getParameter("playpass");
		
		boolean isTrue;
		RequestDispatcher rd;
		
		isTrue = GPlayerDBUtil2.updatePlayer(pid, pname, pmail, ppass);
		
		if(isTrue==true)
		{
			
			response.sendRedirect("./account_player");
		}
		else 
		{
			rd = request.getRequestDispatcher("Unsuccess.jsp");
			rd.forward(request, response);
		}
	}

}
