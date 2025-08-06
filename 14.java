package com.greet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // Request info
        String method = req.getMethod();
        String uri = req.getRequestURI();
        String protocol = req.getProtocol();
        StringBuffer url = req.getRequestURL();  // full URL
        String remoteAddr = req.getRemoteAddr(); // client IP

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>Request Info</title></head><body>");
        out.println("<h2>Server / Request Information</h2>");
        out.println("<p><strong>Method:</strong> " + method + "</p>");
        out.println("<p><strong>URI:</strong> " + uri + "</p>");
        out.println("<p><strong>Protocol:</strong> " + protocol + "</p>");
        out.println("<p><strong>URL:</strong> " + url.toString() + "</p>");
        out.println("<p><strong>Remote Address:</strong> " + remoteAddr + "</p>");
        out.println("</body></html>");
    }


  <!DOCTYPE html>
<html>
<head>
    <title>Method Check</title>
</head>
<body>
    <form action="GreetServlet" method="post">
        <input type="submit" value="Check Method">
    </form>
</body>
</html>

}
