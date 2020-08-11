/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-11 08:33:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import notice.model.vo.Notice;
import member.model.vo.Member;

public final class notice_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/notice/../include/header.jsp", Long.valueOf(1597134662968L));
    _jspx_dependants.put("/views/notice/../include/head.jsp", Long.valueOf(1597017256016L));
    _jspx_dependants.put("/views/notice/../include/footer.jsp", Long.valueOf(1596688113526L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write('\r');
      out.write('\n');

	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	int listCount = (Integer)request.getAttribute("listCount");
	int startPage = (Integer)request.getAttribute("startPage");
	int endPage = (Integer)request.getAttribute("endPage");
	int maxPage = (Integer)request.getAttribute("maxPage");
	int currentPage = (Integer)request.getAttribute("currentPage");
	Notice notice = (Notice)request.getAttribute("notice");
	
	String selected = null;
	String keyword = null;
	if(request.getAttribute("selected") != null && request.getAttribute("keyword") != null){
		selected = (String)request.getAttribute("selected");
		keyword = (String)request.getAttribute("keyword");
	}

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
      out.write(" \r\n");
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
      out.write("                        <a href=\"/anavada/views/notice/faq_list.jsp\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/ilist\">문의하기</a>\r\n");
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
      out.write("\r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas notice-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li><a href=\"#none\">고객센터</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">공지사항</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>공지사항</span></h2>\r\n");
      out.write("                    <h3>'Anavada'의 소식을 빠르게 확인할 수 있는 공간입니다.</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("            <!-- 리스트 -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"list-area\">\r\n");
      out.write("               <!--종류 리스트-->\r\n");
      out.write("\t\t\t\t<div class=\"sort-area\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t전체 ");
      out.print( listCount );
      out.write("개\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"/anavada/nsearch?page=1\" method=\"post\" id=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t목록 분류 : <select name=\"selected\" class=\"ListSelect\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"none\" selected disabled>분류 선택</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"title\">제목</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"content\">내용</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select> <input type=\"text\" name=\"keyword\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"top-search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"xi-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
 if(listCount == 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"list-no\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"/anavada/resources/images/btnIcn/icn_big_listNo.png\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" title=\"\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<h1>목록이 없습니다.</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
 }else { 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr onclick=\"location.href='notice_view.jsp';\" class=\"active\">\r\n");
      out.write("                            <td class=\"number\">");
      out.print( notice.getNoNo() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"title\">\r\n");
      out.write("                                <h2><span>공지</span>");
      out.print( notice.getNoTitle() );
      out.write("</h2>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>작성자 : ");
      out.print( notice.getNoId() );
      out.write("</li>\r\n");
      out.write("                                    <li>작성일 : ");
      out.print( notice.getNoDate() );
      out.write("</li>\r\n");
      out.write("                                    <li>조회수 : ");
      out.print( notice.getNoCount() );
      out.write("</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"fileDown\">");
 if(notice.getNoOriginal() != null) { 
      out.write("<i class=\"glyphicon glyphicon-floppy-saved\"></i>");
 } 
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
 for(Notice n : list) { 
      out.write("\r\n");
      out.write("                        \t");
 if(selected != null && keyword != null) { 
      out.write("\r\n");
      out.write("                        \t<tr onclick=\"location.href='/anavada/ndetail?no=");
      out.print( n.getNoNo() );
      out.write("&page=");
      out.print( currentPage );
      out.write("&selected=");
      out.print( selected );
      out.write("&keyword=");
      out.print( keyword );
      out.write("';\">\r\n");
      out.write("                        \t");
 }else { 
      out.write("\r\n");
      out.write("                        \t<tr onclick=\"location.href='/anavada/ndetail?no=");
      out.print( n.getNoNo() );
      out.write("&page=");
      out.print( currentPage );
      out.write("';\">\r\n");
      out.write("                        \t");
 } 
      out.write("\r\n");
      out.write("                            <td class=\"number\">");
      out.print( n.getNoNo() );
      out.write("</td>\r\n");
      out.write("                            <td class=\"title\">\r\n");
      out.write("                                <h2>");
      out.print( n.getNoTitle() );
      out.write("</h2>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>작성자 : ");
      out.print( n.getNoId() );
      out.write("</li>\r\n");
      out.write("                                    <li>작성일 : ");
      out.print( n.getNoDate() );
      out.write("</li>\r\n");
      out.write("                                    <li>조회수 : ");
      out.print( n.getNoCount() );
      out.write("</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"fileDown\">\r\n");
      out.write("                            ");
 if(n.getNoOriginal() != null) { 
      out.write("\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-floppy-saved\"></i>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- 리스트 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- 페이지넘버 -->\r\n");
      out.write("            ");
 if(listCount > 0) { 
      out.write("\r\n");
      out.write("            <dl class=\"list-paging pb80\">\r\n");
      out.write("                <dd>\r\n");
      out.write("                ");
 if(selected == null && keyword == null) { 
      out.write("\r\n");
      out.write("                \t");
 if(currentPage <= 1) { 
      out.write("\r\n");
      out.write("                    <a><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    ");
 }else { 
      out.write("\r\n");
      out.write("                    \t<a href=\"/anavada/nlist?page=1\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 for(int p = startPage; p <= endPage; p++) {
                    	if(p==currentPage) {
      out.write("\r\n");
      out.write("                    <a class=\"active\">");
      out.print( p );
      out.write("</a>\r\n");
      out.write("                    ");
 }else { 
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/nlist?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("                    ");
 } } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if(currentPage < maxPage) { 
      out.write("\r\n");
      out.write("                    \t<a href=\"nlist?page=");
      out.print( maxPage );
      out.write("\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("                    ");
}else { 
      out.write("\r\n");
      out.write("                    <a><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("                    \r\n");
      out.write("                 ");
 } }else { 
      out.write("\r\n");
      out.write("                \t");
 if(currentPage <= 1) { 
      out.write("\r\n");
      out.write("                    <a><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    ");
 }else { 
      out.write("\r\n");
      out.write("                    \t<a href=\"/anavada/nsearch?page=1&selected=");
      out.print( selected );
      out.write("&keyword=");
      out.print( keyword );
      out.write("\"><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 for(int p = startPage; p <= endPage; p++) {
                    	if(p==currentPage) {
      out.write("\r\n");
      out.write("                    <a class=\"active\">");
      out.print( p );
      out.write("</a>\r\n");
      out.write("                    ");
 }else { 
      out.write("\r\n");
      out.write("                    <a href=\"/anavada/nsearch?page=");
      out.print( p );
      out.write("&selected=");
      out.print( selected );
      out.write("&keyword=");
      out.print( keyword );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("                    ");
 } } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if(currentPage < maxPage) { 
      out.write("\r\n");
      out.write("                    \t<a href=\"/anavada/nsearch?page=");
      out.print( maxPage );
      out.write("&selected=");
      out.print( selected );
      out.write("&keyword=");
      out.print( keyword );
      out.write("\"><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("                    ");
} else { 
      out.write("\r\n");
      out.write("                    <a><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("                    ");
 } } 
      out.write("\r\n");
      out.write("                </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            <!-- 페이지넘버 끝 -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("        ");
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
