package com.game.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.game.service.*;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		int cid;
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
		
		RequestDispatcher rd;
		
		cid = GPlayerDBUtil2.validate(email, password);
		
		
		if(cid > 0) 
		{
			HttpSession session=request.getSession();  
	        session.setAttribute("cid",cid);  
	        
	        out.println("<script type='text/javascript'>");
			out.println("location='./store'");
			out.println("</script>");
		}
		else 
		{
			rd = request.getRequestDispatcher("GameLog.jsp");
			rd.forward(request, response);
			out.println("Invalid Email or Password ");
		}
	}

}
