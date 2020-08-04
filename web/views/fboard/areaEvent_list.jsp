<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

            <!-- 리스트 -->

            <div class="areaEvent_list">
                <div class="areaEvent_map"><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3162.453554125798!2d126.98089706565142!3d37.56793627979763!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca2eee632d73f%3A0x15cc2733ad91fd28!2zS0gg7KCV67O06rWQ7Jyh7JuQ!5e0!3m2!1sko!2skr!4v1595997675697!5m2!1sko!2skr" width="100%" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe></div>
               <!--종류 리스트-->
                <div class="sort-area">  
                    <h4>전체 150개</h4>
                    <a href="areaEvent_write.jsp" class="write_btn">글쓰기</a>
                    <div>
                        <form action="" method="" id="">
                           지역 분류 : <select name="" class="LocationSelect">
                                    <option value="지역선택" selected="selected">지역선택</option>
                                    <option value="강남구">강남구</option>
                                    <option value="강동구">강동구</option>
                                    <option value="강북구">강북구</option>
                                    <option value="강서구">강서구</option>
                                    <option value="관악구">관악구</option>
                                    <option value="광진구">광진구</option>
                                    <option value="구로구">구로구</option>
                                    <option value="금천구">금천구</option>
                                    <option value="노원구">노원구</option>
                                    <option value="도봉구">도봉구</option>
                                    <option value="동대문구">동대문구</option>
                                    <option value="동작구">동작구</option>
                                    <option value="마포구">마포구</option>
                                    <option value="서대문구">서대문구</option>
                                    <option value="서초구">서초구</option>
                                    <option value="성동구">성동구</option>
                                    <option value="성북구">성북구</option>
                                    <option value="송파구">송파구</option>
                                    <option value="양천구">양천구</option>
                                    <option value="영등포구">영등포구</option>
                                    <option value="용산구">용산구</option>
                                    <option value="은평구">은평구</option>
                                    <option value="종로구">종로구</option>
                                    <option value="중구">중구</option>
                                    <option value="구로구">중랑구</option>
                            </select>
                            <select name="" class="ListSelect">
                                    <option value="분류 선택" selected="selected">분류 선택</option>
                                    <option value="제목">제목</option>
                                    <option value="내용">내용</option>
                                    <option value="작성자">작성자</option>
                                    <option value="작성자">조회순</option>
                                    <option value="작성자">마감순</option>
                            </select>
                            
                            <input type="text" placeholder="검색어를 입력해주세요.">
                            <button class="top-search"><i class="xi-search"></i></button>
                        </form>
                    </div>
                </div>

                <table class="cmnt_list">
                    <tbody>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">10</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>여우樂 페스티벌 2020</h2>
                                <p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을 넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의 도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는 공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을 보여 줄 것이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">9</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 중구</span>서울 물순환 시민문화제 2020</h2>
                                <p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물 절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시 대표 축제이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">8</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>비건페스타 2020</h2>
                                <p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를 지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날 수 있는 국내 최대 비건 전문 전시회입니다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">7</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>여우樂 페스티벌 2020</h2>
                                <p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을 넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의 도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는 공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을 보여 줄 것이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">6</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 중구</span>서울 물순환 시민문화제 2020</h2>
                                <p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물 절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시 대표 축제이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">5</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>비건페스타 2020</h2>
                                <p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를 지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날 수 있는 국내 최대 비건 전문 전시회입니다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">4</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>여우樂 페스티벌 2020</h2>
                                <p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을 넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의 도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는 공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을 보여 줄 것이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">3</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 중구</span>서울 물순환 시민문화제 2020</h2>
                                <p>올해 3회차로 개최되는 2018 서울 물 순환시민문화제는 물 순환의 의미, 빗물의 중요성 환기 및 물 절약을 실천하는 환경 시민을 육성하고 길거리, 볼거리, 체험거리 등이 풍성하고 다양하고 재미있는 여름철 서울시 대표 축제이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">2</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>비건페스타 2020</h2>
                                <p>3회 비건페스타가 오는 8월 SETEC에서 개최됩니다. 동물, 환경, 건강을 생각하는 착한소비를 지향하는 제3회 비건페스타는 식품&음료, 패션&뷰티, 생활용품, 친환경 기자재 등 비건 소비재를 한자리에서 만날 수 있는 국내 최대 비건 전문 전시회입니다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                        <tr onclick="location.href='areaEvent_view.jsp';">
                            <td class="number">1</td>
                            <td class="sum"><img src="/anavada/resources/images/test/testImg.jpg" width="150px" height="150px"></td>
                            <td class="title">
                                <h2><span>서울시 종로구</span>여우樂 페스티벌 2020</h2>
                                <p>올해로 11회를 맞이하는 여우락 페스티벌은 전통의 뿌리를 이어오는 명인들의 내공과 우리 음악의 외연을 넓힌 실력파 앙상블의 연주로 믿고보는 무대를 선보인다. 끊임없이 우리 음악의 가능성을 실험하는 아티스트들의 도전적이고 새로운 무대를 가장 먼저 확인할 수 있으며, 대중성 있는 음악과의 협업으로 에너지를 뿜어내는 신나는 공연까지 만날 수 있다. 2020 여우樂 페스티벌은 전통에서부터 현재에 이르는 우리 음악의 다양한 스펙트럼을 보여 줄 것이다.</p>
                                <ul>
                                    <li>작성자 : 홍길동</li>
                                    <li>축제기간 : 2020.07.30 ~ 2020.08.30</li>
                                    <li>조회수 : 30</li>
                                    <li><i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i></li>
                                </ul>
                            </td>
                        </tr>
                    </tbody>
                </table>


                <div class="list-no">
                    <p><img src="/anavada/resources/images/btnIcn/icn_big_listNo.png" alt="" title="" /></p>
                    <h1>목록이 없습니다.</h1>
                </div>


                <div class="write-btn">
                    <a href="areaEvent_write.jsp">글쓰기</a>
                </div>

            </div>


            <!-- 리스트 끝 -->


            <!-- 페이지넘버 -->
            <dl class="list-paging pb80">
                <dd>
                    <a href="#none"><i class="glyphicon glyphicon-menu-left"></i></a>
                    <a href="#none" class="active">1</a>
                    <a href="#none">2</a>
                    <a href="#none">3</a><!-- 활성화 class="active" -->
                    <a href="#none">4</a>
                    <a href="#none">5</a>
                    <a href="#none"><i class="glyphicon glyphicon-menu-right"></i></a>
                </dd>
            </dl>
            <!-- 페이지넘버 끝 -->

        </div>
        <!-- 컨텐츠 끝 -->

        <%@ include file="../include/footer.jsp" %>
    </div>
</body>
</html>