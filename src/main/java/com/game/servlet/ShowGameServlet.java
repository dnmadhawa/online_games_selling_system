package com.game.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.model.Game;
import com.game.service.MyGameServiceImpl;



@WebServlet("/ShowGameServlet")
public class ShowGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			MyGameServiceImpl myGameServiceImpl = new MyGameServiceImpl();
        	List<Game> mygamelist = myGameServiceImpl.getGame();
        	request.setAttribute("gamelist", mygamelist);
        	
        	RequestDispatcher dispatcher =  request.getRequestDispatcher("WEB-INF/views/store.jsp");
        	dispatcher.forward(request, response);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
	}

}
