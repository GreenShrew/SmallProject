/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-02-10 04:11:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStore/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1644412687300L));
    _jspx_dependants.put("/member/../header.jsp", Long.valueOf(1644466257874L));
    _jspx_dependants.put("jar:file:/C:/Users/Onion/Desktop/TIL/SmallProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStore/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/member/../footer.jsp", Long.valueOf(1644399964000L));
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
  }

  public void _jspDestroy() {
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
      out.write("<script src=\"member/member.js\"></script>\r\n");
      out.write("<script src=\"mypage/mypage.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("	<header>\r\n");
      out.write("		<div>\r\n");
      out.write("			<nav id=\"top_menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=qna\" style=\"border:0px;\">고객센터</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=orderView\" style=\"width:80px;\">주문/배송조회</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=cart\">장바구니</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=contract\">회원가입</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=loginForm\">로그인</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=mypage\">마이페이지</a></li>\r\n");
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
      out.write("					   <option>리뷰</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					<input type=\"text\" id=\"searchbox\" placeholder=\"검색어입력\"/>\r\n");
      out.write("					<input type=\"button\" id=\"button1\" onClick=\"\"/>\r\n");
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
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=3\">국내도서</a></li>\r\n");
      out.write("					<li><a href=\"bs.do?cmd=menu&kind=4\">외국도서</a></li>\r\n");
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
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("<h2>회원 가입 약관</h2>\r\n");
      out.write("<form id=\"join\" method=\"post\" name=\"contractFrm\">\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<textarea rows=\"15\" cols=\"100\">\r\n");
      out.write("제 1 장 총 칙\r\n");
      out.write("\r\n");
      out.write("제 1 조 (목적)\r\n");
      out.write("\r\n");
      out.write("이 이용약관(이하 '약관')은 주식회사 Shoew Shop(이하 회사라 합니다)와 이용 고객(이하 '회원')간에 회사가 제공하는 shoesshop.com서비스의 가입조건 및 이용에 관한 다음의 제반 사항과 기타 기본적인 사항을 구체적으로 규정함을 목적으로 합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 2 조 (이용약관의 효력 및 변경)\r\n");
      out.write("\r\n");
      out.write("(1) 이 약관은 Shoew Shop 웹사이트(이하 'Shoew Shop 웹')에서 온라인으로 공시함으로써 효력을 발생하며, 합리적인 사유가 발생할 경우 관련법령에 위배되지 않는 범위 안에서 개정될 수 있습니다. 개정된 약관은 온라인에서 공지함으로써 효력을 발휘하며, 이용자의 권리 또는 의무 등 중요한 규정의 개정은 사전에 공지합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 합리적인 사유가 발생될 경우에는 이 약관을 변경할 수 있으며, 약관을 변경할 경우에는 지체 없이 이를 사전에 공시합니다.\r\n");
      out.write("\r\n");
      out.write("(3) 이용고객은 변경된 약관에 동의하지 않으면, 언제나 \"서비스\" 이용을 중단하고, 이용계약을 해지할 수 있습니다. 약관의 효력발생일 이후의 계속적인 \"서비스\" 이용은 약관의 변경사항에 대한 이용고객의 동의로 간주됩니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 3 조 (약관외 준칙)\r\n");
      out.write("\r\n");
      out.write("(1) 이 약관은 회사가 제공하는 개별서비스에 관한 이용안내(이하 서비스별 안내라 합니다)와 함께 적용합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 이 약관에 명시되지 아니한 사항에 대해서는 별도의 세부 약관, 상관행, 회사의 공지, 이용안내, 관계법령 및 서비스별 안내의 취지에 따라 적용할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 4 조 (용어의 정의)\r\n");
      out.write("\r\n");
      out.write("(1) \"이용자\" 또는”회원”이란 \"Shoew Shop\"에 접속하여 본 약관에 따라 \"Shoew Shop\"에 가입하여, 이용 고객의 식별과 이용고객의 서비스 이용을 위하여 이용고객 본인이 직접 선정하고 회사가 부여하는 문자와 숫자 조합인 ‘이용자번호(ID)’와 그에 따라 일치된 이용고객임을 확인하기 위하여 이용고객 본인이 선정한 ‘비밀번호’를 이용하여 \"Shoew Shop\"이 제공하는 서비스를 받는 자를 말합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 이 약관에서 사용하는 용어의 정의는 제1항에서 정하는 것을 제외하고는 관계법령 및 서비스별 안내에서 정하는 바에 의합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 2 장 이용계약 체결\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 5 조 (이용 계약의 성립)\r\n");
      out.write("\r\n");
      out.write("(1) 이용계약은 이용고객의 본 이용약관 내용에 대한 동의와 이용신청에 대하여 회사의 이용승낙으로 성립하여 이용약관에 대한 동의는 이용신청 당시 해당 Shoew Shop 웹의 '동의함' 버튼을 누름으로써 의사표시를 합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 6 조 (서비스 이용 신청)\r\n");
      out.write("\r\n");
      out.write("(1) 회원으로 가입하여 본 서비스를 이용하고자 하는 이용고객은 회사에서 요청하는 제반 정보(이름, 주민등록번호, 연락처 등)를 제공하여야 합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 모든 회원은 반드시 회원 본인의 이름과 주민등록번호를 제공하여야만 서비스를 이용할 수 있으며, 실명으로 등록을 한 사용자만이 권리를 주장할 수 없습니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회원가입은 반드시 실명으로만 가입할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(4) 타인의 명의(이름 및 주민등록번호)를 도용하여 이용신청을 한 회원의 모든 ID는 삭제되며, 관계법령에 따라 처벌을 받을 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(5) 회사는 본 서비스를 이용하는 회원에 대하여 등급별로 구분하여 이용시간, 이용회수, 서비스 메뉴 등을 세분하여 이용에 차등을 둘 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 7 조 (이용자의 개인 정보 보호)\r\n");
      out.write("\r\n");
      out.write("회사는 관련법령이 정하는 바에 따라서 이용자 등록정보를 포함한 이용자의 개인정보를 보호하기 위하여 노력합니다. 이용자의 개인정보보호에 관해서는 관련법령 및 \"Shoew Shop\"이 정하는 \"개인정보보호정책\"에 정한 바에 의합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 8 조 (이용 신청의 승낙과 제한)\r\n");
      out.write("\r\n");
      out.write("(1) 이용자가 되고자 하는 자는 회사가 정한 가입 양식에 따라 회원정보를 기입하고 \"등록하기\" 단추를 누르는 방법으로 회원 가입을 신청합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 아래사항에 해당하는 경우에 대해서 승낙하지 아니 합니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 가입신청자가 본 약관 의거하여 이전에 회원자격을 상실한 적이 있는 경우. 상실 후 1개월 경과 하지 않은 자로서 \"Shoew Shop\"의 회원재가입 승낙을 얻으려 하는 경우\r\n");
      out.write("\r\n");
      out.write("ㄴ. 등록 내용에 허위, 기재누락, 오기가 있는 경우\r\n");
      out.write("\r\n");
      out.write("ㄷ. 사회의 안녕과 질서, 미풍양속을 저해할 목적으로 신청한 경우\r\n");
      out.write("\r\n");
      out.write("ㄹ. 부정한 용도로 본 서비스를 이용하고자 하는 경우\r\n");
      out.write("\r\n");
      out.write("ㅁ. Shoew Shop의 정책과 위배 되어지는 행위를 반복적으로 자행하여 회원 자격 상실을 한 적이 있는 경우\r\n");
      out.write("\r\n");
      out.write("ㅂ. 본 서비스와 경쟁관계에 있는 이용자가 신청하는 경우\r\n");
      out.write("\r\n");
      out.write("(3) 서비스 이용신청이 다음 각 호에 해당하는 경우에는 회사는 그 신청에 대하여 승낙 제한사유가 해소될 때까지 승낙을 유보할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 설비의 여유가 없는 경우\r\n");
      out.write("\r\n");
      out.write("ㄴ. 기술상 지장이 있는 경우\r\n");
      out.write("\r\n");
      out.write("ㄷ. 기타 귀책사유로 이용승낙이 곤란한 경우\r\n");
      out.write("\r\n");
      out.write("(4) 이용신청고객이 관계법령에서 규정하는 미성년자일 경우에 회사는 서비스 별 안내에서 정하는 바에 따라 승낙을 보류할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 9 조 (이용자ID 부여 및 변경 등)\r\n");
      out.write("\r\n");
      out.write("(1) 이용고객에 대하여 약관에 정하는 바에 따라 회사는 이용자 ID를 부여합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 이용자ID는 원칙적으로 변경이 불가하며 부득이한 사유로 인하여 변경 하고자 하는 경우에는 해당 ID를 해지하고 재가입해야 합니다.\r\n");
      out.write("\r\n");
      out.write("(3) ‘Shoew Shop’의 이용자ID는 이용자 본인의 동의하에 ‘Shoew Shop’ 가 운영하는 자사 사이트의 회원ID와 연결될 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(4) 이용자ID는 다음 각 호에 해당하는 경우에는 이용고객 또는 회사의 요청으로 변경할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 이용자ID가 이용자의 전화번호 또는 주민등록번호 등으로 등록되어 사생활침해가 우려되는 경우\r\n");
      out.write("\r\n");
      out.write("ㄴ. 타인에게 혐오감을 주거나 미풍양속에 어긋나는 경우\r\n");
      out.write("\r\n");
      out.write("ㄷ. 기타 합리적인 사유가 있는 경우\r\n");
      out.write("\r\n");
      out.write("(5) 서비스 이용자ID 및 비밀번호의 관리책임은 이용자에게 있습니다. 이를 소홀이 관리하여 발생하는 서비스 이용상의 손해 또는 제3자에 의한 부정이용 등에 대한 책임은 이용자에게 있으며 회사는 그에 대한 책임을 일절 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(6) 기타 이용자 개인정보 관리 및 변경 등에 관한 사항은 서비스 별 안내에 정하는 바에 의합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 3 장 계약 당사자의 의무\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 10 조 (회사의 의무)\r\n");
      out.write("\r\n");
      out.write("(1) 회사는 법령과 본 약관이 금지하거나 公序良俗 (공서양속)에 반하는 행위를 하지 않으며 본 약관이 정하는 바에 따라 지속적이고, 안정적으로 서비스를 제공하기 위해서 노력합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 이용자가 안전하게 인터넷 서비스를 이용할 수 있도록 이용자의 개인정보(신용정보 포함)보호를 위한 보안 시스템을 구축합니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회사는 이용고객으로부터 제기되는 의견이나 불만이 정당하다고 객관적으로 인정될 경우에는 적절한 절차를 거쳐 즉시 처리하여야 합니다. 다만, 즉시 처리가 곤란한 경우는 이용자에게 그 사유와 처리일정을 통보하여야 합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 11 조 (이용자의 의무)\r\n");
      out.write("\r\n");
      out.write("(1) 이용자는 회원가입 신청 또는 회원정보 변경 시 실명으로 모든 사항을 사실에 근거하여 작성하여야 하며, 허위 또는 타인의 정보를 등록할 경우 일체의 권리를 주장할 수 없습니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회원은 본 약관에서 규정하는 사항과 기타 회사가 정한 제반 규정, 공지사항 등 회사가 공지하는 사항 및 관계법령을 준수하여야 하며, 기타 회사의 업무에 방해가 되는 행위, 회사의 명예를 손상시키는 행위를 해서는 안됩니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회원은 주소, 연락처, 전자우편 주소 등 이용계약사항이 변경된 경우에 해당 절차를 거쳐 이를 회사에 즉시 알려야 합니다.\r\n");
      out.write("\r\n");
      out.write("(4) 회사가 관계법령 및 '개인정보 보호정책'에 의거하여 그 책임을 지는 경우를 제외하고 회원에게 부여된 ID의 비밀번호 관리소홀, 부정사용에 의하여 발생하는 모든 결과에 대한 책임은 회원에게 있습니다.\r\n");
      out.write("\r\n");
      out.write("(5) 회원은 회사의 사전 승낙 없이 서비스를 이용하여 영업활동을 할 수 없으며, 그 영업활동의 결과에 대해 회사는 책임을 지지 않습니다. 또한 회원은 이와 같은 영업활동으로 회사가 손해를 입은 경우, 회원은 회사에 대해 손해배상의무를 지며, 회사는 해당 회원에 대해 서비스 이용제한 및 적법한 절차를 거쳐 손해배상 등을 청구할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(6) 회원은 회사의 명시적 동의가 없는 한 서비스의 이용권한, 기타 이용계약상의 지위를 타인에게 양도, 증여할 수 없으며 이를 담보로 제공할 수 없습니다.\r\n");
      out.write("\r\n");
      out.write("(7) 회원은 회사 및 제 3자의 지적 재산권을 침해해서는 안됩니다.\r\n");
      out.write("\r\n");
      out.write("(8) 회원은 다음 각 호에 해당하는 행위를 하여서는 안되며, 해당 행위를 하는 경우에 회사는 회원의 서비스 이용제한 및 적법 조치를 포함한 제재를 가할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 직원이나 서비스의 관리자를 가장하거나 사칭하여 또는 타인의 명의를 도용하여 글을 게시 하거나 메일을 발송하는 행위\r\n");
      out.write("\r\n");
      out.write("ㄴ. 회원가입 신청 또는 회원정보 변경 시 허위내용을 등록하는 행위\r\n");
      out.write("\r\n");
      out.write("ㄷ. 다른 이용자의 ID, 비밀번호, 주민등록번호를 도용하는 행위\r\n");
      out.write("\r\n");
      out.write("ㄹ. 이용자 ID를 타인과 거래하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅁ. 회사의 운영진, 직원 또는 관계자를 사칭하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅂ. 회사로부터 특별한 권리를 부여 받지 않고 회사의 클라이언트 프로그램을 변경하거나, 회사의 서버를 해킹하거나, 웹사이트 또는 게시된 정보의 일부분 또는 전체를 임의로 변경하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅅ. 서비스에 위해를 가하거나 고의로 방해하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅇ. 본 서비스를 통해 얻은 정보를 회사의 사전 승낙 없이 서비스 이용 외의 목적으로 복제하거나, 이를 출판 및 방송 등에 사용하거나, 제 3 자에게 제공하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅈ. 관련 법령에 의하여 그 전송 또는 게시가 금지되는 정보(컴퓨터 프로그램 등)의 전송 또는 게시하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅊ. 공공질서 및 미풍양속에 위반되는 저속, 음란한 내용의 정보, 문장, 도형, 음향, 동영상을 전송, 게시, 전자우편 또는 기타의 방법으로 타인에게 유포하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅋ. 모욕적이거나 개인신상에 대한 내용이어서 타인의 명예나 프라이버시를 침해할 수 있는 내용을 전송, 게시, 쪽지 또는 기타의 방법으로 타인에게 유포하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅌ. 다른 이용자를 희롱 또는 위협하거나, 특정 이용자에게 지속적으로 고통 또는 불편을 주는 행위\r\n");
      out.write("\r\n");
      out.write("ㅍ. 회사의 승인을 받지 않고 다른 사용자의 개인정보를 수집 또는 저장하는 행위\r\n");
      out.write("\r\n");
      out.write("ㅎ. 범죄와 결부된다고 객관적으로 판단되는 행위 본 약관을 포함하여 기타 회사가 정한 제반 규정 또는 이용 조건을 위반하는 및 기타 관계법령에 위 배되는 행위 행위 등\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 4 장 서비스의 이용\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 12 조 (서비스 이용 시간)\r\n");
      out.write("\r\n");
      out.write("(1) 서비스 이용은 회사의 업무상 또는 기술상 특별한 지장이 없는 한 연중무휴, 1일 24시간 운영을 원칙으로 합니다. 단, 회사는 시스템 정기점검, 증설 및 교체를 위해 회사가 정한 날이나 시간에 서비스를 일시 중단할 수 있으며, 예정되어 있는 작업으로 인한 서비스 일시 중단은 Shoew Shop 웹을 통해 사전에 공지합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 긴급한 시스템 점검, 증설 및 교체 등 부득이한 사유로 인하여 예고 없이 일시적으로 서비스를 중단할 수 있으며, 새로운 서비스로의 교체 등 회사가 적절하다고 판단하는 사유에 의하여 현재 제공되는 서비스를 완전히 중단할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회사는 국가비상사태, 정전, 서비스 설비의 장애 또는 서비스 이용의 폭주 등으로 정상적인 서비스 제공이 불가능할 경우, 서비스의 전부 또는 일부를 제한하거나 중지할 수 있습니다. 다만 이 경우 그 사유 및 기간 등을 회원에게 사전 또는 사후에 공지합니다.\r\n");
      out.write("\r\n");
      out.write("(4) 회사는 회사가 통제 불가능의 사유로 인한 서비스중단의 경우 사전통지가 불가능하며 타인의 고의,과실로 인한 시스템중단 등의 경우에는 통보하지 아니합니다.\r\n");
      out.write("\r\n");
      out.write("(5) 회사는 서비스를 특정범위로 분할하여 각 범위 별로 이용가능시간을 별도로 지정할 수 있습니다. 다만 이 경우 그 내용을 공지합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 13 조 (이용자ID 관리)\r\n");
      out.write("\r\n");
      out.write("(1) 이용자 ID와 비밀번호에 관한 모든 관리책임은 회원에게 있습니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 이용자 ID에 의하여 제반 이용자 관리업무를 수행 하므로 회원이 이용자 ID를 변경하고자 하는 경우 회사가 인정할 만한 사유가 없는 한 이용자 ID의 변경을 제한할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(3) 이용고객이 등록한 이용자 ID 및 비밀번호에 의하여 발생되는 사용상의 과실 또는 제 3자에 의한 부정사용 등에 대한 모든 책임은 해당 이용고객에게 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 14 조 (게시물의 관리)\r\n");
      out.write("\r\n");
      out.write("회사는 다음 각 호에 해당하는 게시물이나 자료를 사전통지 없이 삭제하거나 이동 또는 등록 거부를 할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 다른 회원 또는 제 3자에게 심한 모욕을 주거나 명예를 손상시키는 내용인 경우\r\n");
      out.write("\r\n");
      out.write("ㄴ. 공공질서 및 미풍양속에 위반되는 내용을 유포하거나 링크시키는 경우\r\n");
      out.write("\r\n");
      out.write("ㄷ. 불법복제 또는 해킹을 조장하는 내용인 경우\r\n");
      out.write("\r\n");
      out.write("ㄹ. 영리를 목적으로 하는 광고일 경우\r\n");
      out.write("\r\n");
      out.write("ㅁ. 범죄와 결부된다고 객관적으로 인정되는 내용일 경우\r\n");
      out.write("\r\n");
      out.write("ㅂ. 다른 이용자 또는 제 3자의 저작권 등 기타 권리를 침해하는 내용인 경우\r\n");
      out.write("\r\n");
      out.write("ㅅ. 회사에서 규정한 게시물 원칙에 어긋나거나, 게시판 성격에 부합하지 않는 경우\r\n");
      out.write("\r\n");
      out.write("ㅇ. 기타 관계법령에 위배된다고 판단되는 경우\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 15 조 (게시물에 대한 저작권)\r\n");
      out.write("\r\n");
      out.write("(1) 회원이 서비스 화면 내에 게시한 게시물의 저작권은 게시한 회원에게 귀속됩니다. 또한 회사는 게시자의 동의 없이 게시물을 상업적으로 이용할 수 없습니다. 다만 비영리 목적인 경우는 그러하지 아니하며, 또한 서비스내의 게재권을 갖습니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회원은 서비스를 이용하여 취득한 정보를 임의 가공, 판매하는 행위 등 서비스에 게재된 자료를 상업적으로 사용할 수 없습니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회사는 회원이 게시하거나 등록하는 서비스 내의 내용물, 게시 내용에 대해 제 14조 각 호에 해당된다고 판단되는 경우 사전통지 없이 삭제하거나 이동 또는 등록 거부할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 16 조 (정보의 제공)\r\n");
      out.write("\r\n");
      out.write("(1) 회사는 회원에게 서비스 이용에 필요가 있다고 인정되는 각종 정보에 대해서 전자우편이나 서신우편 등의 방법으로 회원에게 제공할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 서비스 개선 및 회원 대상의 서비스 소개 등의 목적으로 회원의 동의 하에 추가적인 개인 정보를 요구할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 17 조 (광고게재 및 광고주와의 거래)\r\n");
      out.write("\r\n");
      out.write("(1) 회사가 회원에게 서비스를 제공할 수 있는 서비스 투자기반의 일부는 광고게재를 통한 수익으로부터 나옵니다. 회원은 서비스 이용시 노출되는 광고게재에 대해 동의합니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 서비스상에 게재되어 있거나 본 서비스를 통한 광고주의 판촉활동에 회원이 참여하거나 교신 또는 거래를 함으로써 발생하는 손실과 손해에 대해 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 5 장 계약 해지 및 이용 제한\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 18 조 (계약 변경 및 해지)\r\n");
      out.write("\r\n");
      out.write("회원이 이용계약을 해지하고자 하는 때에는 회원 본인이 Shoew Shop 웹 내의 [도움말] 메뉴를 이용해 가입해지를 해야 합니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 19 조 (서비스 이용제한)\r\n");
      out.write("\r\n");
      out.write("(1) 회사는 회원이 서비스 이용내용에 있어서 본 약관 제 11조 내용을 위반하거나, 다음 각 호에 해당하는 경우 서비스 이용을 제한할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("ㄱ. 미풍양속을 저해하는 비속한 ID 및 별명 사용\r\n");
      out.write("\r\n");
      out.write("ㄴ. 타 이용자에게 심한 모욕을 주거나, 서비스 이용을 방해한 경우\r\n");
      out.write("\r\n");
      out.write("ㄷ. 기타 정상적인 서비스 운영에 방해가 될 경우\r\n");
      out.write("\r\n");
      out.write("ㄹ. 정보통신 윤리위원회 등 관련 공공기관의 시정 요구가 있는 경우\r\n");
      out.write("\r\n");
      out.write("ㅁ. 3개월 이상 서비스를 이용한 적이 없는 경우\r\n");
      out.write("\r\n");
      out.write("ㅂ. 마이홈에 인덱스 파일 없이 자료만 올려 놓고 파일 자료실 전용으로 이용하는 경우\r\n");
      out.write("\r\n");
      out.write("ㅅ. 불법 홈페이지인 경우\r\n");
      out.write("\r\n");
      out.write("ㅇ. 상용소프트웨어나 크랙파일을 올린 경우\r\n");
      out.write("\r\n");
      out.write("ㅈ. 정보통신윤리 위원회의 심의 세칙 제 7조에 어긋나는 음란물을 게재한 경우\r\n");
      out.write("\r\n");
      out.write("ㅊ. 반국가적 행위의 수행을 목적으로 하는 내용을 포함한 경우\r\n");
      out.write("\r\n");
      out.write("ㅋ. 저작권이 있는 글을 무단 복제하거나 mp3를 게시판에 올린 경우\r\n");
      out.write("\r\n");
      out.write("(2) 상기 이용제한 규정에 따라 서비스를 이용하는 회원에게 서비스 이용에 대하여 별도 공지 없이 서비스 이용의 일시 정지, 초기화, 이용계약 해지 등을 불량이용자 처리규정에 따라 취할 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 6 장 손해배상 및 기타사항\r\n");
      out.write("\r\n");
      out.write("제 20 조 (손해배상)\r\n");
      out.write("\r\n");
      out.write("(1) 회사는 서비스에서 제공하는 서비스의 이용과 관련하여 개인정보보호정책에서 정하는 내용에 해당하지 않는 사항에 대하여는 어떠한 손해도 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 회원이 짱공유 서비스를 이용함으로써 직/간접적으로 행하는 모든 피해와 법적 책임에 대하여 어떠한 손해도 책임 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 21 조 (면책조항)\r\n");
      out.write("\r\n");
      out.write("(1) 회사는 천재지변, 전쟁 및 기타 이에 준하는 불가항력으로 인하여 서비스를 제공할 수 없는 경우에는 서비스 제공에 대한 책임이 면제됩니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사는 기간통신 사업자가 전기통신 서비스를 중지하거나 정상적으로 제공하지 아니하여 손해가 발생한 경우 책임이 면제됩니다.\r\n");
      out.write("\r\n");
      out.write("(3) 회사는 서비스용 설비의 보수, 교체, 정기점검, 공사 등 부득이한 사유로 발생한 손해에 대한 책임이 면제됩니다.\r\n");
      out.write("\r\n");
      out.write("(4) 회사는 회원의 귀책사유로 인한 서비스 이용의 장애 또는 손해에 대하여 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(5) 회사는 이용자의 컴퓨터 오류에 의해 손해가 발생한 경우, 또는 회원이 신상정보 및 전자우편 주소를 부실하게 기재하여 손해가 발생한 경우 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(6) 회사는 회원이 서비스를 이용하여 기대하는 수익을 얻지 못하거나 상실한 것에 대하여 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(8) 회사는 회원이 서비스를 이용하면서 얻은 자료로 인한 손해에 대하여 책임을 지지 않습니다. 또한 회사는 회원이 서비스를 이용하며 타 회원으로 인해 입게 되는 정신적 피해에 대하여 보상할 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(9) 회사는 회원이 서비스에 게재한 각종 정보, 자료, 사실의 신뢰도, 정확성 등 내용에 대하여 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(10) 회사는 이용자 상호간 및 이용자와 제 3자 상호 간에 서비스를 매개로 발생한 분쟁에 대해 개입할 의무가 없으며, 이로 인한 손해를 배상할 책임도 없습니다.\r\n");
      out.write("\r\n");
      out.write("(11) 회사에서 회원에게 무료로 제공하는 서비스의 이용과 관련해서는 어떠한 손해도 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(12) 회사는 회원의 게시판 사용으로 발생하는 어떠한 손해에도 책임을 지지 않으며 모든 책임은 게시물을 작성한 본인에게 있습니다.\r\n");
      out.write("\r\n");
      out.write("(13) 회사는 대한민국 법에서 정한 규율을 존중하며 정보통신 법과 청소년보호법을 비롯한 모든 법률을 위반하는 게시물을 올리는 것을 절대 허용하지 않으며 이에 관하여 회사는 일체의 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("(14) 회사는 회원이 Shoew Shop을 이용함으로써 회원 본인 또는 제3자에게 직/간접적으로 영향을 미치게 되는 모든 피해와 법적 문제에 대하여 책임을 지지 않습니다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제 22 조 (재판권 및 준거법)\r\n");
      out.write("\r\n");
      out.write("(1) 이 약관에 명시되지 않은 사항은 전기통신사업법 등 관계법령과 상관습에 따릅니다.\r\n");
      out.write("\r\n");
      out.write("(2) 회사의 정액 서비스 회원 및 기타 유료 서비스 이용 회원의 경우 회사가 별도로 정한 약관 및 정책에 따릅니다.\r\n");
      out.write("\r\n");
      out.write("(3) 서비스 이용으로 발생한 분쟁에 대해 소송이 제기되는 경우 회사의 본사 소재지를 관할하는 법원을 관할 법원으로 합니다.\r\n");
      out.write("</textarea>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<div style=\"text-align:center;\">\r\n");
      out.write("	<input type=\"checkbox\" name=\"okon\">청년문고 서비스 이용약관 동의 (필수)\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" value=\"Next\" class=\"submit\" onclick=\"go_next(event)\" style=\"float:right;\">\r\n");
      out.write("</form>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
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
      out.write("			<img alt=\"\" src=\"images/footer/customer_servicecenter.jpg\"style=\"width:180px; height:80px;\">\r\n");
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
}
