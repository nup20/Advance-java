package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/simple")
public class simple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter m=response.getWriter();
		
		int noo1=Integer.parseInt(request.getParameter("no1"));
		int noo2=Integer.parseInt(request.getParameter("no2"));
		int noo3=Integer.parseInt(request.getParameter("no3"));
		int multi=noo1*noo2*noo3;
	
		m.print("Enter principal:"+noo1+"<br>");
		m.print("Enter Intrest Rate::"+noo2+"<br>");
		m.print(" Enter Time in years"+noo3+"<br>");
		m.print("Simple intrest:"+multi);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
