package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Insertjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      MyPackage.Bean obj = null;
      synchronized (_jspx_page_context) {
        obj = (MyPackage.Bean) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new MyPackage.Bean();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("<html>\n");
          out.write("    <head>\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>JSP Page</title>\n");
          out.write("    </head>\n");
          out.write("    <body bgcolor=#940000'>\n");
          out.write("        ");

                    
                        
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
            
          out.write("\n");
          out.write("        <h1>Insert World!</h1>\n");
          out.write("    </body>\n");
          out.write("</html>\n");
        }
      }
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
