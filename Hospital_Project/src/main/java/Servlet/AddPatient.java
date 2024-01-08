package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Branch;
import Entity.Factory;
import Entity.Patient;

@WebServlet("/addpatient")
public class AddPatient extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = Factory.factory().createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		Branch b = (Branch) em.find(Branch.class,Integer.parseInt(request.getParameter("bid")) );
		Patient p = new Patient(request.getParameter("name"),Integer.parseInt(request.getParameter("age")) , request.getParameter("no"), request.getParameter("bg"));
		List<Patient> pl = new ArrayList<Patient>();
		pl.add(p);
		b.setPatients(pl);
		et.begin();
		em.merge(p);
		em.merge(b);
		et.commit();
		HttpSession session = request.getSession();
		session.setAttribute("pid", p.getP_id());


		response.setContentType("text/html");
		response.getWriter().print("<h2> Patient Details Added ..</h2>");
		request.getRequestDispatcher("AddDiseases.jsp").include(request, response);
	}

}
