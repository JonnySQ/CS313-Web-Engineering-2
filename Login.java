
package ponder09;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
   
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
{
    
    String correctName = "testing";
    String correctPassword = "test123";

    String username = request.getParameter("txtUsername");
    String password = request.getParameter("txtPassword");

    if (username != null && password != null 
        && username.equals(correctName) && password.equals(correctPassword)) 
    {
        request.getSession().setAttribute("username", username);
        response.sendRedirect("validLogin.jsp");
    } 
    else 
    {
        response.sendRedirect("badLogin.jsp");
    }
}


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
{
processRequest(request, response);
}

}