package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      com.hand.bean.Login loginBean = null;
      synchronized (session) {
        loginBean = (com.hand.bean.Login) _jspx_page_context.getAttribute("loginBean", PageContext.SESSION_SCOPE);
        if (loginBean == null){
          loginBean = new com.hand.bean.Login();
          _jspx_page_context.setAttribute("loginBean", loginBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>用户登录</title>\r\n");
      out.write("  <link href=\"bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"app.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write(" <style>\r\n");
      out.write("      #bid{\r\n");
      out.write("        background-image: url(\"login1.jpg\");\r\n");
      out.write("  \t\tbackground-size: 1500px 750px;\r\n");
      out.write("      }\r\n");
      out.write("      #fid{\r\n");
      out.write("      \twidth: 500px;\r\n");
      out.write("      \theight: 200px;\r\n");
      out.write("      \tbackground-color: white;\r\n");
      out.write("      \tmargin-top: auto;\r\n");
      out.write("      \tposition: center;\r\n");
      out.write("      }\r\n");
      out.write("      #h2id{\r\n");
      out.write("      \tmargin-top: 20px;\r\n");
      out.write("      \tmargin-left: 20px;\r\n");
      out.write("      \tcolor: black;\r\n");
      out.write("      \t\r\n");
      out.write("      }\r\n");
      out.write("      #pid{\r\n");
      out.write("      \tmargin-left: 10px; \r\n");
      out.write("      \tbackground-color: snow;\r\n");
      out.write("      }\r\n");
      out.write("      #lid{\r\n");
      out.write("      \tbackground-color: snow;\r\n");
      out.write("      \tfloat: left;\r\n");
      out.write("      }\r\n");
      out.write("      .inid{\r\n");
      out.write("      \tbackground-color: snow;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write(" </style>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bid\">\r\n");
      out.write("  <h2 id=\"h2id\">19248827</h2>\r\n");
      out.write("  <div id=\"did\" align=\"center\">\r\n");
      out.write("    \t\r\n");
      out.write("  \t\t<form id=\"fid\" class=\"form_horizontal\" role=\"form\" action=\"loginServlet\" method=\"post\">\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t<label id=\"lid\" ><p id=\"pid\">电影租赁管理系统</p></label><br>\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t<label>用户名</label>\r\n");
      out.write("  \t\t\t\t\t<input class=\"inid\" type=\"text\" name=\"logname\">\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write("  \t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t<label>密码</label>\r\n");
      out.write("  \t\t\t\t\t<input class=\"inid\" type=\"password\" name=\"password\">\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write("  \t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t<label ></label>\r\n");
      out.write("  \t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("  \t\t\t\t\t<input type=\"submit\" name=\"g\" value=\"提交\">\r\n");
      out.write("  \t\t\t\t</div>  \t\t\t\t\r\n");
      out.write("  \t\t\t</div>\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t</form>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \r\n");
      out.write("  <script src=\"jquery-2.1.1min.js\"></script>\r\n");
      out.write("  <script src=\"bootstrap.min.js\"></script>  \r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
