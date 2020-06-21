<%-- 
    Document   : Insertjjsp
    Created on : Feb 11, 2019, 4:48:21 PM
    Author     : Sumit
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="obj" scope="page" class="MyPackage.Bean" >
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor=#940000'>
        <%
                    
                        
                         boolean a=false;
                         if(request.getParameter("Name")==""|request.getParameter("address")==""|request.getParameter("roll")=="")
                         {
                             out.print("ERROR!!<br>EMPTY FIELDS <br><a href=http://localhost:8084/StudentBeans/Insert.html>For Retry</a> ");
                             return;
                         }
                          int ro=Integer.parseInt(request.getParameter("roll"));
                         String use=request.getParameter("Name");
                         String pas=request.getParameter("address");
                         try{
                         a=obj.Insert(ro, use, pas);
                             }catch (Exception ex) {

                                 out.println("Error");
           
        }      
                      if(a==true)
                      {      
            out.println("<body bgcolor=#945176>");
            out.println("<h1>Insert Sucessful</h1>");
            out.println("<a href=http://localhost:8084/StudentBeans/Insert.html>For more entry</a>");
            out.println("</body>");
                      }
                      else
                      {
                          out.println("<body bgcolor=#945176>");
            out.println("<h1>Insert Unsucessful</h1>");
            out.println("<a href=http://localhost:8084/StudentBeans/Insert.html>For Retry</a>");
            out.println("</body>");
            
                      }
            %>
        <h1>Insert World!</h1>
    </body>
</html>
</jsp:useBean>