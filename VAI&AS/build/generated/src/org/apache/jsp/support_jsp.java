package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>VIA&AS</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap 3.3.2 -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("          \r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var RegExp=/^[0-9]{9}[vV]$/\r\n");
      out.write("    var nic = document.forms[\"register\"][\"NIC\"].value;\r\n");
      out.write("    if(!RegExp.test(nic)) {\r\n");
      out.write("        alert(\"Invalid NIC\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    var userid = document.forms[\"register\"][\"UID\"].value;\r\n");
      out.write("    var Reg2=/^[0-9]+$/\r\n");
      out.write("    if(!Reg2.test(userid)) {\r\n");
      out.write("        alert(\"Invalid user ID\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    var firstname = document.forms[\"register\"][\"FIRST_NAME\"].value;\r\n");
      out.write("    var Reg3=/^[A-Za-z]+$/\r\n");
      out.write("    if(!Reg3.test(firstname)) {\r\n");
      out.write("        alert(\"Enter only alphabets for First name\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    var lastname = document.forms[\"register\"][\"LAST_NAME\"].value;\r\n");
      out.write("   \r\n");
      out.write("    if(!Reg3.test(lastname)) {\r\n");
      out.write("        alert(\"Enter only alphabets for last name\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    var landline = document.forms[\"register\"][\"TP_HOME\"].value;\r\n");
      out.write("    var Reg4=/^[0-9]{10}$/\r\n");
      out.write("    if(!Reg4.test(landline)) {\r\n");
      out.write("        alert(\"Invalid user telephone number\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    var mobile = document.forms[\"register\"][\"TP_MOBILE\"].value;\r\n");
      out.write("    \r\n");
      out.write("    if(!Reg4.test(mobile)) {\r\n");
      out.write("        alert(\"Invalid user mobile number\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <section id=\"support\" class=\"doublediagonal\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"section-heading scrollpoint sp-effect3\">\r\n");
      out.write("                        <h1>Register User</h1>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <p>For more info and support, contact us!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-8 col-sm-8 scrollpoint sp-effect1\">\r\n");
      out.write("                                    <form  name=\"register\" style=\"margin-left: 15%; width: 90%;\"class=\"form-horizontal\" action=\"UserController\" onsubmit=\"return validateForm()\" method=\"post\" role=\"form\">\r\n");
      out.write("                                        <div class=\"form-group \">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"user_id\">User ID:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\"  class=\"form-control\" id=\"user_id\" placeholder=\"Enter User ID\" name=\"UID\" required=\"\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"nic\">NIC Number:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\"  class=\"form-control\" placeholder=\"Enter NIC Munber\" name=\"NIC\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"control-label col-sm-2\" >Gender:</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"radio\" class=\"\" value=\"Male\" name=\"GENDER\" placeholder=\"Enter  Gender\" checked=\"\">  <span>Male</span>\r\n");
      out.write("                                                    <input type=\"radio\" class=\"\"  value=\"Female\" name=\"GENDER\" placeholder=\"Enter  Gender\">  <span>Female</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"fname\">First Name:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter First Name\" name=\"FIRST_NAME\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">Last Name:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Last Name\" name=\"LAST_NAME\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Home:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Home Telephone No\" name=\"TP_HOME\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Mobile:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Mobile No\" name=\"TP_MOBILE\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">Address:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Address\" name=\"ADDRESS\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\"  placeholder=\"Enter email\" name=\"EMAIL\" required=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">License No:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Enter License No\" name=\"LICENSE_NO\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"control-label col-sm-2\" for=\"blood_group\">Blood Group:</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <select class=\"form-control\" name=\"BLOOD_GROUP\" required>\r\n");
      out.write("                                                        <option value=\"\" class=\"form-group\"></option>\r\n");
      out.write("                                                        <option value=\"O+\" class=\"form-group\">O+</option>\r\n");
      out.write("                                                        <option value=\"O-\" class=\"form-group\">O-</option>\r\n");
      out.write("                                                        <option value=\"A+\" class=\"form-group\">A+</option>\r\n");
      out.write("                                                        <option value=\"A-\" class=\"form-group\">A-</option>\r\n");
      out.write("                                                        <option value=\"B+\" class=\"form-group\">B+</option>\r\n");
      out.write("                                                        <option value=\"B-\" class=\"form-group\">B-</option>\r\n");
      out.write("                                                       \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"pwd\">Birth Date:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\"> \r\n");
      out.write("                                                <input type=\"date\" class=\"form-control\"  placeholder=\"Enter BirthDay\" name=\"BIRTH_DAY\" required=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                      \r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"dl_no\">Other:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\"  placeholder=\"Other\" name=\"OTHER\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                         <div class=\"form-group\"> \r\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\" value=\"submit\">Add User</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/placeholdem.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                appMaster.preLoader();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
