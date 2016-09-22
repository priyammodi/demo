package defaultpackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcomes extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        out.print("<center>");
        out.println("Welcome user : ");
        out.print("<h2>");
        out.print(username);
        out.print("</h2>");
        out.print("</center>");
        out.println("REGISTRATION FORM");
        out.println("<td>"+ "<a href='WebContant/index2.html'>REGiSTER </a>" + "</td></tr>");
	}  
}