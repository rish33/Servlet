

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {

			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();
			// TODO Auto-generated catch block

			ServletContext context = getServletContext();
			context.setAttribute("company", "IBM");
			pw.println("Welcome to first servlet");
			pw.println("<a href='servlet2'>visit</a>");
			pw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
