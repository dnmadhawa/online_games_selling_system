package com.game.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.model.announcement;
import com.game.service.announcementService;

/**
 * Servlet implementation class announcementShowServlet
 */
@WebServlet("/announcementShowServlet")
public class announcementShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String announcementID = "1" ;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID ="1";
		
		if (ID == null) {
			//do nothing
		} 
		else {
		if (ID.isEmpty() ) {
			//do nothing
		}else {
			announcementID = ID;
		}
		}
		try {
			List<announcement> announceDetails = announcementService.getAnnouncementDetails(announcementID);
			request.setAttribute("announcementDetails", announceDetails);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("phome.jsp");
		dis.forward(request, response);
	}

}
