package com.game.servlet;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.game.service.*;


@WebServlet("/announcementUpdateServlet")
public class announcementUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String ID = request.getParameter("announcementID");
		String announ = request.getParameter("announcement");
		String des = request.getParameter("description");
		String sec = request.getParameter("section");
		String announHead = request.getParameter("announcementHead");
		
		boolean isTrue = true ;
		isTrue = announcementService.updateAnnouncement(ID, announ, des, sec, announHead);
		
		if (isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement update is successful ');");
			out.println("location='editAnnouncement.jsp'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement update is unsuccessful !!!');");
			out.println("location='updateIdForm.jsp'");
			out.println("</script>");
		}
		
		
		
	}

}
