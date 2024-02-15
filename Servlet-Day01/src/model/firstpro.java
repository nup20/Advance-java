package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/firstpro")
public class firstpro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();
    		
    		out.print("My first Servlet<br>");
    		out.print("<center><h4><b>My first Servlet</b></h4></center><br>");
    		out.print("do get() metthod is Executing.....<br>");
    		
    	
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
