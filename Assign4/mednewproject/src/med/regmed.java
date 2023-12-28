package med;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/regmed")
public class regmed extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("name");
		String b=request.getParameter("pass");
		String c=request.getParameter("date");
		String d=request.getParameter("gen");
		String e=request.getParameter("email");
		String f=request.getParameter("num");
		
		out.print(a+"<br>");
		out.print(b+"<br>");
		out.print(c+"<br>");
		out.print(d+"<br>");
		out.print(e+"<br>");
		out.print(f+"<br>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/med_db","root","abc123");
			
			PreparedStatement st = con.prepareStatement("INSERT INTO medd_tbl(name,pass,date,gen,email,phone)" 
			+ "values(?,?,?,?,?,?)");

			   st.setString(1, a);
			   st.setString(2, b);
			   st.setString(3, c);
			   st.setString(4, d);
			   st.setString(5, e);
			   st.setString(6, f);
			  
			   
			   int z=st.executeUpdate();
			   if(z==1){
				   out.print("Successfully inserted!");
			   }
			   else{
				   out.print("Not inserted!");
			   }
			  
			   con.close();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	 
	
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
