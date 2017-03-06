<%@page import="ponder09.DiscussionPost"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Posts!</h1>
        <%
            for (DiscussionPost discussion : (List<DiscussionPost>)request.getAttribute("discussions"))
            {
            
            out.println("<h4>Author: " + discussion.getUsername() + "</h4>");
            out.println("<h6>Timestamp: " + discussion.getDate() + "</h6>");
            out.println("<h2>Topic: " + discussion.getTopic() + "</h2>");
            out.println("<p>" + discussion.getContent() + "</p> </br>");
            
            }
        %>
    </body>
</html>
