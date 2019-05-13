package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body \n");
      out.write("{      \n");
      out.write("   background-color: black;     \n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write(" }\n");
      out.write(".c {\n");
      out.write("display: flex;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("flex-wrap: wrap;\n");
      out.write("}\n");
      out.write(".a {\n");
      out.write("width:300px;\n");
      out.write("height:300px;\n");
      out.write("background: green;\n");
      out.write("}\n");
      out.write(".b {\n");
      out.write("width:300px;\n");
      out.write("height:300px;\n");
      out.write("background: blue;\n");
      out.write("padding-left: 20px;\n");
      out.write("}\n");
      out.write(".login-box{\n");
      out.write("    width: 430px;\n");
      out.write("    height: 470px;\n");
      out.write("    background-color: white;\n");
      out.write("    color: red;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-top: 30px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-size: 30px;\n");
      out.write("     border: 1px solid grey;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".login-box1{\n");
      out.write("    width: 430px;\n");
      out.write("    height: 470px;\n");
      out.write("   background-color: white;\n");
      out.write("    \n");
      out.write("    top: 50%;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    margin-top: 30px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  font-size: 30px;\n");
      out.write("   color: red;\n");
      out.write("     border: 1px solid grey;\n");
      out.write("}\n");
      out.write(".main \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("}\n");
      out.write(".head \n");
      out.write("{\n");
      out.write("\n");
      out.write("\tbackground-color:#cb1a12;\n");
      out.write("\theight: 5px;\n");
      out.write("}\n");
      out.write("\t\t\n");
      out.write("          a \n");
      out.write("          {\n");
      out.write("              text-decoration: none;\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          #particles-js\n");
      out.write("\t\t{\n");
      out.write("\t\t\theight: 100%;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("                .i11\n");
      out.write("                {\n");
      out.write("                    height: 70px;\n");
      out.write("                    width: 240px;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                .inner \n");
      out.write("                {\n");
      out.write("                    height: 380px;\n");
      out.write("                    width: 360px;\n");
      out.write("                    background-color: #f6f6f6;\n");
      out.write("                    margin-left: 30px;\n");
      out.write("                    color: black;\n");
      out.write("                    font-size: 15px;\n");
      out.write("                    font-family: arial;\n");
      out.write("                    padding: 3px;\n");
      out.write("                }\n");
      out.write("                input \n");
      out.write("                {\n");
      out.write("                    height: 30px;\n");
      out.write("                    width: 330px;\n");
      out.write("                    border: 2px solid gainsboro;\n");
      out.write("                }\n");
      out.write("                .s1\n");
      out.write("                {\n");
      out.write("                    height: 30px;\n");
      out.write("                    width: 330px;\n");
      out.write("                    border: 2px solid gainsboro; \n");
      out.write("                }\n");
      out.write("                .btn \n");
      out.write("                {\n");
      out.write("                    height: 40px;\n");
      out.write("                    width: 330px;\n");
      out.write("                    background-color: #cb1a12;\n");
      out.write("                    color: white;\n");
      out.write("                    font-family: arial;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    outline: none;\n");
      out.write("                    border: none;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                .slide\n");
      out.write("                {\n");
      out.write("                    height: 450px;\n");
      out.write("                    width: 150px;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        var i=0;\n");
      out.write("        function change_image()\n");
      out.write("        {\n");
      out.write("        document.getElementById(\"slideshow\").src=\"images\\img\"+(i++ % 6)+\".jpg\";\n");
      out.write("        }\n");
      out.write("        function slider()\n");
      out.write("        {\n");
      out.write("            setInterval(change_image,1000);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("\t\t<div class=\"head\">\n");
      out.write("                   \n");
      out.write("\t\t</div>\n");
      out.write("    <br>\n");
      out.write("<center><img class=\"i11\" src=\"c1.png\"><br></center>\t\n");
      out.write("<div class=\"c\">\n");
      out.write("    \n");
      out.write("    <div class=\"login-box\"><br>\n");
      out.write("        <div class=\"slide\" onload=\"slider();\">\n");
      out.write("           <img id=\"slideshow\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<div class=\"login-box1\">\n");
      out.write("    <br>\n");
      out.write("    <center>LOG IN</center>    \n");
      out.write("    <div class=\"inner\">\n");
      out.write("        <br>\n");
      out.write("        &nbsp;&nbsp;&nbsp; USERNAME<br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp;<input type=\"text\"><br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp; PASSWORD<br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp;<input type=\"password\"><br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp; STREAM<br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp;<select class=\"s1\">\n");
      out.write("             <option>\n");
      out.write("               &nbsp;&nbsp;&nbsp;  CSE\n");
      out.write("            </option>\n");
      out.write("            <option> &nbsp;&nbsp;&nbsp;ECE</option>\n");
      out.write("            <option> &nbsp;&nbsp;&nbsp;CE</option>\n");
      out.write("        </select>\n");
      out.write("        <br><br><br>\n");
      out.write("          &nbsp;&nbsp;&nbsp;<button class=\"btn\"><center>LOGIN</center></button>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</body>\n");
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
