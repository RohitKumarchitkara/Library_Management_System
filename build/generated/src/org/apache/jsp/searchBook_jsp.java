package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.addBook;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class searchBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("        <style>\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-image: url(\"sb.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            image{\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("             .header \n");
      out.write("          {\n");
      out.write("              height: 100px;\n");
      out.write("              background-color: black;\n");
      out.write("              color: white;\n");
      out.write("            \n");
      out.write("              \n");
      out.write("              font-size: 20px;\n");
      out.write("              width: 600px;\n");
      out.write("              position: relative;\n");
      out.write("              left: 330px;\n");
      out.write("              top: 50px;\n");
      out.write("              flex-wrap: wrap;\n");
      out.write("              border: 3px solid white;\n");
      out.write("          }\n");
      out.write("         .main\n");
      out.write("         {\n");
      out.write("             background-color: grey;\n");
      out.write("             height: 200px;\n");
      out.write("             display: flex;\n");
      out.write("             border: 2px solid black;\n");
      out.write("             flex-wrap: wrap;\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("         #particles-js\n");
      out.write("\t\t{\n");
      out.write("\t\t\theight: 100%;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("         #customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 3px solid black;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #18dcff;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: dodgerblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".head \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tbackground-color:#15c1dc;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write(".table-dark td, .table-dark th, .table-dark thead th\n");
      out.write("{\n");
      out.write("    border-color: white;\n");
      out.write("}\n");
      out.write(".nav{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: #333;\n");
      out.write("\t\t\tjustify-content: left;\n");
      out.write("\t\t\talign-items: left;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a{\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: #f1f1f1;\n");
      out.write("\t\t\tpadding: 12px 14px;\n");
      out.write("\t\t\twidth: 20%;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a:hover{\n");
      out.write("\t\t\tcolor: #333;\n");
      out.write("\t\t\tbackground-color: #fff200;\n");
      out.write("\t\t}\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \t<div class=\"head\">\n");
      out.write("             <b>Search Bus Record</b>\n");
      out.write("\t\t</div>\n");
      out.write("<!--        \t<div class=\"nav\">\n");
      out.write("\t<a href=\"adminHome.jsp\">HOME</a>\n");
      out.write("\t\t<a href=\"#\">Driver</a>\n");
      out.write("\t\t<a href=\"#\">Bus</a>\n");
      out.write("\t\t<a href=\"#\">Routes</a>\n");
      out.write("\t        \n");
      out.write("  <a href=\"\"  data-toggle=\"modal\" data-target=\"#modalRegisterForm\">About Us</a>\n");
      out.write("\n");
      out.write("  <a href=\"logout\" class=\"abc\">Logout</a>\n");
      out.write("</div>-->\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <table class=\"table table-dark table-hover\">\n");
      out.write("<tr>\n");
      out.write("     <th><B>Book ID</b></th>\n");
      out.write("    <th><B>Book Name</b></th>\n");
      out.write("    <th><b>Author Name</b></th>\n");
      out.write("    <th><b>Quantity</b></th>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</tr>\n");

    List<addBook> result = (List<addBook>)request.getAttribute("list");
    for(addBook s : result)
    {

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(s.getBookId());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getbName());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getAname());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getQuantity());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\t<div id=\"particles-js\">\n");
      out.write("            <script type=\"text/javascript\" src=\"particles.js\"></script>\n");
      out.write("     <script type=\"text/javascript\" src=\"app1.js\"></script>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("    </body>\n");
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
