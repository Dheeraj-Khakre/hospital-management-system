package Servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Address;
import Entity.Branch;
import Entity.Factory;

@WebServlet("/addaddress")
public class AddAddress extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		EntityManager em = Factory.factory().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try { 
			  HttpSession session = request.getSession();

			Branch b = (Branch) em.find(Branch.class, session.getAttribute("bid"));

			Address a = new Address();
			a.setDid(Integer.parseInt(request.getParameter("did")));

			a.setCity(request.getParameter("city"));
			a.setLandMark(request.getParameter("lm"));
			a.setPincode(Integer.parseInt(request.getParameter("pincode")));
			a.setState(request.getParameter("state"));
			a.setStreatName(request.getParameter("streat"));
			b.setAddress(a);
			a.setBranch(b);
			et.begin();
			em.persist(a);
			em.merge(b);

			response.getWriter().print("<h1> address added successfully ...</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("Ceopage.jsp");
			rd.include(request, response);
			et.commit();
		} catch (Exception e) {
			response.getWriter().print("<h1> branch not added some thing is Wronge ...</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("Ceopage.jsp");
			rd.include(request, response);
		}

	}

}
