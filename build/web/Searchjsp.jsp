<%-- 
    Document   : Searchjsp
    Created on : Feb 11, 2019, 5:11:05 PM
    Author     : Sumit
--%>

<%@page import="java.util.ArrayList"%>
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
            <script language="javascript">
            function valid()
{
if(document.update.roll.value==="")
{alert("Roll is empty");
document.update.roll.focus();
return false;
}
if(document.update.Name.value==="")
{alert("Name is empty");
document.update.Name.focus();
return false;
}
if(document.update.address.value==="")
{alert("Address is empty");
document.update.address.focus();
return false;
}
}
</script>
    </head>
    <body bgcolor='#aa22ff'>
        <%
            ArrayList al=new ArrayList();
            int r;
                    r=Integer.parseInt(request.getParameter("roll"));
                al=obj.Search(r);
         
     
                if(al.get(0)=="false")
                {
                    
                        out.println("<html>");
            out.println("<head>");
            out.println("<title>Search</title>");            
            out.println("</head>");
            out.println("<body bgcolor='#aa22ff'>");
            out.println("<h1>Search Failed</h1>");
            out.println("Item not Found");
            out.println("<a href=http://localhost:8084/StudentBeans/Search.html>Try Again</a>");
            out.println("</body>");
            out.println("</html>");
                        
                            }
                else{
                       out.println("<body bgcolor='#aa22ff'>");
        out.println("<form name='update' action='http://localhost:8084/StudentBeans/Updatejsp.jsp'>");
        out.println("<table align='center' cellpadding='10px'>");
            out.println("<tr><td>Roll</td><td><input type='text' name='roll' value="+al.get(0)+" ></td></tr>");
            out.println("<tr><td>Name</td><td><input type='text' name='Name' value="+al.get(1)+"></td></tr>");
            out.println("<tr><td>Address</td><td><input type='text' name='address' value="+al.get(2)+"></td></tr>");
            out.println("<tr><td colspan='2' align='center'></td></tr>");
                  out.println("<tr><td colspan=2 align='center'><input type='Submit' onclick='return valid()' value='Update'></td></tr>");
             out.println("</table>");
         out.println("</form>");
       
        out.println("<form name='home' action='http://localhost:8084/StudentBeans/HomePage.html'>");
            out.println("<table align='center' cellpadding='10px'>");
                out.println("<tr><td><input type='Submit' value='Home'></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            
            out.println("<body>");
            out.println("<h1 align='Center'>||Search Sucessful|| </h1>");
            out.println("<h1 align='Center'><a href=http://localhost:8084/StudentBeans/Search.html>Re-Search</a></h1>");
            out.println("</body>");
                        out.println("</html>");
                        
                        }
     
        
            %>
        
    </body>
</html>
</jsp:useBean>