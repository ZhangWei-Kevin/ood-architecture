package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <style>\r\n");
      out.write("        ul,li{list-style:none;margin:0;padding:0;}\r\n");
      out.write("        .box{ width: 800px; margin: auto;}\r\n");
      out.write("        .nav_link{ margin-top: 15px; overflow: hidden;}\r\n");
      out.write("        .nav_link span{float: left; line-height: 30px; font-size: 20px; font-weight:bold;}\r\n");
      out.write("        .nav_link li{ float: left; margin-right: 25px; margin-left:15px; border-radius:15px; width: 130px; height: 30px; background-color: #555; line-height: 30px; text-align: center;}\r\n");
      out.write("        .nav_link li a{ color: #fff; text-decoration: none;}\r\n");
      out.write("        .nav_link li a:hover{ color:#84ff00;}\r\n");
      out.write("        .main_ten{overflow: hidden; zoom:1; margin-top: 50px;}\r\n");
      out.write("        .main_ten li{ float: left; border-right:1px solid #ccc; width: 230px; height: 260px; padding: 20px 15px; text-align: center;}\r\n");
      out.write("        .main_ten li.last{border: none;}\r\n");
      out.write("        .main_ten li p{ margin-top: 10px; line-height: 25px;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("    <div class=\"nav_link\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <span>快速导航：</span>\r\n");
      out.write("            <li><a href=\"http://openkoala.org/\" target=\"_blank\">Koala官网</a></li>\r\n");
      out.write("            <li><a href=\"http://dev.openkoala.org/?/article/4\" target=\"_blank\">开发文档</a></li>\r\n");
      out.write("            <li><a href=\"http://dev.openkoala.org/\" target=\"_blank\">开发者社区</a></li>\r\n");
      out.write("            <li><a href=\"http://dev.openkoala.org/?/explore/category-4\" target=\"_blank\">提交BUG</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main_ten\">\r\n");
      out.write("        <h4>核心功能：</h4>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><img src=\"images/openci_icon.png\"/><p>向导式创建、导入项目，集成版本控制 (GIT/SVN)、项目管理(Trac/Redmine)、代码质量(Sonar)、持续集成(Jenkins)</p></li>\r\n");
      out.write("            <li><img src=\"images/koalaui_icon.png\"/><p>基于Bootstrap3、基于开源的或定制实现的JS组件，简化前端开发。</p></li>\r\n");
      out.write("            <li class=\"last\"><img src=\"images/lyjm_icon.png\"/><p>以业务分析和领域建模为出发点和依归自动生成领域类，消除问题域与解决方案域之间的鸿沟</p> </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
