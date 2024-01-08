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
import Entity.Manager;

@WebServlet("/addmanager")
public class AddManager extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   EntityManager em = Factory.factory().createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   Branch b = (Branch) em.find(Branch.class,Integer.parseInt(request.getParameter("bid")) );
		  Manager m = new Manager(request.getParameter("email"),request.getParameter("psw"),request.getParameter("name"),request.getParameter("graduation"),Integer.parseInt(request.getParameter("yoe")),b);
		   b.setManager(m);
		et.begin();
		em.persist(m);
		em.merge(b);
		et.commit();
		em.close();
		response.setContentType("text/html");
		response.getWriter().print("<h2> Manager Details Added ..</h2>");
		request.getRequestDispatcher("BranchPage.jsp").include(request, response);
		
	}

}
