<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar, java.text.SimpleDateFormat"%>
<%
	request.setCharacterEncoding("UTF-8");
	String fboardNo = request.getParameter("fboardno");
 	int festivalEndDate = Integer.parseInt(request.getParameter("festivalEndDate").toString());
	System.out.println(fboardNo + ",  "  + festivalEndDate); 
%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../include/head.jsp" %> 
</head>
	<!-- 현재 진행중이지 않은 축제 알리기 -->
	<script type="text/javascript">
 	console.log(<%=fboardNo %>, <%= festivalEndDate%>);
	<% 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    Calendar c1 = Calendar.getInstance();
	int strToday = Integer.parseInt(sdf.format(c1.getTime()));
	
	if(festivalEndDate < strToday) { %>
		alert('지난 축제 입니다');
	<% } %>

	</script>

<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
    <div id="wrap">
        <%@ include file="../include/header.jsp" %>

        <!-- 컨텐츠 -->
        <div id="content">

            <!--서브 비주얼/타이틀-->
            <div class="visual-sub-vagas areaEvent-vagas">
                <div class="vsv-copy sub-title">
                   <div>
                        <ul class="navi">
                            <li><a href="#none">홈</a></li>
                            <li><a href="#none">고객센터</a></li>
                            <li class="glyphicon glyphicon-menu-right"><a href="#none">지역축제</a></li>
                        </ul>
                    </div>
                    <h2><span>지역축제</span></h2>
                    <h3>우리의 이웃과 'Anavada'를 통해 소통할 수 있는 공간입니다.</h3>
                </div>
            </div>
            <!--서브 비주얼/타이틀 끝-->

            <!-- 상세 -->
            <div class="view-area areaEvent_view">
                <h2><span>서울시 종로구</span>여우樂 페스티벌 2020</h2>
                <ul>
                    <li><span>작성자 : </span>홍길동</li>
                    <li><span>작성일 : </span>2020.07.30</li>
                    <li><span>조회수 : </span>30</li>
                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                </ul>
                <div class="areaEvent_info">
                    <div><img src="/anavada/resources/images/test/testImg.jpg" width="400px" height="400px"></div>
                    <table>
                        <colgroup>
                            <col width="15%">
                            <col width="35%">
                            <col width="15%">
                            <col width="35%">
                        </colgroup>
                        <tbody>
                            <tr>
                                <th>개최지역</th>
                                <td>서울시 종로구</td>
                                <th>축제성격</th>
                                <td>문화예술</td>
                            </tr>
                            <tr>
                                <th>축제장소</th>
                                <td>국립극장 하늘, 달오름</td>
                                <th>주최/주관기관</th>
                                <td>국립극장</td>
                            </tr>
                            <tr>
                                <th>개최기간</th>
                                <td>2020.07.30 ~ 2020.08.30</td>
                                <th>주죄문의</th>
                                <td>국립극장 관리자 02-2222-2222</td>
                            </tr>
                            <tr>
                                <th>url</th>
                                <td colspan="3"><a href="#none">https://www.gov.kr/portal/vfnews/850605?pageIndex=5</a></td>
                            </tr>
                            <tr>
                                <th>첨부파일#1</th>
                                <td colspan="3"><a href="#none" download>지역축제_종로구.pdf</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <h2>축제설명</h2>
                <div class="view-ctn">
                        너 없는 지금도 눈부신 하늘과<br/>
                        눈부시게 웃는 사람들<br/>
                        나의 헤어짐을 모르는 세상은<br/>
                        슬프도록 그대로인데<br/><br/>

                        시간마저 데려가지 못하게<br/>
                        나만은 널 보내지 못했나봐<br/>
                        가시처럼 깊게 박힌 기억은<br/>
                        아파도 아픈 줄 모르고<br/><br/>

                        그대 기억이 지난 사랑이<br/>
                        내 안을 파고 드는 가시가 되어<br/>
                        제발 가라고 아주 가라고<br/>
                        애써도 나를 괴롭히는데<br/><br/>

                        아픈 만큼 너를 잊게 된다면<br/>
                        차라리 앓고 나면 그만인데<br/>
                        가시처럼 깊게 박힌 기억은<br/>
                        아파도 아픈 줄 모르고
                </div>

                <div class="view-btn">
                    <a href="#none" class="btn btn-prev">이전글</a>
                    <a href="areaEvent_list.jsp" class="btn btn-list">목록</a>
                    <a href="#none" class="btn btn-next">다음글</a>
                </div>
                
                <div class="cmt_wrap">
                    <form action="" method="">
                        <fieldset>
                            <div class="cmt_form">
                                <h4 class="cmt_head">댓글 77</h4>
                                <div class="cmt_body">
<textarea name="" style="resize: none; width:100%; min-height:100px; max-height:100px;" onfocus="this.value='';">비방글은 작성하실 수 없습니다.</textarea>
                                    <div class="cmt_ok"><input type="submit" value="등록"></div>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                    <ul class="cmt_con">
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                            <div class="Subcmt_form">
                                <form action="" method="">
                                    <fieldset>
                                        <div class="cmt_form">
                                            <div class="cmt_body">
<textarea name="" style="resize: none; width:100%; min-height:100px; max-height:100px;" onfocus="this.value='';">비방글은 작성하실 수 없습니다.</textarea>
                                            <div class="cmt_ok"><input type="submit" value="등록"></div>
                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </li>
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                            <div class="Subcmt_form">
                                 <div>
                                    <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                                </div>
                                <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            </div>
                        </li>
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                        </li>
                    </ul>
                    <button class="cmt_in">댓글 더보기 <i class="glyphicon glyphicon-menu-right"></i></button>
                </div>
            </div>
            <!-- 상세 끝 -->

        </div>
        <!-- 컨텐츠 끝 -->

        <%@ include file="../include/footer.jsp" %>
    </div>
</body>
</html>