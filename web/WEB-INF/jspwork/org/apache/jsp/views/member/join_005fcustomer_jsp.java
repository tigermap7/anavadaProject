/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-10 00:29:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class join_005fcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/member/../include/head.jsp", Long.valueOf(1597016389348L));
    _jspx_dependants.put("/views/member/../include/footer.jsp", Long.valueOf(1596761427404L));
    _jspx_dependants.put("/views/member/../include/header.jsp", Long.valueOf(1597016389348L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<meta name=\"title\" content=\"Anavada\" />\r\n");
      out.write("<meta name=\"description\" content=\"Anavada 설명\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Anavada 키워드\" />\r\n");
      out.write("\r\n");
      out.write("<title>Anavada</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"/anavada/resources/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"/anavada/resources/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/common.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/vegas.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/swiper.min.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/mainNotice.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--티스토리 불펌금지-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var omitformtags=[\"input\", \"textarea\", \"select\"]\r\n");
      out.write("    omitformtags=omitformtags.join(\"|\")\r\n");
      out.write("    function disableselect(e){\r\n");
      out.write("    if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)\r\n");
      out.write("        return false\r\n");
      out.write("    }\r\n");
      out.write("    function reEnable(){\r\n");
      out.write("        return true\r\n");
      out.write("    }\r\n");
      out.write("    if (typeof document.onselectstart!=\"undefined\")\r\n");
      out.write("        document.onselectstart=new Function (\"return false\")\r\n");
      out.write("    else{\r\n");
      out.write("        document.onmousedown=disableselect\r\n");
      out.write("        document.onmouseup=reEnable\r\n");
      out.write("    }\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction validate() {\r\n");
      out.write("\t\t\t//암호일치 확인\r\n");
      out.write("\t\t\tvar pwdValue = document.getElementById(\"memberPwd\").value;\r\n");
      out.write("\t\t\tvar pwdValue2 = document.getElementById(\"memberPwd2\").value;\r\n");
      out.write("\t\t\tif (pwdValue !== pwdValue2) {\r\n");
      out.write("\t\t\t\talert(\"암호와 암호 확인의 값이 일치하지 않습니다.\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"memberPwd\").select();\r\n");
      out.write("\t\t\t\treturn false; //전송 취소함\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true; //전송함\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//아이디 중복 체크 확인을 위한 ajax 실행 처리용 함수\r\n");
      out.write("\t\tfunction joinldCheck() {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/anavada/idchk\",\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tmemberId : $(\"#memberId\").val()\r\n");
      out.write("\t\t\t\t}, // input에 입력된 값을 가져올땐 .val() 작성\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data == \"ok\") { // == 같다. 표현\r\n");
      out.write("\t\t\t\t\t\talert(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#memberPwd\").focus();\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\talert(\"이미 사용중인 아이디입니다.\\n다시 입력하세요.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#memberId\").select();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(jqXHR, textstatus, errorthrown) { // jqXHR, textstatus, errorthrown : 에러표시 함수가 있음.\r\n");
      out.write("\t\t\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + textstatus + \", \"\r\n");
      out.write("\t\t\t\t\t\t\t+ errorthrown);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write('\r');
      out.write('\n');
 Member member = (Member)request.getAttribute("member"); 
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<!-- 상단메뉴 -->\r\n");
      out.write("    <dl class=\"gnbWrap clearfix\">\r\n");
      out.write("    \t<dt><h1><a href=\"/anavada/\" title=\"Anavada\">Anavada</a></h1></dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul class=\"gnb clearfix\">\r\n");
      out.write("                <li><a href=\"/anavada/jblist\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/clistview?page=1&local=0\">커뮤니티</a></li>\r\n");
      out.write("                <li><a href=\"../fboard/areaEvent_list.jsp\">지역축제</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/anavada/nlist\">고객센터</a>\r\n");
      out.write("                    <div class=\"subGnb\">\r\n");
      out.write("                        <a href=\"/anavada/nlist\">공지사항</a>\r\n");
      out.write("                        <a href=\"/anavada/flist\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/views/inquiry/inquiry_list.jsp\">문의하기</a>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/dbolist\">권한관리</a>\r\n");
      out.write("                       ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <ul class=\"util\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form action=\"\" method=\"\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("                        <button class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/join_agree.jsp\">JOIN</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/login.jsp\">LOGIN</a></li>\r\n");
      out.write("                ");
 } else if(loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../admin/member/memberList.jsp\">관리자페이지</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/mypage.cp?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("\">MYPAGE</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                <li><i id=\"favorite\" class=\"xi-star-o\" title=\"즐겨찾기 등록\"></i></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dt>\r\n");
      out.write("    </dl>\r\n");
      out.write("    <!-- //상단메뉴 -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- 컨텐츠 -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas member-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">MEMBER</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>MEMBERS</span></h2>\r\n");
      out.write("                    <h3>회원가입으로 'Anavada'의 서비스를 이용하실 수 있습니다.</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- 회원가입 고객가입 -->\r\n");
      out.write("            <form name=\"join\" action=\"/anavada/join.cp\" method=\"post\" onsubmit=\"return validate();\" class=\"form-inline\">\r\n");
      out.write("                <div class=\"MBwrap\">\r\n");
      out.write("                    <div class=\"MBjoin_input-wrap\">\r\n");
      out.write("                        <ul class=\"joinDepth\">\r\n");
      out.write("                            <li>약관동의</li>\r\n");
      out.write("                            <li class=\"on\">회원정보 입력</li>\r\n");
      out.write("                            <li>회원가입 완료</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"MBjoin_input\">\r\n");
      out.write("                            <h3>회원 정보입력</h3>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"idArea\">\r\n");
      out.write("                                        <input type=\"text\" name=\"memberId\" title=\"아이디\" id=\"memberId\" class=\"form-control w40p\" placeholder=\"아이디(필수입력)\" maxlength=\"12\" required/>\r\n");
      out.write("                                        <a href=\"#none\" class=\"btnS1\" onclick=\"return joinldCheck();\">중복확인</a>\r\n");
      out.write("                                        <p>4자이상 12자이내 입력하세요. 대소문자 구분, 영문, 숫자, 특수문자 입력 가능.</p>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"pwArea\"><input type=\"password\" name=\"memberPwd\" title=\"비밀번호\" id=\"memberPwd\" class=\"form-control w40p\" placeholder=\"비밀번호(필수입력)\" maxlength=\"12\"/><p>4자이상 12자이내 입력하세요. 대소문자 구분, 영문, 숫자, 특수문자 입력 가능.</p></li>\r\n");
      out.write("                                    <li class=\"pwArea\">\r\n");
      out.write("                                        <input type=\"password\" name=\"memberPwd2\" title=\"비밀번호 재확인\" class=\"form-control w40p\" placeholder=\"비밀번호 재확인(필수입력)\" maxlength=\"12\" required/>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"line15\">&nbsp;</div>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li style=\"margin-bottom: 10px;\"><input type=\"text\" name=\"memberName\" title=\"이름\" class=\"form-control w50p\" placeholder=\"이름(필수입력)\" required/></li>\r\n");
      out.write("                                    <li><input type=\"email\" name=\"memberEmail\" title=\"이메일\" class=\"form-control w50p\" placeholder=\"이메일(필수입력)\" required/>\r\n");
      out.write("                                        <a href=\"#none\" class=\"btnS1\">인증하기</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"certifyArea\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("                                        <input type=\"text\" name=\"memberEmailOk\" title=\"인증번호\" class=\"form-control w50p\" placeholder=\"인증번호 입력\"/>\r\n");
      out.write("                                        <a href=\"#none\" class=\"btnS1\">인증확인</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"telArea\"><input type=\"tel\" name=\"memberPhone\" title=\"휴대폰번호\" class=\"form-control w50p\" placeholder=\"휴대폰 번호 '-' 포함 입력(필수입력)\" required/></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"MBjoin_input_btn\">\r\n");
      out.write("\t\t\t                    <input type=\"reset\" value=\"작성취소\" onclick=\"location.href='/anavada/'\" title=\"홈으로 이동\">\r\n");
      out.write("\t\t\t                    <input type=\"submit\" value=\"작성완료\" title=\"회원가입 완료\">\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <!-- 회원가입 고객가입 끝 -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <a href=\"../etc/terms.jsp\">이용약관</a>\r\n");
      out.write("            <a href=\"../etc/privacy.jsp\">개인정보처리방침</a>\r\n");
      out.write("            <a href=\"../etc/email.jsp\">이메일무단수집거부</a>\r\n");
      out.write("        </dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("        \tAnavada | 서울특별시 중구 남대문로 120 대일빌딩 2F, 3F | 대표자 : 공유 | 개인정보 담당자 : 강동원 | 고객센터 : 1577-7777<br/>\r\n");
      out.write("            <span>Copyright 2020. Anavada. All Rights Reserved</span>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </div>\r\n");
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
