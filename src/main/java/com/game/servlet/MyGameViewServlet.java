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

import com.game.model.MyGame;
import com.game.service.MyGameServiceImpl;

import java.util.List;


@WebServlet("/MyGameViewServlet")
public class MyGameViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        
        MyGameServiceImpl myGameServiceImpl = new MyGameServiceImpl();
        HttpSession session=request.getSession(false);
        
        
        // when session is not null 
        if(session!=null && null != session.getAttribute("cid")){
	        	
	        	try {
	        		
		        	int cusid = (Integer)session.getAttribute("cid");  
		        	
		        	List<MyGame> mygamelist = myGameServiceImpl.getMyGame(cusid);
		        	
		        	request.setAttribute("mygamelist", mygamelist);
	        	}
	        	catch (Exception e) {
					e.printStackTrace();
				}
	        	
	        	
	        	RequestDispatcher dispatcher =  request.getRequestDispatcher("WEB-INF/views/my_games.jsp");
	        	dispatcher.forward(request, response);
	        
        }else{  
        	//if session null  redirect login page
            request.getRequestDispatcher("GameLog.jsp").include(request, response);  
            out.print("Please login first");  
        }
        
        out.close();  
     
	}

}
