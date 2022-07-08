package com.game.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.service.*;

/**
 * Update game servlet
 */
@WebServlet("/UpdategameServlet")
public class UpdategameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
		
		String GameID = request.getParameter("Gid");
        String Gname = request.getParameter("name");
		String DeveloperID = request.getParameter("Did");
		String create_date = request.getParameter("date");
		String Genre = request.getParameter("genre");
		String platform = request.getParameter("platform");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		
		boolean isTrue;
		
		isTrue = GameDBUtil.updategame(GameID,Gname, DeveloperID,create_date, Genre, platform, price, description);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Game Updated');");
			out.println("location='./games'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Error');");
			out.println("location='./games'");
			out.println("</script>");
		}
	}

}
