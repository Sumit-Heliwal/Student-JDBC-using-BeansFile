<%-- 
    Document   : loginjsp
    Created on : Feb 11, 2019, 4:34:09 PM
    Author     : Sumit
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="obj" scope="request" class="MyPackage.Bean" >`

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    
        <h1>Login in process</h1>
        <%
            String u= request.getParameter("user");
            String p= request.getParameter("pass");
            boolean a=false;
            try{
            a=obj.Login(u, p);
            }catch(Exception e){
                response.sendRedirect("http://localhost:8084/StudentBeans/LoginPage.html");
            }
            if(a==true)
                response.sendRedirect("http://localhost:8084/StudentBeans/HomePage.html");
            else
                response.sendRedirect("http://localhost:8084/StudentBeans/LoginPage.html");
           
%>
    

</jsp:useBean>