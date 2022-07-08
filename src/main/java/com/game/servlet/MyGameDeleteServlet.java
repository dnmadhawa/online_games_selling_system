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

@WebServlet("/MyGameDeleteServlet")
public class MyGameDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myID = request.getParameter("myID");

		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(false);
        
        // when session is not null 
        if(session!=null && null != session.getAttribute("cid")){
			boolean isTrue;
			MyGameServiceImpl myGameServiceImpl = new MyGameServiceImpl();
			isTrue = myGameServiceImpl.deleteMyGame(myID);
						
			if(isTrue == true) {
				//Delete successes
				out.println("<script type='text/javascript'>");
				out.println("alert('Game is removed');");
				out.println("location='./my_game'");
				out.println("</script>");
			}else {
				//Delete Failed
				out.println("<script type='text/javascript'>");
				out.println("alert('Deleted unsuccessful');");
				out.println("location='./my_game'");
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
