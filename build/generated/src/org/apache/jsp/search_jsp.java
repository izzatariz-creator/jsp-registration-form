package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Tool</title>\n");
      out.write("        \n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("                width: 160px;\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("            \n");
      out.write("            .buttonred {\n");
      out.write("                background-color: #de1212;\n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id='formDiv1' style='width:48%; height:300px; padding-left: 30px; padding-top: 30px;'>\n");
      out.write("\n");
      out.write("            <div id='viewtool'><strong><p>Search Tool</p></strong><br/>\n");
      out.write("\n");
      out.write("                <form action=\"viewparticipant.jsp\">\n");
      out.write("\n");
      out.write("                    <p><input type=\"radio\" name=\"type\" value=\"SELECT * FROM assignment.participant\">\n");
      out.write("                        <label for=\"all\">View All Participant</label><br>\n");
      out.write("                        <input type=\"radio\" name=\"type\" value=\"SELECT * FROM assignment.participant WHERE participanttype='Student'\">\n");
      out.write("                        <label for=\"student\">View Student Participants</label><br>\n");
      out.write("                        <input type=\"radio\" name=\"type\" value=\"SELECT * FROM assignment.participant WHERE participanttype='Normal'\">\n");
      out.write("                        <label for=\"normal\">View Normal Participant</label><br></p>\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"buttonblue\" value=\"View\"/>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <br/><br/>\n");
      out.write("\n");
      out.write("                <form action=\"searchparticipant.jsp\">\n");
      out.write("\n");
      out.write("                    <div style='float:left; width:60%'>\n");
      out.write("                    <label for=\"participantname\"><p2>Insert Registered Participant Name</p2></label><br/>\n");
      out.write("                    <input type=\"text\" name=\"participantname\" required size=\"45\"><br/>\n");
      out.write("                    </div><br/><br/><br/><br/><br/>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"buttonblue\" value=\"Search\" name=\"GoSearch\"/>\n");
      out.write("                    <input type=\"submit\" class=\"buttonred\" value=\"Remove\" name=\"GoRemove\" style=\"margin-left: 50px;\" onclick=\"form.action='deleteparticipant.jsp';\"/></br></br>\n");
      out.write("                    <input type=\"submit\" class=\"buttonblue\" value=\"Back\" onclick=\"window.location='registerform.jsp'\" name=\"GoBack\" style=\"margin-left: 219px;\"/>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
