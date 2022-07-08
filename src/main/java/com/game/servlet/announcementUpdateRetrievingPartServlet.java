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


@WebServlet("/announcementUpdateRetrievingPartServlet")
public class announcementUpdateRetrievingPartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String announcementID = request.getParameter("announcementID");
		
		try {
			List<announcement> announceDetails = announcementService.getAnnouncementDetails(announcementID);
			request.setAttribute("announcementDetails", announceDetails);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("viewToUpdateAnnouncement.jsp");
		dis.forward(request, response);
	}

}
