package com.game.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.service.*;


@WebServlet("/DeletegameServlet")
public class DeletegameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
		String GameID = request.getParameter("Gid");
		boolean isTrue;
		
		isTrue = GameDBUtil.deletegame(GameID);
		/*show the alert game details are delete*/
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Game deleted');");
			out.println("location='./games'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('error');");
			out.println("location='./games'");
			out.println("</script>");
	
		}
	}

}