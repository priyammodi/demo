package defaultpackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(Validate.checkUser(username, password))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcomes");
            rs.forward(request, response);
        }
        else
        {
            out.println("<center>");
            out.println("<h2>");
        	out.println("Username or Password incorrect");
        	out.println("</h2>");
        	out.println("</center>");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        }
    }  
}