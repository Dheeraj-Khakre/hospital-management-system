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

import Entity.Branch;
import Entity.Doctor;
import Entity.Factory;


@WebServlet("/adddoctor")
public class AddDoctor extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   EntityManager em = Factory.factory().createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   Branch b = (Branch) em.find(Branch.class,Integer.parseInt(request.getParameter("bid")) );
		  Doctor d = new Doctor(request.getParameter("email"),request.getParameter("psw"),request.getParameter("name"),request.getParameter("graduation"),Integer.parseInt(request.getParameter("yoe")),b);
		//  d.setDoc_Id(Integer.parseInt(request.getParameter("id")));
		   List<Doctor> dl= new ArrayList<Doctor>();
		   dl.add(d);
		   b.setDoctors(dl);
		et.begin();
		em.merge(d);
		em.merge(b);
		et.commit();
		

		response.setContentType("text/html");
		response.getWriter().print("<h2> Doctor  Details Added ..</h2>");
		request.getRequestDispatcher("BranchPage.jsp").include(request, response);
		
	}
}
