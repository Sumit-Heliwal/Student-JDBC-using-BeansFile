<%-- 
    Document   : DELETEjsp
    Created on : Feb 11, 2019, 5:32:58 PM
    Author     : Sumit
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="obj" scope="page" class="MyPackage.Bean" >
    
    
<!DOCTYPE html>
<html>
    <%!
         int roll;
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='#255211'>
        <%
            int r;
            try
            {
                if(request.getParameter("roll")=="")
                        {
                            out.println("ERROR<br>");
                            out.println("Empty ROLL NUMBER<br><a href=http://localhost:8084/StudentBeans/Search.html>Try Again</a>");
                            return;
                        }
                else
                {
                    r=Integer.parseInt(request.getParameter("roll"));
                }
                } catch (Exception ex) { 
         out.println("ERROR!!!");
     }
            roll=Integer.parseInt(request.getParameter("roll"));
            boolean a=false;
                    try{
                        
                        a=obj.Delete(roll);
                    }catch(Exception e){
                        out.println("Data not found<br>");
                    }
            
            if(a==true)
            {
                out.println("Delete Sucessfull<br>");
                        
            }
            else
            {
            out.println("Delete Unsucessful<br>");
            }
        %>
        <a href="http://localhost:8084/StudentBeans/Delete.html">Back to delete page</a>
    </body>
</html>
</jsp:useBean>