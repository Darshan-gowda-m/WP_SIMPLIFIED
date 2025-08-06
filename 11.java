package com.greet;

import java.io.*; 
import java.time.LocalTime;
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String bgcolor = req.getParameter("bgcolor");

        // Get current server time
        LocalTime now = LocalTime.now();
        String greeting;

        if (now.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning";
        } else if (now.isBefore(LocalTime.of(17, 0))) { // before 5 PM
            greeting = "Good Afternoon";
        } else if (now.isBefore(LocalTime.of(21, 0))) { // before 9 PM
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><head><title>Greeting</title></head>");
        out.println("<body style='background-color:" + bgcolor + ";'>");
        out.println("<h1>" + greeting + ", " + name + "!</h1>");
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
