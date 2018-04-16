<%-- 
    Document   : addlibrary
    Created on : Jan 29, 2018, 8:55:43 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="./JS/contol.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <label>ADD library</label>
        <input id="library_name" type="text" value="Library Cumming"></input>
        <input type ="button" value="Save" onclick="addlibrary();"/>
        
    </body>
</html>
