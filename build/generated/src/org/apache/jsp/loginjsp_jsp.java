package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Connection;

public final class loginjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      MyPackage.Bean obj = null;
      synchronized (request) {
        obj = (MyPackage.Bean) _jspx_page_context.getAttribute("obj", PageContext.REQUEST_SCOPE);
        if (obj == null){
          obj = new MyPackage.Bean();
          _jspx_page_context.setAttribute("obj", obj, PageContext.REQUEST_SCOPE);
          out.write("`\n");
          out.write("\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>Login</title>\n");
          out.write("    </head>\n");
          out.write("    \n");
          out.write("        <h1>Login in process</h1>\n");
          out.write("        ");

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
           

          out.write("\n");
          out.write("    \n");
          out.write("\n");
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
