package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.util.ArrayList;

public final class Displayjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
          out.write("      \n");
          out.write("            \n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>JSP Page</title>\n");
          out.write("    </head>\n");
          out.write("    <body>\n");
          out.write("        ");

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
            
            
        
          out.write("\n");
          out.write("        <h1>Hello World!</h1>\n");
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
