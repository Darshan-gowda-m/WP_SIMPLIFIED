package com.greet;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        
        // Create cookie to store user's name
        Cookie nameCookie = new Cookie("username", name);
        nameCookie.setMaxAge(24 * 60 * 60); // Cookie expires in 1 day
        res.addCookie(nameCookie);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>Greeting</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("</body></html>");
    }
}
  <!DOCTYPE html>
<html>
<head><title>Greeting App</title></head>
<body>
    <form action="GreetServlet" method="post">
        <h2>Enter Your Name</h2>
        <input type="text" name="name" required><br><br>
        
        <label>Select Background Color:</label><br>
        <input type="color" name="bgcolor" value="#ffffff"><br><br>

        <input type="submit" value="Greet Me">
    </form>
</body>
</html>
