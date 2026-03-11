<%-- 
    Document   : result
    Created on : 18 Feb 2026, 8:54:08 PM
    Author     : CASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry Check Result Page</title>
    </head>
    <body>
        <h1>Entry Check Result</h1>
        
        <%
        boolean mask = (Boolean)request.getAttribute("mask");
        boolean sanitize = (Boolean)request.getAttribute("sanitize");
        double temp = (Double)request.getAttribute("temp");
        String message = (String)request.getAttribute("message");

        %>
        <p>
     
        </p>
+

         Result: <%=message%>
        <p>
            Click <a href="entryForm.jsp">here</a> to check another person.
        </p>
    </body>
</html>
