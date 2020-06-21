<%-- 
    Document   : Updatejsp
    Created on : Feb 11, 2019, 5:15:33 PM
    Author     : Sumit
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:useBean id="obj" scope="page" class="MyPackage.Bean" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                boolean a=false;
                     int ro=Integer.parseInt(request.getParameter("roll"));
                         String use=request.getParameter("Name");
                         String pas=request.getParameter("address");
            try
            {
                     a=obj.Update(ro, use, pas);
            }catch(Exception e)
            {out.println("ERROR!!!!");
            }
                      if(a==true)
                      {      
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Update Sucessfully</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#945176>");
            out.println("<h1>Update Sucessful</h1>");
            out.println("<a href=http://localhost:8084/StudentBeans/Search.html>For more entry</a>");
            out.println("</body>");
            out.println("</html>");
                      }
                      else{
                          out.println("Update Un-Sucessful");
                      
                          out.println("<a href=http://localhost:8084/StudentBeans/Search.html>Try Again</a>");
                      }
                     
          
 
            
            %>
            
        <h1>Hello World!</h1>
    </body>
</html>
</jsp:useBean>