/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-02-24 06:38:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class withdrawal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/mypage/../footer.jsp", Long.valueOf(1645668624375L));
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SmallProject_final/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1644538274000L));
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SmallProject_final/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/mypage/../header.jsp", Long.valueOf(1645598398000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>BookStore</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/book.css\">\r\n");
      out.write("<script src=\"script/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script src=\"script/main.js\"></script>\r\n");
      out.write("<script src=\"script/member.js\"></script>\r\n");
      out.write("<script src=\"script/nmember.js\"></script>\r\n");
      out.write("<script src=\"script/product.js\"></script>\r\n");
      out.write("<script src=\"script/mypage.js\"></script>\r\n");
      out.write("<script src=\"script/order.js\"></script>\r\n");
      out.write("<!--  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("	<header>\r\n");
      out.write("		<div>\r\n");
      out.write("			<nav id=\"top_menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><input type=\"hidden\" id=\"checking\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=noticeList&z=noticeList\" style=\"border:0px;\">고객센터</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=orderList\" style=\"width:80px;\">주문/배송조회</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=cartList\">장바구니</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=mypage\">마이페이지</a></li>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br><br>\r\n");
      out.write("		\r\n");
      out.write("		<!-- 검색창 -->\r\n");
      out.write("		<div id=\"top\">\r\n");
      out.write("			<div id=\"logo\">\r\n");
      out.write("				<a href=\"bs.do?cmd=index\"><img alt=\"\" src=\"images/main/logo.png\" style=\"width:248px; height:100%;\"></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"search\">\r\n");
      out.write("			    <div class=\"day_box\">\r\n");
      out.write("					<select id=\"day_font\">\r\n");
      out.write("					   <option>통합검색</option>\r\n");
      out.write("					   <option>국내도서</option>\r\n");
      out.write("					   <option>외국도서</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					<input type=\"text\" id=\"searchbox\" placeholder=\"검색어입력\"/>\r\n");
      out.write("					<input type=\"button\" id=\"button1\" onClick=\"searching()\"/>\r\n");
      out.write("				</div>	\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br><br>\r\n");
      out.write("		<br><br>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"main_menu\">\r\n");
      out.write("			<nav id=\"index_menu\">\r\n");
      out.write("				<ul class=\"menu\">\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=1\">베스트도서</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=2\">신간도서</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=l&sub=y\">국내도서</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=g&sub=y\">외국도서</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=5\">이벤트</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- </div> -->");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<form style=\"text-align:center;\">\r\n");
      out.write("<div id=joinLabel><h2>회원 탈퇴 완료</h2></div>\r\n");
      out.write("<br>\r\n");
      out.write("<div style=\"width:970px; text-align:center;\">\r\n");
      out.write("	<div id=\"joinBox\" style=\"height:300px;\">\r\n");
      out.write("		<div id=\"joinInfoFlex\" style=\"height:200px;\">\r\n");
      out.write("			<strong style=\"font-size:23px;\">\r\n");
      out.write("				그동안 청년문고 서비스를 이용해주셔서 감사합니다.<br>\r\n");
      out.write("				보다 나은 서비스로 다시 찾아 뵙겠습니다.\r\n");
      out.write("			</strong>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<input type=\"button\" class=\"withdrawalbtn\" value=\"청년문고 첫화면\" onclick=\"location.href='bs.do?cmd=index'\">\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("	<footer>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div id=\"footerlogo\">\r\n");
      out.write("			<a href=\"bs.do?cmd=index\"><img alt=\"\" src=\"images/footer/logo.png\" style=\"width:105px; height:80px;\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"copy\">\r\n");
      out.write("			회사명 : (주)청년문고 | 대표이사 : ㅁㅁㅁ <br>\r\n");
      out.write("			소재지 : 서울시 서대문구 신촌로 141 <br>\r\n");
      out.write("			사업자 등록번호 : 000-00-00000 | 통신판매업 신고번호 : 2022-서울신촌-00000 [사업자정보확인] <br>\r\n");
      out.write("			개인정보관리 책임자 : ㅁㅁㅁ | E-mail : asdf@naver.com | 대량주문 : 02-000-0000 <br>\r\n");
      out.write("			COPYRIGHT@CHEONGNYEONBOOKSTORE INC.ALLRIGHTS RESERVED. <br>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"serviceimg\">\r\n");
      out.write("			<img alt=\"\" src=\"images/footer/customer_servicecenter.png\"style=\"width:180px; height:80px;\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /mypage/../header.jsp(33,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<li><a href=\"bs.do?cmd=contract\">회원가입</a></li>\r\n");
          out.write("							<li><a href=\"bs.do?cmd=loginForm\">로그인</a></li>\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<li><a href=\"bs.do?cmd=logout\">LOGOUT</a></li>\r\n");
          out.write("							<li><a href=\"bs.do?cmd=editForm\">정보수정</a></li>\r\n");
          out.write("							<li><a href=\"#\" style=\"text-decoration:none; width:120px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(")</a></li>\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
