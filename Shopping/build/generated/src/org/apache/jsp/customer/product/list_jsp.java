package org.apache.jsp.customer.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DAO.TypeDAO;
import model.DAO.SupplierDAO;
import java.sql.ResultSet;
import model.DAO.BrandDao;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_sql_dataSource.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("                integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n");
      out.write("                integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"\r\n");
      out.write("                integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <title>Clothing </title>\r\n");
      out.write("        <style>\r\n");
      out.write("            @import url('https://fonts.google.com/specimen/Balsamiq+Sans');\r\n");
      out.write("            html ,body {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                font-family: 'Balsamiq Sans';   \r\n");
      out.write("                font-size: 17px;\r\n");
      out.write("                color: #222;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar{\r\n");
      out.write("                background-color: #F5A9BC !important;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar li a {\r\n");
      out.write("                color: #f8f2f2!important ;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .navbar li a:hover {\r\n");
      out.write("                color: #000000 !important ;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .container-fluid\r\n");
      out.write("            {\r\n");
      out.write("                padding-top: 4em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .overlay {\r\n");
      out.write("                position: absolute; \r\n");
      out.write("                bottom: 0; \r\n");
      out.write("                background: rgb(0, 0, 0);\r\n");
      out.write("                background: rgba(0, 0, 0, 0.5); /* Black see-through */\r\n");
      out.write("                color: #f1f1f1; \r\n");
      out.write("                width: 100%;\r\n");
      out.write("                transition: .5s ease;\r\n");
      out.write("                opacity:0;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .container-fluid:hover .overlay {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("            .nav-item{\r\n");
      out.write("                padding-right: 20px;\r\n");
      out.write("                font-size: 25px;\r\n");
      out.write("            }\r\n");
      out.write("            .fotter{\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("            img {\r\n");
      out.write("                transition: all 1s ease;\r\n");
      out.write("                -webkit-transition: all 1s ease;\r\n");
      out.write("                -moz-transition: all 1s ease;\r\n");
      out.write("                -o-transition: all 1s ease;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            img:hover {\r\n");
      out.write("                transform: scale(1.2,1.2);\r\n");
      out.write("                -webkit-transform: scale(1.2,1.2);\r\n");
      out.write("                -moz-transform: scale(1.2,1.2);\r\n");
      out.write("                -o-transform: scale(1.2,1,2);\r\n");
      out.write("                -ms-transform: scale(1.2,1.2);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style> \r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        boolean isLogin = false;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("idCustomer") && !cookie.getValue().equals("0")) {
                isLogin = true;
            }
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../header/header.jsp", out, false);
      out.write("\r\n");
      out.write("            <nav class=\" navbar navbar-expand-md navbar-light bg-light sticky-top\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"navbar-branch\" href=\"../../index.jsp\">\r\n");
      out.write("                    <img src=\"./images/logo.jpg\" height=\"80px\" alt=\"\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\" style=\"padding-left: 600px\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"../../index.jsp\" class=\"nav-link \">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a href=\"./list.jsp\" class=\"nav-link \">Products</a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"../../auth/about.jsp\" class=\"nav-link\">About us</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"../../auth/contact.jsp\" class=\"nav-link\">Contact</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"cart.jsp\" class=\"nav-link\">Cart</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow  \">\r\n");
      out.write("                            <a style=\"color: black;position:relative; top: -20px;\" class=\"nav-link dropdown-toggle \" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                               >\r\n");
      out.write("                                <h3><i style=\"color: black;position:relative; top: -1px;\" class=\"fas fa-user-circle fa-fw\"></i></h3>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu- bg-dark text-white \"  >\r\n");
      out.write("                                <!--<a class=\"dropdown-item\" href=\"#\">Logout</a>-->\r\n");
      out.write("\r\n");
      out.write("                            ");

                                if (cookies.length > 1) {
                                    for (Cookie cookie : cookies) {
                                        if (cookie.getName().equals("user")) {
                                            out.print("<a class='nav-link dropdown-item bg-dark' style='color: white; font-size:20px;' href='../../customer/Information.jsp'>" + cookie.getValue() + "</a>");
                                            out.print("<a class='nav-link dropdown-item bg-dark' style='color: white; font-size:20px;' href='../../LogoutController'>Logout</a>");
                                        } else if (cookie.getName().equals("admin")) {
                                            RequestDispatcher disp = request.getRequestDispatcher("admin/dashboard.jsp");
                                            disp.forward(request, response);
                                        }
                                    }
                                } else {
                                    out.print("<a class='nav-link' style='color: black' href='../../auth/login.jsp'>Login</a>");
                                    out.print("<a class='nav-link' style='color: black' href='../../auth/signin.jsp'>Sigin</a>");
                                }
                            
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
if (request.getParameter("type") != null && request.getParameter("value") != null) {
                String sql = " select * from products where status= ?";
                String type = request.getParameter("type");

                if (type.equals("gender")) {
                    String value = request.getParameter("value");
                    sql = "select * from products where gender=? AND status = 1";
                } else {
                    int value = Integer.parseInt(request.getParameter("value"));
                    if (type.equals("type")) {
                        sql = "select * from products where tID=? AND status = 1";
                    } else if (type.equals("brand")) {
                        sql = "select * from products where brID=? AND status = 1";
                    } else if (type.equals("supplier")) {
                        sql = "select * from products where supID=? AND status = 1";
                    } else if (type.equals("size")) {
                        sql = "select * from products where size=? AND status = 1";
                    }
                }

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      //  sql:query
      org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
      _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
      _jspx_th_sql_query_0.setParent(null);
      _jspx_th_sql_query_0.setVar("p");
      _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sql_query_0.setSql(sql);
      int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_push_body_count_sql_query_0[0]++;
            _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_sql_query_0.doInitBody();
          }
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("            ");
            if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_0, _jspx_page_context, _jspx_push_body_count_sql_query_0))
              return;
            out.write("\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_sql_query_0[0]--;
        }
        if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_query_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_query_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_query_0.doFinally();
        _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_0);
      }
      out.write("\t\r\n");
      out.write("        ");
} else {
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\" row container\">\r\n");
      out.write("            <div class=\"col col-sm-6 col-md-2\">\r\n");
      out.write("                <button class=\"btn btn-light btn-lg\" type=\"button\"><a href=\"list.jsp\">All Products</a></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col dropright col-sm-6 col-md-3 \">\r\n");
      out.write("                <button class=\"btn  dropdown-toggle btn-light btn-lg\" type=\"button\" data-toggle=\"dropdown\">Filter by\r\n");
      out.write("\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li class=\"dropdown-submenu\">\r\n");
      out.write("                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Type<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            ");

                                TypeDAO tDao = new TypeDAO();
                                ResultSet allType = tDao.getAll();
                                while (allType.next()) {
                                    out.println("  <li><a tabindex='-1' href='list.jsp?type=type&value=" + allType.getString(1) + "'> " + allType.getString(2) + "</a></li>");
                                }
                            
      out.write("\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown-submenu\">\r\n");
      out.write("                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Brand<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropright \">\r\n");
      out.write("                            ");

                                BrandDao brDao = new BrandDao();
                                ResultSet allBrand = brDao.getAll();
                                while (allBrand.next()) {
                                    out.println("  <li><a tabindex='-1' href='list.jsp?type=brand&value=" + allBrand.getString(1) + "'> " + allBrand.getString(2) + "</a></li>");
                                }
                            
      out.write("\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown-submenu\">\r\n");
      out.write("                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Supplier<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            ");

                                SupplierDAO supDao = new SupplierDAO();
                                ResultSet allSup = supDao.getAll();
                                while (allSup.next()) {
                                    out.println("  <li><a tabindex='-1' href='list.jsp?type=supppier&value=" + allSup.getString(1) + "'> " + allSup.getString(2) + "</a></li>");
                                }
                            
      out.write("\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown-submenu\">\r\n");
      out.write("                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Size<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            ");

                                out.println("<li><a tabindex='-1' href='?type=size&value=0'>S</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=size&value=1'>M</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=size&value=2'>L</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=size&value=3'>XL</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=size&value=4'>XXL</a></li>");
                            
      out.write("\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown-submenu\">\r\n");
      out.write("                        <a class=\"test\" tabindex=\"-1\" href=\"#\">Gender<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            ");

                                out.println("<li><a tabindex='-1' href='?type=gender&value=Male'>Male</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=gender&value=Female'>Female</a></li>");
                                out.println("<li><a tabindex='-1' href='?type=gender&value=Unisex'>Unisex</a></li>");
                            
      out.write("\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid mt-0\">\r\n");
      out.write("            <div class=\"row text-center padding\">   \r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('.dropdown-submenu a.test').on(\"click\", function (e) {\r\n");
      out.write("                $(this).next('ul').toggle();\r\n");
      out.write("                e.stopPropagation();\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("conn");
    _jspx_th_sql_setDataSource_0.setScope("session");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/prj321");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_0);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setVar("p");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            select * from products where status = 1\r\n");
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_2.setVar("i");
    _jspx_th_sql_query_2.setSql("select * from image where pID=?");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\t\t\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_2, _jspx_page_context, _jspx_push_body_count_sql_query_2))
            return true;
          out.write("\t\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_2);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\r\n");
          out.write("                    ");
          if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("                    <div class=\"col-xs-12 col-sm-6 col-md-3 boder bg-light \">\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <div >\r\n");
          out.write("                                <p class=\"text text-primary\" style=\"font-size: 23px; font: bold\">\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \r\n");
          out.write("                                </p>                   \r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div>\r\n");
          out.write("                                Price:   ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                            </div>    \r\n");
          out.write("                        </div>\r\n");
          out.write("                        ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"overlay\">\r\n");
          out.write("                            <a href=\"./../../CartController?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&quantity=1\" class=\"btn btn-info btn-lg\">\r\n");
          out.write("\r\n");
          out.write("                                <span class=\"glyphicon glyphicon-shopping-cart\"></span> Shopping Cart\r\n");
          out.write("                            </a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>  \r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_3.setVar("i");
    _jspx_th_sql_query_3.setSql("select * from image where pID=?");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_sql_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_3, _jspx_page_context, _jspx_push_body_count_sql_query_3))
            return true;
          out.write("\t\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_3);
    _jspx_th_sql_param_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_2 = _jspx_th_sql_param_2.doStartTag();
    if (_jspx_th_sql_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("img");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(0);
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <a  href=\"productDetail.jsp?pID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\r\n");
          out.write("                                <img src=\"../../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.imageName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"90%\" width=\"90%\" alt=\"Error\"/>\t\r\n");
          out.write("\r\n");
          out.write("                            </a>\r\n");
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
