package com.game.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.model.Gplayer;
import com.game.service.GPlayerDBUtil2;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("playid");
		
		boolean isTrue;
		RequestDispatcher rd;
		
		isTrue = GPlayerDBUtil2.deletePlayer(pid);
		
		if(isTrue==true) 
		{
			response.sendRedirect("./Logout");
		}
		else 
		{
			List<Gplayer> playerdetails = GPlayerDBUtil2.getPlayerDetails(pid);
			request.setAttribute("playerdetails", playerdetails);
			
			rd = request.getRequestDispatcher("playeraccount.jsp");
			rd.forward(request, response);
		}
		
	}

}
