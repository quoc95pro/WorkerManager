package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_required_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_selectManyCheckbox_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_required_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_selectManyCheckbox_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_h_inputText_value_required_nobody.release();
    _jspx_tagPool_h_selectManyCheckbox_value_nobody.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_h_commandButton_value_action_nobody.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_h_form.release();
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id8");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta charset=\"utf-8\">\n");
        out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
        out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        out.write("    <meta name=\"description\" content=\"\">\n");
        out.write("    <meta name=\"author\" content=\"\">\n");
        out.write("   \n");
        out.write("\n");
        out.write("    <title>Heroic Features - Start Bootstrap Template</title>\n");
        out.write("\n");
        out.write("    <!-- Bootstrap Core CSS -->\n");
        out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
        out.write("\n");
        out.write("    <!-- Custom CSS -->\n");
        out.write("    <link href=\"css/heroic-features.css\" rel=\"stylesheet\" type=\"text/css\">\n");
        out.write("\n");
        out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
        out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
        out.write("    <!--[if lt IE 9]>\n");
        out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
        out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
        out.write("    <![endif]-->\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"asm.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" \n");
        out.write("              integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\n");
        out.write("              crossorigin=\"anonymous\">\n");
        out.write("\n");
        out.write("        <!-- Optional theme -->\n");
        out.write("        <link rel=\"stylesheet\"\n");
        out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" \n");
        out.write("              integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" \n");
        out.write("              crossorigin=\"anonymous\">\n");
        out.write("\n");
        out.write("        <!-- Latest compiled and minified JavaScript -->\n");
        out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" \n");
        out.write("                integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\n");
        out.write("        crossorigin=\"anonymous\"></script>\n");
        out.write("        <style>\n");
        out.write("footer .glyphicon {\n");
        out.write("    font-size: 20px;\n");
        out.write("    margin-bottom: 20px;\n");
        out.write("    color: #f4511e;\n");
        out.write("}\n");
        out.write("</style>\n");
        out.write("\n");
        out.write("        <title>Login</title>\n");
        out.write("    </head>\n");
        out.write("    <body id=\"myPage\">\n");
        out.write("         <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
        out.write("            <div class=\"navbar-header\">\n");
        out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                    <span class=\"icon-bar\"></span>\n");
        out.write("                    <span class=\"icon-bar\"></span>\n");
        out.write("                    <span class=\"icon-bar\"></span>\n");
        out.write("                </button>\n");
        out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Trang chủ</a>\n");
        out.write("            </div>\n");
        out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
        out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
        out.write("                <ul class=\"nav navbar-nav\">\n");
        out.write("                    <li>\n");
        out.write("                        ");
        if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                       \n");
        out.write("                    </li>\n");
        out.write("                    <li>\n");
        out.write("                        <a href=\"#\">Services</a>\n");
        out.write("                    </li>\n");
        out.write("                    <li>\n");
        out.write("                        <a href=\"#\">Contact</a>\n");
        out.write("                    </li>\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("            <!-- /.navbar-collapse -->\n");
        out.write("        </div>\n");
        out.write("        <!-- /.container -->\n");
        out.write("    </nav>\n");
        out.write("\n");
        out.write("    <fmt:requestEncoding value=\"UTF-8\" />\n");
        out.write("        <div class=\"jumbotron text-center\">\n");
        out.write("            <h1>WORKER MANAGE</h1> \n");
        out.write("        </div>\n");
        out.write("        <div id=\"mid\">\n");
        out.write("            <div id=\"left\"></div>\n");
        out.write("            <div id=\"content\">\n");
        out.write("                <center>\n");
        out.write("                    ");
        if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </center>\n");
        out.write("            </div>\n");
        out.write("            <!-- Add Google Maps -->\n");
        out.write("<div id=\"googleMap\" style=\"height:400px;width:100%;\"></div>\n");
        out.write("<script>\n");
        out.write("function myMap() {\n");
        out.write("    var myCenter = new google.maps.LatLng(21.028554,105.782114);\n");
        out.write("var mapProp = {center:myCenter, zoom:16, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};\n");
        out.write("var map=new google.maps.Map(document.getElementById(\"googleMap\"),mapProp);\n");
        out.write("var marker = new google.maps.Marker({position:myCenter});\n");
        out.write("marker.setMap(map);\n");
        out.write("}\n");
        out.write("</script>\n");
        out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBgGdyipFkSZMkrnSjUMaOKocgrzYePMjk&callback=myMap\"></script>\n");
        out.write("        </div>\n");
        out.write("        <footer class=\"container-fluid text-center\">\n");
        out.write("  <a href=\"#myPage\" title=\"To Top\">\n");
        out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
        out.write("  </a>\n");
        out.write("  <p>Hờ Tờ Mờ Lờ en Cờ Sờ Sờ  Made By<a href=\"https://www.facebook.com/khuongnvd\" title=\"Visit khuongvd\">Khuongnvd</a></p>\n");
        out.write("</footer>\n");
        out.write("        \n");
        out.write("    </body>\n");
        out.write("</html>\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope['userNameAdmin']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                             <a href=\"User_Login.jsp\">Đăng nhập</a>\n");
        out.write("                             ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_redirect_0.setUrl("Admin.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a>Xin chào,");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['userNameAdmin']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty cookie['userAdmin']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<!--                            <h1>LOGIN</h1>\n");
        out.write("\n");
        out.write("                            <form action=\"AdminController\" method=\"POST\">\n");
        out.write("                                <table border=\"0\" cellspacing=\"2\" cellpadding=\"7\">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                        <label>UserName</label>\n");
        out.write("                                        <input type=\"text\" name=\"txtUser\"  placeholder=\" Username\"/>\n");
        out.write("                                    </div>\n");
        out.write("\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("\n");
        out.write("                                        <label>PassWord</label>\n");
        out.write("                                        <input type=\"password\" name=\"txtPass\"  placeholder=\" Password\"/>\n");
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"checkbox\">\n");
        out.write("                                        <label><input type=\"checkbox\" name=\"ckRemember\" value=\"Remember Acc\"/>Remember</label>\n");
        out.write("                                    </div>\n");
        out.write("                                    <input class=\"btn btn-default\" type=\"submit\" value=\"Login\"/>\n");
        out.write("                                    <input class=\"btn btn-default\" type=\"reset\" value=\"Reset\"/>\n");
        out.write("                                </table>\n");
        out.write("                            </form>-->\n");
        out.write("                            \n");
        out.write("                             <h1>LOGIN</h1>\n");
        out.write("                                ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            \n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_h_form_0.setJspId("id137");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                <tbody>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label>User :</label>\n");
        out.write("                                    ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                                <div >\n");
        out.write("                                    <label>Pass :</label>\n");
        out.write("                                    ");
        if (_jspx_meth_h_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    ");
        if (_jspx_meth_h_selectManyCheckbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    <input type=\"checkbox\" name=\"ckRemember\" value=\"Remember Acc\"/>lưu mật khẩu ?</div>\n");
        out.write("                                     \n");
        out.write("                                    ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                \n");
        out.write("                                <button type=\"reset\" class=\"btn btn-default\">Reset</button>\n");
        out.write("                                </tbody>\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id143");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{adminBean.adminID}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_0.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_required_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_required_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_1.setJspId("id149");
    _jspx_th_h_inputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{adminBean.passWord}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_1.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_inputText_1 = _jspx_th_h_inputText_1.doStartTag();
    if (_jspx_th_h_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_required_nobody.reuse(_jspx_th_h_inputText_1);
      return true;
    }
    _jspx_tagPool_h_inputText_value_required_nobody.reuse(_jspx_th_h_inputText_1);
    return false;
  }

  private boolean _jspx_meth_h_selectManyCheckbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectManyCheckbox
    com.sun.faces.taglib.html_basic.SelectManyCheckboxTag _jspx_th_h_selectManyCheckbox_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.SelectManyCheckboxTag.class) : new com.sun.faces.taglib.html_basic.SelectManyCheckboxTag();
    _jspx_th_h_selectManyCheckbox_0.setPageContext(_jspx_page_context);
    _jspx_th_h_selectManyCheckbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_selectManyCheckbox_0.setJspId("id153");
    _jspx_th_h_selectManyCheckbox_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Remember Acc", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_selectManyCheckbox_0 = _jspx_th_h_selectManyCheckbox_0.doStartTag();
    if (_jspx_th_h_selectManyCheckbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_selectManyCheckbox_value_nobody.reuse(_jspx_th_h_selectManyCheckbox_0);
      return true;
    }
    _jspx_tagPool_h_selectManyCheckbox_value_nobody.reuse(_jspx_th_h_selectManyCheckbox_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id157");
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{adminBean.checklogin()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Login", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<!--                            <h1>Login Form !</h1>\n");
        out.write("                            <form action=\"AdminController\" method=\"POST\">\n");
        out.write("                                <table border=\"0\" cellspacing=\"2\" cellpadding=\"7\">\n");
        out.write("\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td>User :</td>\n");
        out.write("                                        <td><input type=\"text\" name=\"txtUser\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['userAdmin'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td>Pass :</td>\n");
        out.write("                                        <td><input type=\"password\"  name=\"txtPass\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['passAdmin'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td></td>\n");
        out.write("                                        <td><input type=\"submit\"  value=\"Login\"/>\n");
        out.write("                                            <input type=\"reset\" value=\"Reset\"/></td>\n");
        out.write("                                        <td><input type=\"checkbox\" name=\"ckRemember\" value=\"Remember Acc\" checked=\"true\"/>lưu mật khẩu ?</td>\n");
        out.write("                                    </tr>\n");
        out.write("                                </table>\n");
        out.write("                            </form>-->\n");
        out.write("\n");
        out.write("                            <h1>LOGIN</h1>\n");
        out.write("\n");
        out.write("                            <form action=\"AdminController\" method=\"POST\">\n");
        out.write("                                <table border=\"0\" cellspacing=\"2\" cellpadding=\"7\">\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                        <label>UserName</label>\n");
        out.write("                                        <input type=\"text\" name=\"txtUser\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['userAdmin'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"form-group\">\n");
        out.write("                                        <label>PassWord</label>\n");
        out.write("                                        <input type=\"password\" name=\"txtPass\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie['passAdmin'].value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"checkbox\">\n");
        out.write("                                        <label><input type=\"checkbox\" name=\"ckRemember\" checked=\"true\" value=\"Remember\"/>Remember</label>\n");
        out.write("                                    </div>\n");
        out.write("                                    <button type=\"submit\" value=\"Login\" class=\"btn btn-default\"\">Login</button>\n");
        out.write("                                    <button type=\"reset\" value=\"Reset\" class=\"btn btn-default\"\">Reset</button>\n");
        out.write("                                        </table>\n");
        out.write("                            </form>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
