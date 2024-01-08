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

import Entity.Factory;
import Entity.Hospital;

@WebServlet("/addhospitals")
public class AddHospital extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                  response.setContentType("text/html");
		EntityManager em = Factory.factory().createEntityManager();
		EntityTransaction et = em.getTransaction();
         try {
		Hospital h1 = new Hospital(Integer.parseInt(request.getParameter("hid")), request.getParameter("hname"),
				request.getParameter("ceo"), null);
		
		   et.begin();
		   em.persist(h1);
		   et.commit();
		   HttpSession session = request.getSession();
		   session.setAttribute("hid",Integer.parseInt(request.getParameter("hid")) );
		   response.getWriter().print("<h1> Hospital add successfully ...</h1>");
		   RequestDispatcher rd = request.getRequestDispatcher("Ceopage.jsp");
		  rd.include(request, response);
         }catch (Exception e) {
        	 HttpSession session = request.getSession();
        	 session.setAttribute("hid",Integer.parseInt(request.getParameter("hid")) );
        	 response.getWriter().print("<h1> some thing is Wronge ...</h1>");
        	 RequestDispatcher rd = request.getRequestDispatcher("Ceopage.jsp");
   		  rd.include(request, response);
		}  
		   

	}

}
