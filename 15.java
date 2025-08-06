package com.greet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // Get form inputs
        String username = req.getParameter("username");
        String address = req.getParameter("address");

        // Set content type and build response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>User Info</title></head><body>");
        out.println("<h2>User Details Received</h2>");
        out.println("<p><strong>Username:</strong> " + username + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");
        out.println("</body></html>");
    }
}


<!DOCTYPE html>
<html>
<head>
    <title>User Info Form</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="GreetServlet" method="post">
        <label>Username:</label><br>
        <input type="text" name="username" required><br><br>

        <label>Address:</label><br>
        <textarea name="address" rows="4" cols="30" required></textarea><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>

  
