package com.game.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.game.service.MyGameServiceImpl;



@WebServlet("/MyGameInsertServlet")
public class MyGameInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get parameter values
		String gid = request.getParameter("gameid");
		String gname = request.getParameter("gamename");
		String guname = request.getParameter("username");
		String gpass = request.getParameter("password");
		String gpoints = request.getParameter("points");
		String glang = request.getParameter("gamelang");

		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(false);
        
        // when session is not null 
        if(session!=null && null != session.getAttribute("cid")){
        	
        	int cusid=(Integer)session.getAttribute("cid");        

        	 boolean isTrue;
        	 MyGameServiceImpl myGameServiceImpl = new MyGameServiceImpl();
        	 isTrue = myGameServiceImpl.insertMyGame(gid, cusid, gname, guname, gpass, gpoints, glang);
			
			if(isTrue == true) {
				//Inserted Success
				out.println("<script type='text/javascript'>");
				out.println("alert('Your purchase was successful');");
				out.println("location='./my_game'");
				out.println("</script>");
			}else {
				//Inserted Fail
				out.println("<script type='text/javascript'>");
				out.println("alert('Error');");
				out.println("window.history.back();");
				out.println("</script>");
			}
		
	        
        } 
        else{  
        	//if session null  redirect login page
        	request.getRequestDispatcher("GameLog.jsp").include(request, response);  
            out.print("Please login first");  
        }
        out.close(); 
	}

}
