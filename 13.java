<!DOCTYPE html>
<html>
<head>
    <title>Greeting App</title>
</head>
<body>
    <h2>Enter Your Name</h2>
    <form action="GreetServlet" method="post">
        <input type="text" name="name" placeholder="Your Name" required>
        <br><br>
        <input type="submit" value="Greet Me">
    </form>
</body>
</html>





  package com.greet;

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");

        // Create or get existing session
        HttpSession session = req.getSession(true);
        // Store user name in session attribute
        session.setAttribute("username", name);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>Session Demo</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");

        // Display session details
        out.println("<h3>Session Details:</h3>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Creation Time: " + new java.util.Date(session.getCreationTime()) + "</p>");
        out.println("<p>Last Accessed Time: " + new java.util.Date(session.getLastAccessedTime()) + "</p>");
        out.println("<p>Username from session: " + session.getAttribute("username") + "</p>");

        out.println("</body></html>");
    }
}
