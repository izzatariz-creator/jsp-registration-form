package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class viewparticipant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Participant</title>\n");
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
      out.write("            p .warning{\n");
      out.write("                font-family:Arial;\n");
      out.write("                margin-bottom: -3px;\n");
      out.write("                margin-top: -3px;\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .buttongreen {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 160px;\n");
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
      out.write("            \n");
      out.write("            .buttongray {\n");
      out.write("                background-color: #ABABAB;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 160px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text] {\n");
      out.write("                width: 95%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid #555;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=email] {\n");
      out.write("                width: 95%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid #555;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            select{\n");
      out.write("                width: 47%;\n");
      out.write("                height: 45px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid #555;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            select2{\n");
      out.write("                width: 5%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid #555;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            String ppt = request.getParameter("type");
            String query = "";
            
            out.print(ppt);
          
            out.print(query);

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/assignment?autoReconnect=true&useSSL=false", "root", "12345");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

        
      out.write("\n");
      out.write("        <table border=1 align=\"left\" style=\"text-align:left\">\n");
      out.write("            <tr>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Area</th>\n");
      out.write("                <th>Street Address</th>\n");
      out.write("                <th>Street Address 2</th>\n");
      out.write("                <th>City</th>\n");
      out.write("                <th>State / Province</th>\n");
      out.write("                <th>Postal/Zip Code</th>\n");
      out.write("                <th>Country</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Phone Number</th>\n");
      out.write("                <th>First Time</th>\n");
      out.write("                <th>Event To Attend</th>\n");
      out.write("                <th>T-Shirt Size</th>\n");
      out.write("                <th>Registration Type</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
                    while (rs.next()) {
                    String fname = rs.getString("firstname");
                    String lname = rs.getString("lastname");
                    String area = rs.getString("area");
                    String add = rs.getString("address");
                    String add2 = rs.getString("address2");
                    String city = rs.getString("city");
                    String state = rs.getString("state");
                    String postal = rs.getString("postal");
                    String country = rs.getString("country");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String firsttime = rs.getString("firsttime");
                    String event = rs.getString("event");
                    String size = rs.getString("size");
                    String registrationtype = rs.getString("participanttype");   
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(fname);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(lname);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(area);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(add);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(add2);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(city);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(state);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(postal);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(country);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(phone);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(firsttime);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(event);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(size);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(registrationtype);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                        }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <p><input type=\"submit\" class=\"buttonblue\" value=\"Back\" onclick=\"window.location='search.jsp'\" name=\"GoBack\" style=\"margin-top: 100px;margin-right: 1000px;\"/></p>\n");
      out.write("        ");

                    con.close();

                } catch (Exception e) {
                    out.print(e);
}

        
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("     \n");
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
