package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/commons/taglibs.jsp");
    _jspx_dependants.add("/commons/statics.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ks_user_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ks_user_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ks_user_property_nobody.release();
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
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <title>Koala权限系统</title>\r\n");
      out.write("    ");
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
      out.write("    <style>\r\n");
      out.write("        .nav-stacked .node ul{\r\n");
      out.write("            display:none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        var contextPath = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\r\n");
      out.write("        $(function(){\r\n");
      out.write("            var roleName = $('#roles').html();\r\n");
      out.write("            var url = contextPath + \"/auth/currentUser/findAllMenusByUserAsRole.koala?\"+new Date().getTime();\r\n");
      out.write("            $.get(url,function(data){\r\n");
      out.write("                $.each(data.data,function(){\r\n");
      out.write("                var $li = $('<li class=\"folder\"><a data-toggle=\"collapse\" href=\"#menuMark'+this.id+'\"><span class=\"'+this.menuIcon+'\"></span>&nbsp;'+this.name+'&nbsp;'+\r\n");
      out.write("                            '<i class=\"glyphicon glyphicon-chevron-left\" style=\" float: right;font-size: 12px;position: relative;right: 8px;top: 3px;\"></i></a><ul id=\"menuMark'+this.id+'\" class=\"second-level-menu in\"></ul></li>');\r\n");
      out.write("                        $('.first-level-menu').append($li);\r\n");
      out.write("                        renderSubMenu(this.children, $li);\r\n");
      out.write("            \t});\r\n");
      out.write("            /*\r\n");
      out.write("                    * 菜单收缩样式变化\r\n");
      out.write("                     */\r\n");
      out.write("                    var firstLevelMenu = $('.first-level-menu');\r\n");
      out.write("                    firstLevelMenu.find('[data-toggle=\"collapse\"]').each(function(){\r\n");
      out.write("                        var $this = $(this);\r\n");
      out.write("                        firstLevelMenu.find($(this).attr('href')).on({\r\n");
      out.write("                            'shown.bs.collapse': function(e){\r\n");
      out.write("                                $this.find('i:last').addClass('glyphicon-chevron-left').removeClass('glyphicon-chevron-right');\r\n");
      out.write("                            },\r\n");
      out.write("                            'hidden.bs.collapse': function(e){\r\n");
      out.write("                                $this.find('i:last').removeClass('glyphicon-chevron-left').addClass('glyphicon-chevron-right');\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("            },\"json\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        \tvar renderSubMenu = function(data, $menu){\r\n");
      out.write("\t\t\t\t\t\t$.each(data, function(){\r\n");
      out.write("\t\t\t\t\t\t\tif(this.children.length > 0){\r\n");
      out.write("\t\t                        var $li = $('<li class=\"folder\"><a data-toggle=\"collapse\" href=\"#menuMark'+this.id+'\"><span class=\"'+this.menuIcon+'\"></span>&nbsp;'+this.name+'&nbsp;'+\r\n");
      out.write("\t\t                            '<i class=\"glyphicon glyphicon-chevron-right pull-right\" style=\"position: relative; right: 12px;font-size: 12px;\"></i></a><ul id=\"menuMark'+this.id+'\" class=\"second-level-menu collapse\"></ul></li>');\r\n");
      out.write("\t\t                        $li.appendTo($menu.find('.second-level-menu:first')).find('a').css('padding-left', parseInt(this.level + 1)*18+'px');\r\n");
      out.write("\t\t                        renderSubMenu(this.children, $li);\r\n");
      out.write("\t\t                    }else{\r\n");
      out.write("\t\t                        var $li = $(' <li class=\"submenu\" data-role=\"openTab\" data-target=\"'+this.url+'\" data-title=\"'+this.name+'\" ' +\r\n");
      out.write("\t\t                            'data-mark=\"menuMark'+this.id+'\"><a ><span class=\"'+this.menuIcon+'\"></span>&nbsp;'+this.name+'</a></li>');\r\n");
      out.write("\t\t                        $li.appendTo($menu.find('.second-level-menu:first')).find('a').css('padding-left', parseInt(this.level + 1)*18+'px');\r\n");
      out.write("\t\t                        \r\n");
      out.write("\t\t                        \r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t                    $menu.find('[data-toggle=\"collapse\"]').each(function(){\r\n");
      out.write("\t                        var $this = $(this);\r\n");
      out.write("\t                        $menu.find($(this).attr('href')).on({\r\n");
      out.write("\t                            'shown.bs.collapse': function(e){\r\n");
      out.write("\t                            \te.stopPropagation();\r\n");
      out.write("\t                            \te.preventDefault();\r\n");
      out.write("\t                                $this.find('i:last').addClass('glyphicon-chevron-left').removeClass('glyphicon-chevron-right');\r\n");
      out.write("\t                            },\r\n");
      out.write("\t                            'hidden.bs.collapse': function(e){\r\n");
      out.write("\t                            \te.stopPropagation();\r\n");
      out.write("\t                            \te.preventDefault();\r\n");
      out.write("\t                                $this.find('i:last').removeClass('glyphicon-chevron-left').addClass('glyphicon-chevron-right');\r\n");
      out.write("\t                            }\r\n");
      out.write("\t                        });\r\n");
      out.write("\t                    });\r\n");
      out.write("\t\t\t\t\t\t$menu.find('li.submenu').on('click', function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t$('.first-level-menu').find('li').each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar $menuLi = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t$menuLi.hasClass('active') && $menuLi.removeClass('active').parent().parent().removeClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t$this.addClass('active').parents().filter('.folder').addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\tvar target = $this.data('target');\r\n");
      out.write("\t\t\t\t\t\t\tvar title = $this.data('title');\r\n");
      out.write("\t\t\t\t\t\t\tvar mark = $this.data('mark');\r\n");
      out.write("\t\t\t\t\t\t\tif(target && title && mark ){\r\n");
      out.write("\t\t\t\t\t\t\t\topenTab(target, title, mark);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("        /*判断一个对象是否数组*/\r\n");
      out.write("        function isArray(o){\r\n");
      out.write("            return '[object Array]' == Object.prototype.toString.call(o);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 更改联系电话\r\n");
      out.write("        // ------------ changeTelePhoneOfUser start ---------------\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#userManager').find(\"li[data-target=#changeTelePhoneOfUser]\").click(function(){\r\n");
      out.write("                $.get(contextPath + '/pages/auth/user-changeTelePhone.jsp').done(function(data){\r\n");
      out.write("                    var dialog  = $(data);\r\n");
      out.write("                    var oldTelePhone = dialog.find('#oldTelePhone');\r\n");
      out.write("                    var newTelePhone = dialog.find('#newTelePhone');\r\n");
      out.write("                    var confirmPassword = dialog.find('#confirmPassword');\r\n");
      out.write("\r\n");
      out.write("                    dialog.find('#changeTelePhoneOfUserSave').on('click', function(){\r\n");
      out.write("                        var data = {};\r\n");
      out.write("                        data['telePhone'] = newTelePhone.val();\r\n");
      out.write("                        data['userPassword'] = confirmPassword.val();\r\n");
      out.write("                        $.post(contextPath+'/auth/currentUser/changeUserTelePhone.koala',data,function(data){\r\n");
      out.write("                            if(data.success){\r\n");
      out.write("                                dialog.find('#changeTelePhoneOfUserMessage').message({\r\n");
      out.write("                                    type : 'success',\r\n");
      out.write("                                    content : '更改联系电话成功!'\r\n");
      out.write("                                });\r\n");
      out.write("                                dialog.modal('hide');\r\n");
      out.write("                            }else{\r\n");
      out.write("                                dialog.find('#changeTelePhoneOfUserMessage').message({\r\n");
      out.write("                                    type : 'error',\r\n");
      out.write("                                    content : data.errorMessage\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }).end().modal({\r\n");
      out.write("                        keyboard : false\r\n");
      out.write("                    }).on({\r\n");
      out.write("                        'hidden.bs.modal' : function() {\r\n");
      out.write("                            $(this).remove();\r\n");
      out.write("                        },\r\n");
      out.write("                        'complete': function(){\r\n");
      out.write("                            dialog.message({\r\n");
      out.write("                                type: 'success',\r\n");
      out.write("                                content: '更改联系电话成功!'\r\n");
      out.write("                            });\r\n");
      out.write("                            $(this).modal('hide');\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    //兼容IE8 IE9\r\n");
      out.write("                    if(window.ActiveXObject){\r\n");
      out.write("                        if(parseInt(navigator.userAgent.toLowerCase().match(/msie ([\\d.]+)/)[1]) < 10){\r\n");
      out.write("                            dialog.trigger('shown.bs.modal');\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        // ------------ changeTelePhoneOfUser end ---------------\r\n");
      out.write("\r\n");
      out.write("        // 更改邮箱\r\n");
      out.write("        // ------------ changeEmailOfUser start ---------------\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#userManager').find(\"li[data-target=#changeEmailOfUser]\").click(function(){\r\n");
      out.write("                $.get(contextPath + '/pages/auth/user-changeEmail.jsp').done(function(data){\r\n");
      out.write("                    var dialog  = $(data);\r\n");
      out.write("                    var oldEmail = dialog.find('#oldEmail');\r\n");
      out.write("                    var newEmail = dialog.find('#newEmail');\r\n");
      out.write("                    var confirmPassword = dialog.find('#confirmPassword');\r\n");
      out.write("\r\n");
      out.write("                    dialog.find('#changeEmailOfUserSave').on('click', function(){\r\n");
      out.write("                        var data = {};\r\n");
      out.write("                        data['email'] = newEmail.val();\r\n");
      out.write("                        data['userPassword'] = confirmPassword.val();\r\n");
      out.write("                        $.post(contextPath+'/auth/currentUser/changeUserEmail.koala',data,function(data){\r\n");
      out.write("                            if(data.success){\r\n");
      out.write("                                dialog.find('#changeEmailOfUserMessage').message({\r\n");
      out.write("                                    type : 'success',\r\n");
      out.write("                                    content : '更改邮箱成功!'\r\n");
      out.write("                                });\r\n");
      out.write("                                dialog.modal('hide');\r\n");
      out.write("                            }else{\r\n");
      out.write("                                dialog.find('#changeEmailOfUserMessage').message({\r\n");
      out.write("                                    type : 'error',\r\n");
      out.write("                                    content : data.errorMessage\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }).end().modal({\r\n");
      out.write("                        keyboard : false\r\n");
      out.write("                    }).on({\r\n");
      out.write("                        'hidden.bs.modal' : function() {\r\n");
      out.write("                            $(this).remove();\r\n");
      out.write("                        },\r\n");
      out.write("                        'complete': function(){\r\n");
      out.write("                            dialog.message({\r\n");
      out.write("                                type: 'success',\r\n");
      out.write("                                content: '更改邮箱成功'\r\n");
      out.write("                            });\r\n");
      out.write("                            $(this).modal('hide');\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    //兼容IE8 IE9\r\n");
      out.write("                    if(window.ActiveXObject){\r\n");
      out.write("                        if(parseInt(navigator.userAgent.toLowerCase().match(/msie ([\\d.]+)/)[1]) < 10){\r\n");
      out.write("                            dialog.trigger('shown.bs.modal');\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        // ------------ changeEmailOfUser end ---------------\r\n");
      out.write("\r\n");
      out.write("        /*切换角色*/\r\n");
      out.write("        $(function(){\r\n");
      out.write("            // ------------ switchOverRoleOfUser start ---------------\r\n");
      out.write("            $('#userManager').find(\"li[data-target=#rolesToggle]\").click(function(){\r\n");
      out.write("                $.get(contextPath + '/pages/auth/role-switch.jsp').done(function(data){\r\n");
      out.write("                    var dialog = $(data);\r\n");
      out.write("                    dialog.find('#toggle').on('click',function(){\r\n");
      out.write("                        var items = dialog.find('.selectRoleGrid').data('koala.grid').selectedRows();\r\n");
      out.write("                        if(items.length == 0){\r\n");
      out.write("                            dialog.find('.selectRoleGrid').message({\r\n");
      out.write("                                type: 'warning',\r\n");
      out.write("                                content: '请选择要切换的角色'\r\n");
      out.write("                            });\r\n");
      out.write("                            return;\r\n");
      out.write("                        }\r\n");
      out.write("                        if(items.length>1){\r\n");
      out.write("                            dialog.find('.selectRoleGrid').message({\r\n");
      out.write("                                type:'warning',\r\n");
      out.write("                                content:'只能选择一个角色'\r\n");
      out.write("                            });\r\n");
      out.write("                            return;\r\n");
      out.write("                        }\r\n");
      out.write("                        $.post(contextPath + '/auth/currentUser/switchOverRoleOfUser.koala', \"roleName=\" + items[0].name,function(data){\r\n");
      out.write("                            if(data.success){\r\n");
      out.write("                                dialog.find('.selectRoleGrid').message({\r\n");
      out.write("                                    type:'success',\r\n");
      out.write("                                    content:'切换角色成功！'\r\n");
      out.write("                                });\r\n");
      out.write("                                window.location.href=contextPath+\"/index.koala\";\r\n");
      out.write("                            }else{\r\n");
      out.write("                                dialog.find('.selectRoleGrid').message({\r\n");
      out.write("                                    type:'error',\r\n");
      out.write("                                    content:'系统错误！'\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    })\r\n");
      out.write("                    dialog.modal({\r\n");
      out.write("                        keyboard: false\r\n");
      out.write("                    }).on({\r\n");
      out.write("                        'hidden.bs.modal': function(){\r\n");
      out.write("                            $(this).remove();\r\n");
      out.write("                        },\r\n");
      out.write("\r\n");
      out.write("                        'shown.bs.modal': function(){ //弹窗初始化完毕后，初始化url选择表格\r\n");
      out.write("                            var columns = [{\r\n");
      out.write("                                title : \"角色名称\",\r\n");
      out.write("                                name : \"name\",\r\n");
      out.write("                                width : 250\r\n");
      out.write("                            }, {\r\n");
      out.write("                                title : \"角色描述\",\r\n");
      out.write("                                name : \"description\",\r\n");
      out.write("                                width : 250\r\n");
      out.write("                            }];\r\n");
      out.write("\r\n");
      out.write("                            dialog.find('.selectRoleGrid').grid({\r\n");
      out.write("                                identity: 'id',\r\n");
      out.write("                                columns: columns,\r\n");
      out.write("                                url: contextPath + '/auth/currentUser/pagingQueryRolesOfUser.koala'\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("                    //兼容IE8 IE9\r\n");
      out.write("                    if(window.ActiveXObject){\r\n");
      out.write("                        if(parseInt(navigator.userAgent.toLowerCase().match(/msie ([\\d.]+)/)[1]) < 10){\r\n");
      out.write("                            dialog.trigger('shown.bs.modal');\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                // ------------ switchOverRoleOfUser end ---------------\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        });\r\n");
      out.write("        /**\r\n");
      out.write("    \t * 显示详细信息\r\n");
      out.write("    \t */\r\n");
      out.write("    \tvar showDetail = function(){\r\n");
      out.write("        \tvar userInfo = $(\"#userInfo\").html();\r\n");
      out.write("        \t   var thiz \t= $(this),\r\n");
      out.write("               mark \t= thiz.attr('mark');\r\n");
      out.write("       \t\t  mark = openTab('/pages/auth/currentUser-info.jsp', userInfo, mark);\r\n");
      out.write("              if(mark){\r\n");
      out.write("                  thiz.attr(\"mark\",mark);\r\n");
      out.write("              }\r\n");
      out.write("    \t};\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<input type=\"hidden\" id=\"roleId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\t<div class=\"g-head\">\r\n");
      out.write("\t    <nav class=\"navbar navbar-default\">\r\n");
      out.write("\t        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("\t        \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/global.logo.png\"/>\r\n");
      out.write("\t        \t<span style=\"font-weight:800;\">Koala权限系统</span>\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                <div class=\"btn-group navbar-right\">\r\n");
      out.write("                    <img class=\"dropdown-toggle\" data-toggle=\"dropdown\" id='btn1'  src =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/systemFunction.png  style=\"width: 35px; height: 35px; margin-top: 5px;\" />\r\n");
      out.write("                    <ul class=\"dropdown-menu\" id=\"userManager\" style=\"min-width: 0\">\r\n");
      out.write("                        <li data-target=\"loginOut\"><a href=\"#\" class=\"glyphicon glyphicon-off\">&nbsp;注销</a></li>\r\n");
      out.write("                        <li data-target=\"modifyPwd\"><a href=\"#\" class=\"glyphicon glyphicon-pencil\">&nbsp;更改密码</a></li>\r\n");
      out.write("                        <li data-toggle=\"modal\" data-target=\"#changeEmailOfUser\"><a href=\"#\" class=\"glyphicon glyphicon-envelope\">&nbsp;更改邮箱</a></li>\r\n");
      out.write("                        <li data-toggle=\"modal\" data-target=\"#changeTelePhoneOfUser\"><a href=\"#\" class=\"glyphicon glyphicon-earphone\">&nbsp;更改电话</a></li>\r\n");
      out.write("                        <li data-toggle='modal' data-target=\"#rolesToggle\"><a href=\"#\" class=\"glyphicon glyphicon-repeat\">&nbsp;切换角色</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--角色信息-->\r\n");
      out.write("                <div class=\"btn-group navbar-right\">\r\n");
      out.write("                    <label for = \"roles\" class = \"user_name\">角色: </label>\r\n");
      out.write("\t            \t<span id=\"roles\" style=\"font-size: 12px\">");
      if (_jspx_meth_ks_user_0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" id=\"allRolesId\"></ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\t            <!-- 账号信息 -->\r\n");
      out.write("\t            <div class=\"btn-group navbar-right\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                        <!-- 为了不改变页面布局-->\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <a href=\"#\" id=\"userInfo\"  onclick=\"showDetail()\" class=\"glyphicon glyphicon-user\" style=\"color: #fff;text-decoration: none; -moz-osx-font-smoothing:none;top:-1px;font-weight: bold; font-size: 12px;\"  title=\"查看个人信息\"  >&nbsp;");
      if (_jspx_meth_ks_user_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    &nbsp; &nbsp;\r\n");
      out.write("                </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"g-body\">\r\n");
      out.write("\t\t<!-- 左边导航 -->\r\n");
      out.write("\t    <div class=\"col-xs-2 g-sidec\">\r\n");
      out.write("\t        <ul class=\"nav nav-stacked first-level-menu\">\r\n");
      out.write("\t       \t\t\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!-- 右边内容 -->\r\n");
      out.write("\t    <div class=\"col-xs-10 g-mainc\">\r\n");
      out.write("\t        <ul class=\"nav nav-tabs\" id=\"navTabs\">\r\n");
      out.write("\t            <li class=\"active\"><a href=\"#home\" data-toggle=\"tab\">主页</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t        <div class=\"tab-content\" id=\"tabContent\">\r\n");
      out.write("\t            <div id=\"home\" class=\"tab-pane active\"></div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\t<div id=\"footer\" class=\"g-foot\"><span>Copyright © 2011-2014 Koala</span></div>\r\n");
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

  private boolean _jspx_meth_ks_user_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:user
    org.openkoala.security.taglibs.UserTag _jspx_th_ks_user_0 = (org.openkoala.security.taglibs.UserTag) _jspx_tagPool_ks_user_property_nobody.get(org.openkoala.security.taglibs.UserTag.class);
    _jspx_th_ks_user_0.setPageContext(_jspx_page_context);
    _jspx_th_ks_user_0.setParent(null);
    _jspx_th_ks_user_0.setProperty("roleName");
    int _jspx_eval_ks_user_0 = _jspx_th_ks_user_0.doStartTag();
    if (_jspx_th_ks_user_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_user_property_nobody.reuse(_jspx_th_ks_user_0);
      return true;
    }
    _jspx_tagPool_ks_user_property_nobody.reuse(_jspx_th_ks_user_0);
    return false;
  }

  private boolean _jspx_meth_ks_user_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:user
    org.openkoala.security.taglibs.UserTag _jspx_th_ks_user_1 = (org.openkoala.security.taglibs.UserTag) _jspx_tagPool_ks_user_property_nobody.get(org.openkoala.security.taglibs.UserTag.class);
    _jspx_th_ks_user_1.setPageContext(_jspx_page_context);
    _jspx_th_ks_user_1.setParent(null);
    _jspx_th_ks_user_1.setProperty("name");
    int _jspx_eval_ks_user_1 = _jspx_th_ks_user_1.doStartTag();
    if (_jspx_th_ks_user_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_user_property_nobody.reuse(_jspx_th_ks_user_1);
      return true;
    }
    _jspx_tagPool_ks_user_property_nobody.reuse(_jspx_th_ks_user_1);
    return false;
  }
}
