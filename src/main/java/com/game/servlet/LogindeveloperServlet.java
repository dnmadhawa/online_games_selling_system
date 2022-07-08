package com.game.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.service.*;


@WebServlet("/LogindeveloperServlet")
public class LogindeveloperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        
		String DuserName = request.getParameter("Dusername");
		String password = request.getParameter("password");
		
boolean isTrue;
		
		isTrue = DeveloperDBUtil.validate(DuserName, password);
		
		if (isTrue == true) {
			//List<Developer> cusDetails = DeveloperDBUtil.getCustomer(DuserName);
			//request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Gameinsert.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='login_D.jsp'");
			out.println("</script>");
		}
		
	}


}
