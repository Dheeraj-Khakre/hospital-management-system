package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Branch;
import Entity.Factory;
import Entity.Hospital;

@WebServlet("/addbranch")
public class AddBranch extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
            response.setContentType("text/html");
	EntityManager em = Factory.factory().createEntityManager();
	EntityTransaction et = em.getTransaction();
   try {
	      Branch b1= new Branch();
	         b1.setBid(Integer.parseInt(request.getParameter("bid")));
	         b1.setBname(request.getParameter("bname"));
	         b1.setDateOfCreation(new Date());
	         HttpSession session = request.getSession();
	         
	        // Hospital h1 = (Hospital)em.find(Hospital.class, session.getAttribute("hid"));
	         Hospital h1 = (Hospital)em.find(Hospital.class, 1221);
	         List<Branch> blist = new ArrayList<Branch>();
	          blist.add(b1);
	          h1.setBranchs(blist);
	          b1.setHospital(h1);
	   et.begin();
	   em.persist(b1);
	   em.merge(h1);
	   et.commit();
	 //  response.getWriter().print("<h1> Branch added successfully ...</h1>");
//	   em.close();
//	   Factory.close();
	  
	   session.setAttribute("bid",Integer.parseInt(request.getParameter("bid")) );
	   
	   response.getWriter().print("<h1> Branch added successfully ...</h1>");
	   RequestDispatcher rd = request.getRequestDispatcher("AddAddress.jsp");
	  rd.include(request, response);
   }catch (Exception e) {
  	 response.getWriter().print("<h1> branch not added some thing is Wronge ...</h1>");
  	 RequestDispatcher rd = request.getRequestDispatcher("Ceopage.jsp");
		  rd.include(request, response);
	}  
	   

	}

}
