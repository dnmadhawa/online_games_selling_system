package com.game.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.game.service.*;


@WebServlet("/announcementDisplayAllServlet")
public class announcementDisplayAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
StringBuffer display = new StringBuffer("list of anoouncement");
		
		int highest = announcementService.getHighestID();
		int lowest = announcementService.getLowestID();
		
		
		try {
		for (int low = lowest ; low <= highest ; low ++ ) {
			int toCast = low;
			String announID = String.valueOf(toCast);
			display.append(".................		||		~~~");
			display.append("AnnouncementID =");
			display.append(announID);
			display.append(" ** ");
			display.append("Announcement. Head =");
			
			display.append(announcementService.getAnnouncementHead(announID));
			display.append(".		||		.");
			 
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		StringBuffer displayS = display;
		request.setAttribute("displayString", displayS);
		
		RequestDispatcher dis = request.getRequestDispatcher("editAnnouncement.jsp");
		dis.forward(request, response);
		
		StringBuffer cleaner = new StringBuffer("~"); 
		display = cleaner;
	}

	}


