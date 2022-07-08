package com.game.servlet;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.game.service.*;


@WebServlet("/announcementDeleteServlet")
public class announcementDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String announcementID = request.getParameter("announcementID");
		
		boolean successState ;
		
		successState = announcementService.deleteAnnouncement(announcementID);
		
		if (successState == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement deletion is successful ');");
			out.println("location='editAnnouncement.jsp'");
			out.println("</script>");
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Announcement deletion is successful. try again !!! ');");
			out.println("location='DeleteIdForm.jsp'");
			out.println("</script>");
		}
	}

}
