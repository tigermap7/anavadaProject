<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="inquiry.model.vo.Inquiry, admin.notice.answer.model.vo.Answer"%>
<%
	Inquiry inquiry = (Inquiry)request.getAttribute("inquiry");
	int currentPage = ((Integer)request.getAttribute("page")).intValue();
	Answer answer = (Answer)request.getAttribute("answer");
%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../include/head.jsp" %> 
</head>
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
    <div id="wrap">
        <%@ include file="../include/header.jsp" %>

        <!-- 컨텐츠 -->
        <div id="content">

            <!--서브 비주얼/타이틀-->
            <div class="visual-sub-vagas notice-vagas">
                <div class="vsv-copy sub-title">
                   <div>
                        <ul class="navi">
                            <li><a href="#none">홈</a></li>
                            <li><a href="#none">고객센터</a></li>
                            <li class="glyphicon glyphicon-menu-right"><a href="#none">문의하기</a></li>
                        </ul>
                    </div>
                    <h2><span>문의하기</span></h2>
                    <h3>관리자에게 문의할 수 있는 공간입니다.</h3>
                </div>
            </div>
            <!--서브 비주얼/타이틀 끝-->

            <!-- 상세 -->
            <div class="view-area">
                <h2><span class="inquiry">나의 문의</span> <%= inquiry.getIqTitle() %></h2>
                <ul>
                    <li><span>작성자 : </span><%= inquiry.getIqId() %></li>
                    <li><span>등록일 : </span><%= inquiry.getIqDate() %></li>
                    <li><span>첨부파일 : </span></li>
                    <% if(inquiry.getIqOriginal() != null) { %>
                    <li><a href="/anavada/ifdown?ofile=<%= inquiry.getIqOriginal() %>&rfile=<%= inquiry.getIqRename() %>" download><%= inquiry.getIqOriginal() %></a></li>
                    <% } if(inquiry.getIqOriginal2() != null) { %>
                    <li><a href="/anavada/ifdown?ofile=<%= inquiry.getIqOriginal2() %>&rfile=<%= inquiry.getIqRename2() %>" download><%= inquiry.getIqOriginal2() %></a></li>
                    <% } if(inquiry.getIqOriginal3() != null) { %>
                    <li><a href="/anavada/ifdown?ofile=<%= inquiry.getIqOriginal3() %>&rfile=<%= inquiry.getIqRename3() %>" download><%= inquiry.getIqOriginal3() %></a></li>
                    <% } %>
                </ul>

                <div class="view-ctn"><%= inquiry.getIqContent().replace("\r\n","<br>") %></div>
				
				<div align="right">
				<br>
				<a href="/anavada/iupdateview?no=<%= inquiry.getIqNo() %>&page=<%= currentPage %>" class="btn btn-list" style="background-color:white; border-color:white; color:black;">수정</a>
				<a href="/anavada/idelete?no=<%= inquiry.getIqNo() %>&rfile=<%= inquiry.getIqRename() %>&rfile2=<%= inquiry.getIqRename2() %>&rfile3=<%= inquiry.getIqRename3() %>" class="btn btn-list" style="background-color:white; border-color:white; color:red;">삭제</a>
				</div>
				
				
                <div class="view-btn">
                    <a onclick="javascript=history.go(-1);" class="btn btn-list">목록</a>
                </div>
                
                
                <% if(answer != null) { %>
                <div class="cmt_wrap">
                    <ul class="cmt_con">
                        <li>
                            <div>
                                <h4 style="font-size:13pt;">● user : 관리자</h4><span><%= answer.getAnDate() %></span>
                            </div><br>
                            <p style="font-size:11pt;"><%= answer.getAnContent().replace("\r\n", "<br>") %></p>
                        </li>
                    </ul>
                </div>
                <% } %>
                
            </div>
            <!-- 상세 끝 -->

        </div>
        <!-- 컨텐츠 끝 -->

        <%@ include file="../include/footer.jsp" %>
    </div>
</body>
</html>