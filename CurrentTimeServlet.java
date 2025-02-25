		package com.nit.pc.servlets;
		import java.io.PrintWriter;
		import java.io.IOException;
		import java.time.LocalDate;
		import java.time.LocalTime;
		import java.time.LocalDateTime;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		import jakarta.servlet.Servlet;
		import jakarta.servlet.http.HttpServlet;
		import jakarta.servlet.http.HttpServletRequest;
		import jakarta.servlet.http.HttpServletResponse;
		import jakarta.servlet.ServletException;

public class CurrentTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the current date and time
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Write the HTML response to the client
        PrintWriter out = response.getWriter();
        
        // Output HTML and current time
        out.println("<html><head>");
        out.println("<meta http-equiv='refresh' content='1'>"); // Refresh the page every 1 second
        out.println("<title>Current Time</title>");
        out.println("</head><body>");
        out.println("<h2>Current Date and Time:</h2>");
        out.println("<p>" + formatter.format(date) + "</p>");
        out.println("</body></html>");
    }
}
