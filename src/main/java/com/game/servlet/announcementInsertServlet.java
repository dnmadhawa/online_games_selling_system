package com.game.servlet;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.game.service.*;


@WebServlet("/announcementInsertServlet")
public class announcementInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String announcement = request.getParameter("announcement");
		String description = request.getParameter("description");
		String section = request.getParameter("section");
		String announcementHead = request.getParameter("announcementHead");
		
		boolean successState;
		
		successState = announcementService.insertAnnouncement(announcement, description, section, announcementHead);
		
		if(successState == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement insertion is successful ');");
			out.println("location='editAnnouncement.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement insertion is unsuccessful. try again !!!');");
			out.println("location='insertAnnouncement.jsp'");
			out.println("</script>");
		}
	}

}
