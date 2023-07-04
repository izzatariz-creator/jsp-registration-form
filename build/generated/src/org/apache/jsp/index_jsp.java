package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("\n");
      out.write("            .button {\n");
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
      out.write("\n");
      out.write("            select{\n");
      out.write("                width: 30%;\n");
      out.write("                padding: 12px 20px;\n");
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
      out.write("    <center><h1><p>Conference Online Registration</p></h1>\n");
      out.write("        <p>Please fill in the form below. We'll contact you as soon as possible.</p><br/><br/><br/>\n");
      out.write("    </center>\n");
      out.write("    <form action=\"/action_page.php\">\n");
      out.write("        <div id='outerDiv'>\n");
      out.write("            <div id='formDiv1' style='float:left; width:48%; height:300px;'>\n");
      out.write("                <div id='fullname'><strong><p>Full Name  *</p></strong><br/>\n");
      out.write("                    <div id=\"firstName\" style='float:left; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"firstname\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"firstname\"><p2>First Name</p2></label><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"lastName\" style='float:right; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"lastname\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"lastname\"><p2>Last Name</p2></label><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <strong><p>Area  *</p></strong><br/>\n");
      out.write("                <select name=\"area\">\n");
      out.write("                    <option value=\"\" disabled selected hidden>Please select</option>\n");
      out.write("                    <option value=\"bangi\">Bangi</option>\n");
      out.write("                    <option value=\"kajang\">Kajang</option>\n");
      out.write("                    <option value=\"putrajaya\">Putrajaya</option>\n");
      out.write("                </select><br/><br/><br/>\n");
      out.write("                <strong><p>Address  *</p></strong><br/>\n");
      out.write("                <input type=\"text\" name=\"add\" required style=\"width:97.5%\"><br/>\n");
      out.write("                <label for=\"add\"><p2>Street Address</p2></label>\n");
      out.write("                <input type=\"text\" name=\"add2\" required style=\"width:97.5%\"><br/>\n");
      out.write("                <label for=\"add2\"><p2>Street Address Line 2</p2></label>\n");
      out.write("                <div>\n");
      out.write("                    <div id=\"city\" style='float:left; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"city\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"city\"><p2>City</p2></label>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"state\" style='float:right; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"state\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"state\"><p2>State / Province</p2></label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div id=\"postal\" style='float:left; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"postal\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"postal\"><p2>Postal / Zip Code</p2></label><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"country\" style='float:right; width:50%'>\n");
      out.write("                        <input type=\"text\" name=\"country\" required size=\"50\"><br/>\n");
      out.write("                        <label for=\"country\"><p2>Country</p2></label><br/><br/><br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br/><br/>\n");
      out.write("                <strong><p>Email  *</p></strong><br/>\n");
      out.write("                <input type=\"email\" name=\"email\" required placeholder=\"ex: myname@example.com\" style=\"width:45%\"><br/>\n");
      out.write("                <label for=\"email\"><p2>example@example.com</p2></label>\n");
      out.write("                <br/><br/><br/>\n");
      out.write("                <strong><p>Phone Number  *</p></strong><br/>\n");
      out.write("                <input type=\"text\" name=\"contact\" required style=\"width:45%\"><br/>\n");
      out.write("            </div>\n");
      out.write("            <div id='formDiv2' style='float:right; width:48%; height:300px;'>\n");
      out.write("                <strong><p>First time to attend this conference?  *</p></strong><br>\n");
      out.write("                <p><input type=\"radio\" name=\"firstTime\" value=\"Yes\">\n");
      out.write("                    <label for=\"Yes\">Yes</label><br>\n");
      out.write("                    <input type=\"radio\" name=\"firstTime\" value=\"No\">\n");
      out.write("                    <label for=\"No\">No</label><br></p>\n");
      out.write("                <br/><br/><br/>\n");
      out.write("                <strong><p>I will attend:  *</p></strong><br>\n");
      out.write("                <p><input type=\"checkbox\" name=\"event\" value=\"Event 1\">\n");
      out.write("                    <label for=\"event1\"> Event 1 - Date of Event 1</label><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"event\" value=\"Event 2\">\n");
      out.write("                    <label for=\"event2\"> Event 2 - Date of Event 2</label><br>\n");
      out.write("                    <input type=\"checkbox\" name=\"event\" value=\"Event 3\">\n");
      out.write("                    <label for=\"event3\"> Event 3 - Date of Event 3</label><br></p>\n");
      out.write("                <br/><br/><br/>\n");
      out.write("                <strong><p>What's your T-Shirt size?  *</p></strong><br>\n");
      out.write("                <select name=\"size\">\n");
      out.write("                    <option value=\"\" disabled selected hidden>Please select</option>\n");
      out.write("                    <option value=\"s\">S</option>\n");
      out.write("                    <option value=\"m\">M</option>\n");
      out.write("                    <option value=\"l\">L</option>\n");
      out.write("                </select>\n");
      out.write("                <br/><br/><br/>\n");
      out.write("                <strong><p>Registration Fee  *</p></strong><br>\n");
      out.write("                <p><input type=\"radio\" name=\"registration\" value=\"Normal\">\n");
      out.write("                    <strong><label for=\"normal\">Conference Registration Fee (Normal Participant) 500.00MYR</label></strong><br>\n");
      out.write("                <br><p2># of Papers</p2>\n");
      out.write("                <select name=\"papers\" style=\"width:10%\">\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                </select><br/><br/></p><hr style=\"width:95%; text-align:right\">\n");
      out.write("                <br><p><input type=\"radio\" name=\"registration\" value=\"Student\">\n");
      out.write("                    <strong><label for=\"student\">Conference Registration Fee (Student Participant) 300.00MYR</label></strong><br>\n");
      out.write("                <br><p2># of Papers</p2>\n");
      out.write("                <select name=\"papers\" style=\"width:10%\">\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                </select>\n");
      out.write("                <br/><br/></p><hr>\n");
      out.write("                <p><input type=\"reset\" class=\"button\"/><strong>Total  0.00MYR</strong></p><br><br>\n");
      out.write("                <input type=\"submit\" class=\"button\"/><input type=\"submit\" class=\"button\"/><input type=\"reset\" class=\"button\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
