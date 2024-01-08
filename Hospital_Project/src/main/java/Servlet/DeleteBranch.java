package Servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Branch;
import Entity.Factory;

@WebServlet("/deletebranch")
public class DeleteBranch extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   EntityManager em = Factory.factory().createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   Branch b = (Branch)em.find(Branch.class, Integer.parseInt(request.getParameter("bid")));
		   et.begin();
		   em.remove(b);
		   et.commit();
		   response.sendRedirect("allBranch");
	}

}
