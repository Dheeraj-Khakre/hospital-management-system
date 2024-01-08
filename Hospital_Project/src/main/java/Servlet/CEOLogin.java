package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ceologin")
public class CEOLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String email ="ceo@gmail.com";
	private String password = "ceo#321";
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		    if(email.equals(request.getParameter("email")) && password.equals(request.getParameter("psw"))) {
		    	
		    	
		    	response.sendRedirect("Ceopage.jsp");
		    }else{
		    	response.sendRedirect("index.jsp");
		    	 
		    }
		
		
	}

}
