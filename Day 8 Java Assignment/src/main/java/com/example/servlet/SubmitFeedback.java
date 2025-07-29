package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SubmitFeedback")
public class SubmitFeedback extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    //Check if feedback already submitted using cookie
	    Cookie[] cookies = request.getCookies();
	    if (cookies != null) {
	        for (Cookie c : cookies) {
	            if ("submitted".equals(c.getName())) {
	                response.sendRedirect("already_submitted.jsp");
	                return;
	            }
	        }
	    }

	    // Extract form parameters
	    String name = request.getParameter("studentName");
	    String email = request.getParameter("email");
	    String course = request.getParameter("course");
	    String feedback = request.getParameter("feedback");

	    // Simple validation
	    if (name.isEmpty() || email.isEmpty() || course.isEmpty() || feedback.isEmpty()) {
	        out.println("<h3>Please fill in all fields!</h3>");
	        return;
	    }

	    //Set cookie to prevent resubmission
	    Cookie submittedCookie = new Cookie("submitted", "true");
	    submittedCookie.setMaxAge(24 * 60 * 60); // 1 day
	    response.addCookie(submittedCookie);

	    // Response to user
	    out.println("<h2>Thank you for your feedback!</h2>");
	    out.println("<p><strong>Name:</strong> " + name + "</p>");
	    out.println("<p><strong>Email:</strong> " + email + "</p>");
	    out.println("<p><strong>Course:</strong> " + course + "</p>");
	    out.println("<p><strong>Feedback:</strong> " + feedback + "</p>");
	}

}
