package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modal.addBook;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Admin Home Page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("    .row.content {height: 450px}\n");
      out.write("    \n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      padding-top: 20px;\n");
      out.write("      background-color: black;\n");
      out.write("      height: 93vh;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    footer {\n");
      out.write("      background-color: #555;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("    @media screen and (max-width: 767px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height:auto;} \n");
      out.write("    }\n");
      out.write("     .i1 \n");
      out.write("  {\n");
      out.write("      height: 70px;\n");
      out.write("      width: 220px;\n");
      out.write("  }\n");
      out.write("  .container-fluid \n");
      out.write("  {\n");
      out.write("      height: 100px;\n");
      out.write("  }\n");
      out.write("  .navbar-inverse .navbar-nav>.active>a{\n");
      out.write("      margin-left: 200px;\n");
      out.write("    width: 500px;\n");
      out.write("    height: 70px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("  }\n");
      out.write("  .i21 \n");
      out.write("  {\n");
      out.write("      height: 550px;\n");
      out.write("      width: 865px;\n");
      out.write("  }\n");
      out.write("  .btn1\n");
      out.write("  {\n");
      out.write("      height: 54px;\n");
      out.write("      width: 150px;\n");
      out.write("      background-color: #05b4f7e8;\n");
      out.write("      cursor: pointer;\n");
      out.write("      outline: none;\n");
      out.write("      border: none;\n");
      out.write("      color: white;\n");
      out.write("      font-size: 20px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("  }\n");
      out.write("  .btn1:hover {\n");
      out.write("    \n");
      out.write("     color: white;\n");
      out.write("} \n");
      out.write("\n");
      out.write("  .well\n");
      out.write("  {\n");
      out.write("      background-color: black;\n");
      out.write("      border: none;\n");
      out.write("      padding: 10px;\n");
      out.write("      outline: none;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .navbar-nav>li>a\n");
      out.write("  {\n");
      out.write("      font-size: 20px;\n");
      out.write("      color: white;\n");
      out.write("  }\n");
      out.write("  .a1 \n");
      out.write("  {\n");
      out.write("      color: white;\n");
      out.write("      font-size: 20px;\n");
      out.write("      padding: 20px;\n");
      out.write("      outline: none;\n");
      out.write("      border: none;\n");
      out.write("  }\n");
      out.write("  .a1:hover \n");
      out.write("  {\n");
      out.write("      color: dodgerblue;\n");
      out.write("      outline: none;\n");
      out.write("      border: none;\n");
      out.write("  }\n");
      out.write("   .btn {\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    background-color: #b50c4a;\n");
      out.write("    color: #f1f1f1;\n");
      out.write("    border-radius: 0;\n");
      out.write("    transition: .2s;\n");
      out.write("  }\n");
      out.write("  .btn:hover, .btn:focus {\n");
      out.write("    \n");
      out.write("    background-color: #b5456ee3;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("   .modal-header, h4, .close {\n");
      out.write("    background-color: #0b86efeb;\n");
      out.write("    color: #fff !important;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-header, .modal-body {\n");
      out.write("    padding: 10px 50px;\n");
      out.write("  }\n");
      out.write("  .i1 \n");
      out.write("  {\n");
      out.write("      height: 80px;\n");
      out.write("      width: 250px;\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("  .p1 \n");
      out.write("  {\n");
      out.write("      font-family: sans-serif;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  </style>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("            \n");
      out.write("          \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"><img class=\"i1\" src=\"c1.png\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"#\" style=\"font-size:25px;\"><center>LIBRARY MANAGEMENT SYSTEM</center></a></li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"logout\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    \n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
