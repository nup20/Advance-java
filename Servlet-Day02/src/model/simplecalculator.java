package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/simplecalculator")
public class simplecalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		int p=Integer.parseInt(request.getParameter("p"));
		int r=Integer.parseInt(request.getParameter("r"));
		int t=Integer.parseInt(request.getParameter("t"));
		
		double SI = (p*r*t)/ 100;
	    out.println("<b>Simple intrest is:</b>"+SI);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
