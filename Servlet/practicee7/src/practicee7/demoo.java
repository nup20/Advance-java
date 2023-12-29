package practicee7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.runtime.Context;

public class demoo extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getContentType();
		PrintWriter out=resp.getWriter();
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("myself");
		
		ServletContext con=getServletContext();
	    String name1=con.getInitParameter("o2");
		
		
		out.print(name+"This is one of the best and most inspirational"
				+ name1+" short stories to read for children. "
				+ "Once upon a time, parents used to describe the "
				+ "stories of farmers,"+ name+ "which represent their greatness"
				+ " in farming the land, cultivating "+ name+"the crops, and "
				+ "helping the successful living of the citizens. In India,"
				+ " they are said to be the backbone of the country and "
				+ "citizens of India value them a lot."+ name);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req,resp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
