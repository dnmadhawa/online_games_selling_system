package com.game.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.game.model.Gplayer;
import com.game.service.GPlayerDBUtil2;


@WebServlet("/PlayerDetailsServlet")
public class PlayerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();  
		 HttpSession session=request.getSession(false);
	        
	    if(session!=null && null != session.getAttribute("cid")){
			try {
				int playid =  (int) session.getAttribute("cid");
				
				List<Gplayer> playerdetails = GPlayerDBUtil2.show(playid);
				request.setAttribute("playerdetails", playerdetails);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("playeraccount.jsp");
			rd.forward(request, response);
	    }else{  
            
            request.getRequestDispatcher("GameLog.jsp").include(request, response);  
            out.print("Please login first");  
        }
	}

}
