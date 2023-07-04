package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class insertdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registered Successfully!</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            p{\n");
      out.write("                font-family:Arial;\n");
      out.write("                margin-bottom: -3px;\n");
      out.write("                margin-top: -3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p2{\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size: 12px;\n");
      out.write("                margin-bottom: -3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p3{\n");
      out.write("                font-family:Arial;\n");
      out.write("                margin-bottom: -3px;\n");
      out.write("                margin-top: -3px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .buttonblue {\n");
      out.write("                background-color: #007AFF;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String area = request.getParameter("area");
            String address = request.getParameter("address");
            String address2 = request.getParameter("address2");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String postal = request.getParameter("postal");
            String country = request.getParameter("country");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String firsttime = request.getParameter("firsttime");
            
            String choosenevent = "";
            String[] event = request.getParameterValues("event");
            for(int i=0;i< event.length;i++){
                choosenevent+=event[i]+", ";
            }
            
            String size = request.getParameter("size");
            
            String participanttype = request.getParameter("participanttype");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testing?autoReconnect=true&useSSL=false", "root", "12345");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into testing.participant (firstname,lastname,area,address,address2,city,state,postal,country,email,phone,firsttime,event,size,participanttype) values ('" + firstname + "','" + lastname + "','" + area + "','" + address + "','" + address2 + "','" + city + "','" + state + "','" + postal + "','" + country + "','" + email + "','" + phone + "','" + firsttime + "','" + choosenevent + "','" + size + "','" + participanttype + "')");
                con.close();

            } catch (Exception e) {
                out.print(e);
            }
        
      out.write("\n");
      out.write("    \n");
      out.write("        <center><h1><p>Conference Online Registration</p></h1>\n");
      out.write("        <p>Participant Registered Successfully!</p><br/><br/><br/>\n");
      out.write("        <input type=\"submit\" class=\"buttonblue\" value=\"Main Register Form\" name=\"GoForm\" onclick=\"window.location='search.jsp'\"/>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
