<%-- 
    Document   : control
    Created on : Jan 29, 2018, 9:20:52 PM
    Author     : Home

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.controller"%>
<%@page contentType="text/html" session="true"%>
<%@page pageEncoding="UTF-8"%>
<%
    System.out.println("ya tut");
    System.out.println(request.getParameter("library_name"));
    //controller.connect();
    ArrayList<String> connlib_name= controller.getlibrary();
    for (Iterator<String> iter = connlib_name.iterator(); iter.hasNext(); ) {
    String library = iter.next();%>

    Library Name = <%=library%> 
    <br/>
<%}
%>
