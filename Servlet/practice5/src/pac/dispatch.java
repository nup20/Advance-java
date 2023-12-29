package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dispatch")
public class dispatch extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<i>welcome serv</i><br>");
		String a=request.getParameter("uname");
		String b=request.getParameter("upass");
		out.print("name="+a+"<br>");
		out.print("password="+b);	
		if((a.equals("admin"))&&(b.equals("abc"))){
			
			response.sendRedirect("http://wwwgoogle.com");
			out.print("<br>login");
		}else
		{
			//send data
			RequestDispatcher d=request.getRequestDispatcher("index.html");
//			d.include(request, response);
			d.forward(request, response);
			
					out.print("<p style=color:red;>Sorry login again</p>");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
