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


@WebServlet("/MyGameEditServlet")
public class MyGameEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        
      //get parameter values
		String mygID = request.getParameter("mygID");
		String guname = request.getParameter("username");
		String gpass = request.getParameter("password");
		String gpoints = request.getParameter("points");
		String glang = request.getParameter("gamelang");
		 
          
        HttpSession session=request.getSession(false);
        
        // when session is not null 
        if(session!=null && null != session.getAttribute("cid")){
        	try {
        		boolean isTrue;
        		MyGameServiceImpl myGameServiceImpl = new MyGameServiceImpl();
    			isTrue = myGameServiceImpl.updateMyGame(mygID, guname, gpass, gpoints, glang);
    			
    			if(isTrue == true) {
    				//Updated Success
    				out.println("<script type='text/javascript'>");
    				out.println("alert('Update Successful');");
    				out.println("location='./my_game'");
    				out.println("</script>");
    			}else {
    				//Updated Fail
    				out.println("<script type='text/javascript'>");
    				out.println("alert('Update unsuccessful');");
    				out.println("location='./my_game'");
    				out.println("</script>");
    			}
        	}
        	catch (Exception e) {
				e.printStackTrace();
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
