/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-02-20 05:12:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.nonmember;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NmemberBuyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/nonmember/../header.jsp", Long.valueOf(1645332829872L));
    _jspx_dependants.put("/nonmember/../footer.jsp", Long.valueOf(1644538274000L));
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStore/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1644538274000L));
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStore/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>BookStore</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/book.css\">\n");
      out.write("<script src=\"script/jquery-3.6.0.js\"></script>\n");
      out.write("<script src=\"script/main.js\"></script>\n");
      out.write("<script src=\"member/member.js\"></script>\n");
      out.write("<script src=\"mypage/mypage.js\"></script>\n");
      out.write("<script src=\"nonmember/nmember.js\"></script>\n");
      out.write("<script src=\"product/product.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("	<header>\n");
      out.write("		<div>\n");
      out.write("			<nav id=\"top_menu\">\n");
      out.write("				<ul>\n");
      out.write("					<li><a href=\"bs.do?cmd=qnaList\" style=\"border:0px;\">고객센터</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=orderAll\" style=\"width:80px;\">주문/배송조회</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=cartList\">장바구니</a></li>\n");
      out.write("					");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("					<li><a href=\"bs.do?cmd=mypage\">마이페이지</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</nav>\n");
      out.write("		</div>\n");
      out.write("		<br><br>\n");
      out.write("		\n");
      out.write("		<!-- 검색창 -->\n");
      out.write("		<div id=\"top\">\n");
      out.write("			<div id=\"logo\">\n");
      out.write("				<a href=\"bs.do?cmd=index\"><img alt=\"\" src=\"images/main/logo.png\" style=\"width:248px; height:100%;\"></a>\n");
      out.write("			</div>\n");
      out.write("			<div id=\"search\">\n");
      out.write("			    <div class=\"day_box\">\n");
      out.write("					<select id=\"day_font\">\n");
      out.write("					   <option>통합검색</option>\n");
      out.write("					   <option>국내도서</option>\n");
      out.write("					   <option>외국도서</option>\n");
      out.write("					   <option>리뷰</option>\n");
      out.write("					</select>\n");
      out.write("					<input type=\"text\" id=\"searchbox\" placeholder=\"검색어입력\"/>\n");
      out.write("					<input type=\"button\" id=\"button1\" onClick=\"\"/>\n");
      out.write("				</div>	\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<br><br>\n");
      out.write("		<br><br>\n");
      out.write("		\n");
      out.write("		<div id=\"main_menu\">\n");
      out.write("			<nav id=\"index_menu\">\n");
      out.write("				<ul class=\"menu\">\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=1\">베스트도서</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=2\">신간도서</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=3\">국내도서</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=4\">외국도서</a></li>\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=5\">이벤트</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</nav>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- </div> -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<form method=\"post\" name=\"joinForm\" style=\"text-align:center;\">\r\n");
      out.write("\r\n");
      out.write("	<div id=joinLabel><h2>상품 구매</h2></div>\r\n");
      out.write("	<br>\r\n");
      out.write("	<div id=\"joinBox\"><!-- css 재활용 -->\r\n");
      out.write("	<strong id=\"agree\">구매 도서</strong>\r\n");
      out.write("	<div style=\"widht:800px; height:5px; background:#7EC4EB;\"></div>\r\n");
      out.write("	\r\n");
      out.write("	<div><!-- 구매하고자 하는 책의 내용이 담긴 div -->\r\n");
      out.write("		<table class=\"nbuyform\" width=\"650\" cellspacing=\"1\" border=\"1\" >\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"150\" rowspan=\"4\">\r\n");
      out.write("					<div>\r\n");
      out.write("						<img alt=\"\" src=\"images/book/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productVO.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"max-width:100%; padding:0px;\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td style=\"width:484px; border:none;\">\r\n");
      out.write("					도서명 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productVO.bname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td style=\"border-right:none;\">\r\n");
      out.write("					수량 : <input type=\"number\" min=\"1\" max=\"99\" id=\"quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"width:40px; height:20px;\" maxlength=\"2\"/>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td style=\"border:none;\">\r\n");
      out.write("					가격 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productVO.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<br>\r\n");
      out.write("	\r\n");
      out.write("		<strong id=\"agree\">비회원 구매 기본 정보 입력</strong>\r\n");
      out.write("	<div style=\"widht:800px; height:5px; background:#7EC4EB;\"></div>\r\n");
      out.write("	<div id=\"joinInfo\">\r\n");
      out.write("		<div class=\"warning\" style=\"height:65px;\">\r\n");
      out.write("			모든 항목은 필수 입력 사항입니다.<br>\r\n");
      out.write("			미입력시 상품 주문이 불가능합니다.<br>\r\n");
      out.write("			입력하신 정보는 차후 주문확인을 위해 필요하오니 반드시 정확한 정보를 기재해주세요.\r\n");
      out.write("		</div>\r\n");
      out.write("		<table class=\"mInfo\" width=\"650\" cellspacing=\"1\" border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"120\">이름 *</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"120\">전화번호 *</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"phone\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"120\">주소 *</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"zip_num\" size=\"10\">&nbsp;&nbsp;\r\n");
      out.write("				<input type=\"button\" value=\"주소 찾기\" class=\"dup\" onclick=\"post_zip()\" style=\"border:1px solid #C6C6C6; border-radius:5px;\"><br>\r\n");
      out.write("				<input type=\"text\" name=\"addr1\" size=\"50\" style=\"margin-top:2px;\"><br><input type=\"text\" name=\"addr2\" size=\"25\" style=\"margin-top:2px;\"><br>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"120\">이메일 *</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"email\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"buttons\">\r\n");
      out.write("		<input type=\"button\" value=\"구매하기\" class=\"submit\" onclick=\"nbuy_check(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productVO.bseq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(");\" style=\"border:1px solid #C6C6C6; margin-top:10px; width:150px; height:25px; border-radius:5px; border-radius:5px;\">\r\n");
      out.write("		<input type=\"button\" value=\"취소\" onClick=\"nbuy_return();\" style=\" border:1px solid #C6C6C6; margin-top:10px; width:150px; height:25px; border-radius:5px; border-radius:5px;\">\r\n");
      out.write("		<!-- 구매하기, 취소 버튼 선택시 확인용 alert 한번 띄워주자. -->\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("	<footer>\n");
      out.write("		<hr>\n");
      out.write("		<div id=\"footerlogo\">\n");
      out.write("			<a href=\"bs.do?cmd=index\"><img alt=\"\" src=\"images/footer/logo.png\" style=\"width:105px; height:80px;\"></a>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"copy\">\n");
      out.write("			회사명 : (주)청년문고 | 대표이사 : ㅁㅁㅁ <br>\n");
      out.write("			소재지 : 서울시 서대문구 신촌로 141 <br>\n");
      out.write("			사업자 등록번호 : 000-00-00000 | 통신판매업 신고번호 : 2022-서울신촌-00000 [사업자정보확인] <br>\n");
      out.write("			개인정보관리 책임자 : ㅁㅁㅁ | E-mail : asdf@naver.com | 대량주문 : 02-000-0000 <br>\n");
      out.write("			COPYRIGHT@CHEONGNYEONBOOKSTORE INC.ALLRIGHTS RESERVED. <br>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"serviceimg\">\n");
      out.write("			<img alt=\"\" src=\"images/footer/customer_servicecenter.jpg\"style=\"width:180px; height:80px;\">\n");
      out.write("		</div>\n");
      out.write("	</footer>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
          out.write("\n");
          out.write("						");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("						");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
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
      // /nonmember/../header.jsp(30,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("							<li><a href=\"bs.do?cmd=contract\">회원가입</a></li>\n");
          out.write("							<li><a href=\"bs.do?cmd=loginForm\">로그인</a></li>\n");
          out.write("							<input type=\"hidden\" id=\"checking\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\n");
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
          out.write("\n");
          out.write("							<li><a href=\"bs.do?cmd=editForm\">정보수정</a></li>\n");
          out.write("							<li> &nbsp; ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(") </li> \n");
          out.write("							<li><a href=\"bs.do?cmd=logout\">로그아웃</a></li>\n");
          out.write("							<input type=\"hidden\" id=\"checking\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\n");
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