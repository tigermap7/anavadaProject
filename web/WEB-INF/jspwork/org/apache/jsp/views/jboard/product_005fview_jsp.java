/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-11 06:07:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.jboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jboard.model.vo.Jboard;
import java.util.ArrayList;
import java.sql.Date;
import jboard.model.vo.Comment;
import member.model.vo.Member;

public final class product_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/jboard/../include/head.jsp", Long.valueOf(1597016389348L));
    _jspx_dependants.put("/views/jboard/../include/footer.jsp", Long.valueOf(1596761427404L));
    _jspx_dependants.put("/views/jboard/../include/header.jsp", Long.valueOf(1597016389348L));
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
    _jspx_imports_classes.add("jboard.model.vo.Comment");
    _jspx_imports_classes.add("jboard.model.vo.Jboard");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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
      out.write(" \r\n");

	ArrayList<Comment> list = (ArrayList<Comment>) request.getAttribute("list");
	Jboard jboard = (Jboard)(request.getAttribute("jboardno"));
	String titleSearch = request.getParameter("titlesearch");
	String listSearch = request.getParameter("listsearch");
	int commentListCount = ((Integer) request.getAttribute("commentlistcount")).intValue();
	int currentPage = ((Integer)request.getAttribute("page")).intValue();
	String[] localArr = { "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구" };


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("       function commentReply(){\r\n");
      out.write("            if($('#commentReply').css('display') == 'block'){\r\n");
      out.write("            $('#commentReply').hide();\r\n");
      out.write("        }else{\r\n");
      out.write("            $('#commentReply').show();\r\n");
      out.write("        }\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("</head>\r\n");
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
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("    .swiper-container {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 300px;\r\n");
      out.write("        margin-left: auto;\r\n");
      out.write("        margin-right: auto;\r\n");
      out.write("    }\r\n");
      out.write("    .swiper-slide {\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("        background-position: center;\r\n");
      out.write("    }\r\n");
      out.write("    .gallery-top {\r\n");
      out.write("        height: 80%;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    .gallery-thumbs {\r\n");
      out.write("        height: 20%;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("    }\r\n");
      out.write("    .gallery-thumbs .swiper-slide {\r\n");
      out.write("        width: 25%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        opacity: 0.4;\r\n");
      out.write("    }\r\n");
      out.write("    .gallery-thumbs .swiper-slide-thumb-active {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("    var galleryThumbs = new Swiper('.gallery-thumbs', {\r\n");
      out.write("        spaceBetween: 10,\r\n");
      out.write("        slidesPerView: 4,\r\n");
      out.write("        freeMode: true,\r\n");
      out.write("        watchSlidesVisibility: true,\r\n");
      out.write("        watchSlidesProgress: true,\r\n");
      out.write("    });\r\n");
      out.write("    var galleryTop = new Swiper('.gallery-top', {\r\n");
      out.write("        spaceBetween: 10,\r\n");
      out.write("        navigation: {\r\n");
      out.write("        nextEl: '.swiper-button-next',\r\n");
      out.write("        prevEl: '.swiper-button-prev',\r\n");
      out.write("    },\r\n");
      out.write("        thumbs: {\r\n");
      out.write("        swiper: galleryThumbs\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
      out.write("\r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas product-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">중고거래</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>중고거래</span></h2>\r\n");
      out.write("                    <h3>우리의 이웃과 중고거래를 통해 변화되는 세상</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- 뷰 -->\r\n");
      out.write("            <div class=\"product_view_area\">\r\n");
      out.write("                <dl class=\"product_info\">\r\n");
      out.write("                    <dt>\r\n");
      out.write("                        <div class=\"swiper-container gallery-top\">\r\n");
      out.write("                            <ul class=\"swiper-wrapper\">\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- Add Arrows -->\r\n");
      out.write("                            <div class=\"swiper-button-next swiper-button-white\"></div>\r\n");
      out.write("                            <div class=\"swiper-button-prev swiper-button-white\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"swiper-container gallery-thumbs\">\r\n");
      out.write("                            <ol class=\"swiper-wrapper\">\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                                <li class=\"swiper-slide\"><img src=\"/anavada/resources/images/test/testImg.jpg\"/></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                        <!-- Initialize Swiper -->\r\n");
      out.write("                        <script>\r\n");
      out.write("                            var galleryThumbs = new Swiper('.gallery-thumbs', {\r\n");
      out.write("                                spaceBetween: 10,\r\n");
      out.write("                                slidesPerView: 4,\r\n");
      out.write("                                freeMode: true,\r\n");
      out.write("                                watchSlidesVisibility: true,\r\n");
      out.write("                                watchSlidesProgress: true,\r\n");
      out.write("                            });\r\n");
      out.write("                            var galleryTop = new Swiper('.gallery-top', {\r\n");
      out.write("                                spaceBetween: 10,\r\n");
      out.write("                                navigation: {\r\n");
      out.write("                                nextEl: '.swiper-button-next',\r\n");
      out.write("                                prevEl: '.swiper-button-prev',\r\n");
      out.write("                                },\r\n");
      out.write("                                autoplay: {\r\n");
      out.write("                                    delay: 2000,\r\n");
      out.write("                                    disableOnInteraction: false,\r\n");
      out.write("                                },\r\n");
      out.write("                                thumbs: {\r\n");
      out.write("                               swiper: galleryThumbs\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                        </script>\r\n");
      out.write("                    </dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                           <dt>");
      out.print(localArr[Integer.parseInt(jboard.getLocalNo())-1] );
      out.write("</dt>\r\n");
      out.write("                           <dd>\r\n");
      out.write("                               <button type=\"button\" onclick=\"#none\" class=\"lookup_btn\">사기조회</button>\r\n");
      out.write("                               <button type=\"button\" onclick=\"#none\" class=\"lookup_btn\">신고하기</button>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>");
      out.print(jboard.getJboardLike() );
      out.write("</span></i>\r\n");
      out.write("                            <h2 class=\"product_name\"><b>상품명 : </b><span>");
      out.print(jboard.getJboardTitle() );
      out.write("</span></h2>\r\n");
      out.write("                            <h3 class=\"product_price\"><b>판매가격 : </b><span>");
      out.print(jboard.getJboardPrice() );
      out.write("</span>원</h3>\r\n");
      out.write("                            <p class=\"view-ctn\">\r\n");
      out.write("                                ");
      out.print( jboard.getJboardContent() );
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <b>판매자 아이디 : ");
      out.print( jboard.getMemberId());
      out.write(" &nbsp; &nbsp; / &nbsp; &nbsp; 조회수 : ");
      out.print(jboard.getJboardCount());
      out.write("</b><br/>\r\n");
      out.write("                                <b>등록일자 : </b>");
      out.print( jboard.getJboardDate());
      out.write(" &nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;<b>최종수정일자 : </b>");
      out.print(jboard.getJboardUpdate() );
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <div class=\"view-btn\">\r\n");
      out.write("                    <a href=\"\" class=\"btn btn-prev\">이전글</a>\r\n");
      out.write("                 \t");
 if (loginMember != null){
      out.write("\r\n");
      out.write("                 \t");
	if(loginMember.getMemberId().equals(jboard.getMemberId())){ 
      out.write("\r\n");
      out.write("                 \t<a href=\"/anavada/jbupview?jboardno=");
      out.print(jboard.getJboardNo() );
      out.write("&page=");
      out.print(currentPage );
      out.write("\" class=\"btn btn-list\">수정</a>\r\n");
      out.write("                 \t<a href=\"/anavada/views/jboard/product_updateView.jsp\" class=\"btn btn-list\">삭제</a>\r\n");
      out.write("                 \t");
}} 
      out.write("\r\n");
      out.write("                    <a href=\"javascript:history.go(-1);\" class=\"btn btn-list\">목록</a>\r\n");
      out.write("                    <a href=\"#none\" class=\"btn btn-next\">다음글</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"cmt_wrap\">\r\n");
      out.write("                    <form action=\"/anavada/jbdetail?jboardno=");
      out.print( jboard.getJboardNo() );
      out.write("&jbclist?jboardno=");
      out.print(jboard.getJboardNo());
      out.write("/jbcinsert.ss'\"  method=\"\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <div class=\"cmt_form\">\r\n");
      out.write("                                <h4 class=\"cmt_head\">전체 댓글 수 :");
      out.print(commentListCount );
      out.write("</h4>\r\n");
      out.write("                                <div class=\"cmt_body\">\r\n");
      out.write("<textarea name=\"\" style=\"resize: none; width:100%; min-height:100px; max-height:100px;\" onfocus=\"this.value='';\">비방글은 작성하실 수 없습니다.</textarea>\r\n");
      out.write("                                    <div class=\"cmt_ok\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"등록\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <ul class=\"cmt_con\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 for (Comment comment : list ){ 
      out.write("\r\n");
      out.write("                    ");
 if (list.size()>0 && jboard.getJboardNo() == comment.getJboardNo()){ 
      out.write("\r\n");
      out.write("                        <li> \r\n");
      out.write("                            <div>\r\n");
      out.write("                                <h4>");
      out.print(comment.getCommentId() );
      out.write("</h4><span>마지막 수정일");
      out.print(comment.getCommentLastModified() );
      out.write("</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>");
      out.print(comment.getCommentContent() );
      out.write("</p>\r\n");
      out.write("                            <button onclick=\"commentReply()\">대댓글</button>\r\n");
      out.write("                            <div style=\"display:none\" class=\"Subcmt_form\" id=\"commentReply\">\r\n");
      out.write("                                <form action=\"/anavada/jbdetail?jboardno=");
      out.print( jboard.getJboardNo() );
      out.write("&jbclist?jboardno=");
      out.print(jboard.getJboardNo());
      out.write("/jbcinsert.ss'\" method=\"\">\r\n");
      out.write("                               \r\n");
      out.write("                                    <fieldset>\r\n");
      out.write("                                        <div class=\"cmt_form\">\r\n");
      out.write("                                            <div class=\"cmt_body\">\r\n");
      out.write("<textarea name=\"\" style=\"resize: none; width:100%; min-height:100px; max-height:100px;\" onfocus=\"this.value='';\">비방글은 작성하실 수 없습니다.</textarea>\r\n");
      out.write("                                            <div class=\"cmt_ok\"><input type=\"submit\" value=\"등록\" onclick=\"\" location.href='/anavada/jbdetail?jboardno=");
      out.print( comment.getJboardNo() );
      out.write("'></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                      ");
}} 
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <button class=\"cmt_in\">댓글 더보기 <i class=\"glyphicon glyphicon-menu-right\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 상세 끝 -->\r\n");
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
