package com.game.servlet;

import java.io.IOException;





import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.game.model.*;
import com.game.service.*;

@WebServlet("/announcementRetrieveServlet")
public class announcementRetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	static String announcementID = "1" ;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID = request.getParameter("announcementID");
		
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
		
		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
	}

}
