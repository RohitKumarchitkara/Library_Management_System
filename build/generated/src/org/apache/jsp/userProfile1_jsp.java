package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.student;
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

public final class userProfile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     \n");
      out.write("               <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-image: url(\"sb.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             .header \n");
      out.write("          {\n");
      out.write("              height: 100px;\n");
      out.write("              background-color: red;\n");
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
      out.write("              box-shadow: 10px 10px 10px white;\n");
      out.write("          }\n");
      out.write("         .main\n");
      out.write("         {\n");
      out.write("             background-color: black;\n");
      out.write("             height: 200px;\n");
      out.write("             display: flex;\n");
      out.write("             border: 2px solid black;\n");
      out.write("             flex-wrap: wrap;\n");
      out.write("             \n");
      out.write("         }\n");
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
      out.write("#customers tr:nth-child(even){background-color: white;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #303952;color: white;}\n");
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
      out.write("\tbackground-color:#16d1ef;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write(".table-dark\n");
      out.write("{\n");
      out.write("    background-color: rgba(0,0,0,0.3);\n");
      out.write("}\n");
      out.write(".table-dark th,.table-dark td,.table-dark thead th \n");
      out.write("{\n");
      out.write("    border-color: white;\n");
      out.write("}\n");
      out.write(".abc \n");
      out.write("{\n");
      out.write("    background-color: #17f108;\n");
      out.write("    width: 120px;\n");
      out.write("    outline: none;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    color: white;\n");
      out.write("    height: 40px;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("#login-box1{\n");
      out.write("    width: 620px;\n");
      out.write("    height: 450px;\n");
      out.write("    background: #f8f9fa12;\n");
      out.write("    color: #fff;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-left: 10px;\n");
      out.write("    margin-top: 54px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  font-size: 30px;\n");
      out.write("   color: wheat;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".a1 {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*.a1 th{\n");
      out.write("  padding: 3px;\n");
      out.write("  text-align: left;\n");
      out.write("  border-bottom: greenyellow;\n");
      out.write("}\n");
      out.write(".a1 td {\n");
      out.write("  padding: 8px;\n");
      out.write("  text-align: left;\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".a1 tr:hover {background-color:white;\n");
      out.write("color:black;}\n");
      out.write(".i1 \n");
      out.write("{\n");
      out.write("    height: 100px;\n");
      out.write("    width: 100px;\n");
      out.write("}\n");
      out.write(".table-dark td\n");
      out.write("{\n");
      out.write("    font-size: 25px;\n");
      out.write("}*/\n");
      out.write("                .nav{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tjustify-content: left;\n");
      out.write("\t\t\talign-items: left;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a{\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: #f1f1f1;\n");
      out.write("\t\t\tpadding: 12px 14px;\n");
      out.write("\t\t\twidth: 25%;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a:hover{\n");
      out.write("\t\t\tcolor: #333;\n");
      out.write("\t\t\tbackground-color: whitesmoke;\n");
      out.write("\t\t}\n");
      out.write("                .abc \n");
      out.write("{\n");
      out.write("    background-color: #f70334;\n");
      out.write("}\n");
      out.write(".abc {\n");
      out.write("    background-color: #f70334;\n");
      out.write("    width: 120px;\n");
      out.write("    outline: none;\n");
      out.write("    border-radius: 0px;\n");
      out.write("    color: white;\n");
      out.write("    height: 50px;\n");
      out.write("    border: none;\n");
      out.write("    border: none;\n");
      out.write("}\t\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #E0E0E0;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 15px;\n");
      out.write("  width:15%;\n");
      out.write("  height: 50px;\n");
      out.write("}\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: rgba(223,230,234,0.6);\n");
      out.write("  color: black;\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("tr:nth-child(odd) {\n");
      out.write("  background-color: white;\n");
      out.write("  color: black;\n");
      out.write("  border: 1px solid white;\n");
      out.write("}\n");
      out.write(".i12 \n");
      out.write("{\n");
      out.write("    height: 100px;\n");
      out.write("    width: 100px;\n");
      out.write("}\n");
      out.write("         </style>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("             <b>User Profile</b>\n");
      out.write("\t\t</div>\n");
      out.write("      \n");
      out.write("     <div class=\"nav\">\n");
      out.write("\t<a href=\"UserHome.jsp\">HOME</a>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t<a href=\"#\">Search Book</a>\n");
      out.write("\t        \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <a href=\"logout\" class=\"abc\">Logout</a>\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <table>\n");
      out.write("<tr>\n");
      out.write("    <th>Student Profile</th>\n");
      out.write("    <th><B>Student ID</b></th>\n");
      out.write("    <th><B>Student Name</b></th>\n");
      out.write("    <th><b>E-mail</b></th>\n");
      out.write("    <th><b>Branch</b></th>\n");
      out.write(" \n");
      out.write("    \n");
      out.write("</tr>\n");
      out.write("\n");

   List<student> records =  (List<student>)session.getAttribute("rel");   
   if(records!=null)
   {
       System.out.println("inn");
   for(student s: records)
   {

     

      out.write("\n");
      out.write("<td><img class=\"i12\" src=\"a4.png\"></td>\n");
      out.write("<td>");
      out.print( s.getSid());
      out.write("</td>\n");
      out.write("<td>");
      out.print( s.getSname());
      out.write("</td>\n");
      out.write("<td>");
      out.print( s.getEmail());
      out.write("</td>\n");
      out.write("<td>");
      out.print( s.getBranch());
      out.write("</td>\n");
      out.write("\n");

}}

      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("  \n");
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
