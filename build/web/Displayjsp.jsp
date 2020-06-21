<%-- 
    Document   : Displayjsp
    Created on : Feb 11, 2019, 5:37:01 PM
    Author     : Sumit
--%>

<%@page import="java.lang.*"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="obj" scope="page" class="MyPackage.Bean" >
<html>
    <head>
      
            
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList asd=new ArrayList();
            
           
                asd=obj.DisplayAll();

            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayServ</title>");            
            out.println("</head>");
            out.println("<body bgcolor='#dadaff'>");
            out.println("<table border=5px cellspacing=15px cellpadding=10px>");
            int j;
             for(int i=0;i<asd.size();i=i+3){
                                  out.println("<tr>");
                 for(j=i;j<i+3;j++)
                 {
                     out.println("<td>"+asd.get(j)+"</td>");
                 }
                 out.println("</tr>");
                 
             }
             
            out.println("</table><br><br>");
            out.println("<h2><a href=http://localhost:8084/StudentBeans/HomePage.html>Back to home</a></h2>");
            out.println("</body>");
            out.println("</html>");
            
            
        %>
        <h1>Hello World!</h1>
    </body>
</html>
</jsp:useBean>