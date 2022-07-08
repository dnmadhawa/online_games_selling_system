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
import com.game.model.*;
import com.game.service.*;


@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private boolean loginState;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		InterfaceAdminService admin1 = new adminServiceImpl();
		
		try {
			
		
		
		
		
		List<Admin> admin_Details = admin1.validate(userName, password);               
		request.setAttribute("adminDetails", admin_Details);
		
		
		
		
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		loginState = admin1.getLoginState();
		
		if (loginState == true) {
		
		RequestDispatcher dis = request.getRequestDispatcher("adminAccount.jsp");
		dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect try again');");
			out.println("location='adminLogin.jsp'");
			out.println("</script>");
		}
		
	}

}
