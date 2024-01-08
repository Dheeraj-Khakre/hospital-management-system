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

import Entity.Diseases;
import Entity.Factory;
import Entity.Patient;

@WebServlet("/adddiseases")
public class AddDiseases extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EntityManager em = Factory.factory().createEntityManager();
		EntityTransaction et = em.getTransaction();

		Patient p = (Patient) em.find(Patient.class, Integer.parseInt(request.getParameter("pid")));
		List<Patient> pl = new ArrayList<Patient>();
		pl.add(p);
		Diseases d = new Diseases(request.getParameter("dname"), request.getParameter("symptoms"), pl);
		List<Diseases> dl = new ArrayList<Diseases>();
		dl.add(d);
		p.setDiseases(dl);
		et.begin();
		em.persist(d);
		em.merge(p);
		et.commit();

		response.setContentType("text/html");
		response.getWriter().print("<h2> Diseases  Details Added ..</h2>");
		request.getRequestDispatcher("BranchPage.jsp").include(request, response);

	}

}
