package practice8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cooki extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String a=req.getParameter("uname");
		String b=req.getParameter("upass");
		
		out.print("<br>uname="+a);
		out.print("<br>uname="+b);
		out.print("<br><a href='profile'>go to profile</a>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req,resp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
