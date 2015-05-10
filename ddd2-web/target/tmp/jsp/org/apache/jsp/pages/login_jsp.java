package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/taglibs.jsp");
    _jspx_dependants.add("/WEB-INF/k.tld");
    _jspx_dependants.add("/commons/statics.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
pageContext.setAttribute("contextPath", request.getContextPath());
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
pageContext.setAttribute("formId", "formId_" + new Date().getTime());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <title>欢迎使用Koala</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/bootstrap/css/bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/index.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/koala.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/koala-tree.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/login.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/main.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/security.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/organisation.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/validateForm/css/style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/gqc.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/respond.min.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/koala-tree.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/koala-ui.plugin.js\" ></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/validate.js\"></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/security/role.js\" ></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/security/user.js\" ></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/main.js\" ></script>\r\n");
      out.write("<script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/lib/validateForm/validateForm.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$.ajaxSetup({cache:false});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*   .* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".head {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground: #f2f2f2;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("\theight: 90px;\r\n");
      out.write("\twidth: 960px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo img {\r\n");
      out.write("\theight: 90px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo div {\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tline-height: 60px;\r\n");
      out.write("\tmargin: 20px 10px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tborder-left: 1px solid #d2d2d2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_con {\r\n");
      out.write("\twidth: 960px;\r\n");
      out.write("\theight: 332px;\r\n");
      out.write("\tmargin: 10px auto;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_con_L {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 568px;\r\n");
      out.write("\theight: 332px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_con_R {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 376px;\r\n");
      out.write("\theight: 332px;\r\n");
      out.write("\tborder: 1px solid #dce7f4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_con_R h4 {\r\n");
      out.write("\tbackground: #F2F2F2;\r\n");
      out.write("\tline-height: 36px;\r\n");
      out.write("\twidth: 376px;\r\n");
      out.write("\tpadding: 0px 6px;\r\n");
      out.write("\tborder: 1px solid #fff;\r\n");
      out.write("\tborder-bottom: 1px solid #d4d4d4;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_con_R  form {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding-top: 10%;\r\n");
      out.write("\tpadding-left: 7%;\r\n");
      out.write("\tpadding-right: 7%;\r\n");
      out.write("}\r\n");
      out.write(".login_con_R .input-group {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    margin-bottom: 25px!important;\r\n");
      out.write("}\r\n");
      out.write(".checkCode {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 54%;\r\n");
      out.write("\tleft: 56%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write(".btn-login {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_footer {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tmargin: 8% auto 0;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\tcolor: inherit;\r\n");
      out.write("    font-size: 21px;\r\n");
      out.write("    font-weight: 200;\r\n");
      out.write("    line-height: 2.14286;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type = \"text/javascript\">\r\n");
      out.write("        var contextPath = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
 response.setHeader("login","login"); 
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"head login\"></div>\r\n");
      out.write("\t<div class=\"logo\">\r\n");
      out.write("\t\t<img src=\"images/background/logo.gif\" />\r\n");
      out.write("\t\t<div>Koala系统</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"login_con\">\r\n");
      out.write("\t\t<div class=\"login_con_L\">\r\n");
      out.write("\t\t\t<img src=\"images/background/login_img.gif\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"login_con_R\">\r\n");
      out.write("\t\t\t<h4>登录</h4>\r\n");
      out.write("\t\t\t<FORM id=\"loginFormId\" class=\"form-horizontal\" action=\"login\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group input-group\">\r\n");
      out.write("                    <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-user\"></span></span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"用户名\"  name=\"username\" id=\"j_username\" value=\"koala\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                <div class=\"form-group input-group\">\r\n");
      out.write("                    <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></span>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"j_password\" class=\"form-control\" placeholder=\"密码\" value=\"888888\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group input-group\" style=\"margin-top: 45px;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\"  class=\"btn btn-primary btn-block\" id=\"loginBtn\">登录</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</FORM>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"login_footer\">Koala 版权信息 2014</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("     \tvar btnLogin = $('#loginBtn');\r\n");
      out.write("    \tvar form = $('#loginFormId');\r\n");
      out.write("        $('body').keydown(function(e) {\r\n");
      out.write("            if (e.keyCode == 13) {\r\n");
      out.write("            \tdologin();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        btnLogin.on('click',function() {\r\n");
      out.write("        \tdologin();\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("\t    var dologin = function() {\r\n");
      out.write("\t        var userNameElement = $(\"#j_username\");\r\n");
      out.write("\t        var passwordElement = $(\"#j_password\");\r\n");
      out.write("\t        var username = userNameElement.val();\r\n");
      out.write("\t        var password = passwordElement.val();\r\n");
      out.write("\t        if (!Validation.notNull($('body'), userNameElement, username, '用户名不能为空')) {\r\n");
      out.write("\t            return false;\r\n");
      out.write("\t        }\r\n");
      out.write("\t        if (!Validation.notNull($('body'), passwordElement, password, '密码不能为空')) {\r\n");
      out.write("\t            return false;\r\n");
      out.write("\t        }\r\n");
      out.write("\t        btnLogin.attr('disabled', 'disabled').html('正在登录...');\r\n");
      out.write("    \t\tvar param = form.serialize();\r\n");
      out.write("        \t$.ajax({\r\n");
      out.write("        \t\turl: contextPath+\"/login.koala\",\r\n");
      out.write("        \t\tdataType: \"json\",\r\n");
      out.write("        \t\tdata: param,\r\n");
      out.write("        \t\ttype: \"POST\",\r\n");
      out.write("        \t\tsuccess: function(data){\r\n");
      out.write("        \t\t\tif(data.success){\r\n");
      out.write("        \t\t\t\t$('.login_con_R').message({\r\n");
      out.write("        \t\t\t\t\ttype: 'success',\r\n");
      out.write("        \t\t\t\t\tcontent:  '登录成功！'\r\n");
      out.write("        \t\t\t\t});\r\n");
      out.write("        \t\t\t\twindow.location.href=contextPath+\"/index.koala\";\r\n");
      out.write("        \t\t\t}else{\r\n");
      out.write("        \t\t\t\tbtnLogin.removeAttr('disabled').html('登录');\r\n");
      out.write("        \t\t\t\t$('.login_con_R').message({\r\n");
      out.write("        \t\t\t\t\ttype: 'error',\r\n");
      out.write("        \t\t\t\t\tcontent: data.errorMessage\r\n");
      out.write("        \t\t\t\t});\r\n");
      out.write("        \t\t\t\trefreshCode();\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction refreshCode() {\r\n");
      out.write("\t\t\t$(\"#checkCode\").attr(\"src\",\"jcaptcha.jpg?time=\"+new Date().getTime());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!jCaptchaDisabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t<div class=\"form-group input-group\">\r\n");
        out.write("\t\t\t\t    \t<span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-magnet\"></span></span>\r\n");
        out.write("\t\t\t\t\t\t<input type=\"text\" id=\"jCaptchaCode\"  style=\"width:50%;\" name=\"jCaptchaCode\" value=\"\" class=\"form-control\" placeholder=\"验证码\"  autocomplete=\"off\"/>\r\n");
        out.write("\t\t\t\t\t\t<div style=\"width:120px;\"></div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<img src=\"jcaptcha.jpg\" id=\"checkCode\" onclick='refreshCode()' class=\"checkCode\"/>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
