# 1. PREVIEW & 개요
[KH]스마트 콘텐츠 융합 응용SW 엔지니어 양성과정 중 파이널프로젝트 이며 "와디즈 " 라는사이트 클론코딩으로 구현한 사이트입니다 
구현기간:2021/ 06/03 ~ 2021/07/08 입니다.

### [<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1575521120/noticon/i5eacjfzdcmshu5xfqtc.png" width="120">](http://interact-funding.kro.kr/)  

##### 이미지를 클릭시 구현한사이트 로 이동합니다.

## 2. 프로젝트 요구사항

### - 프로젝트 전반

벤치마킹 크라우드 펀딩 와디즈를 웹 어플리케이션을 구현하였고,

자금조달의 문제로 인해 실행되지 못하는 아이디어 와 자금이 충분하지만

투자하고 싶은 상품이 없어서 곤란한 것들을 빛나는 아이디어를 가진 다양햔제품들 실현을 돕기위한 Interact Funding 애플리케이션 구현합니다.

- 담당 기능
<img src="https://user-images.githubusercontent.com/62824389/124746659-16f3e500-df5c-11eb-9ab6-e12f6bfddf0f.png" width="700">

- 담당 기능 노션정리 내용 사이트 입니다.

[<img src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1570106347/noticon/hx52ypkqqdzjdvd8iaid.svg" width="120">](https://www.notion.so/IF-Interact-Funding-73ae8b6478fc475887dee87398b70571)
 
## 3.역할 및 담당기능

### - 역할

프로젝트 팀원 

### - 담당 기능

메인페이지 인 펀딩 참여하기 및 세부페이지 이동 과 실시간랭킹 최근 살펴본 펀딩,오픈참여하기 및 메인페이지 모든 기능구현

## 4. 개발 목표 및 설계 주안점

1.Spring Framework, MVC 패턴, JQuery의 활용 능력 습 득

2.Bootstrap Framework   프레임워크 활용능력 습득

3.Gson 사용법 활용 능력 습득

4.JSTL 동적변수를 활용능력습득

## 5. 핵심 구현 기술 설명

- 구현기능

    1.여러개의 이미지를 버튼통해 슬라이드 효과를 넘길수가 있으며,

    해당 이미지 클릭시 해당 배너에 맞는 이벤트 게시물 로 넘어간다.

    2.진행중인 펀딩중 최근 생성일 기준으로 6개의 펀딩 표시를 하였으며,

    펀딩 세부 페이지 로 넘어갑니다.

    3.최근생성된 페이지를 ajax를 통해 비동기식으로 실시간으로 html 으로 전달합니다.

    4.조회수,좋아요 가 있으며, Jquery인 show() ,hide() 이펙트(effect) 효과 를

    각 기준시 실시간랭킹으로 변경해줍니다.

    5.세션을 이용하여 최근 살펴본 펀딩리스트를 제공한다.

    6.최근생성일 기준으로 얼리버드 세부페이지 연결 할수있는 리스트를 제공하며

    버튼클릭시 슬라이드 효과 한장씩 넘길수 있도록 구현하였습니다.

    7.프로젝트 오픈 페이지로 이동하도록 구현하였습니다.

- 화면구성

    Bootstrap 의 carousel,Responsive images 을  div,button 설정을 적극적을 활용하였고, 깔끔한 화면 처리를 위해  layout을 1300px로 구현 하였습니다. color: #00a2a2; 색상으로 통일하였습니다.

    margin 및 padding의 상세 설정이 되어있습니다.


## 6. 구현 기간

### - 프로젝트 기획 기간

2021.06.03~2021.06.10

### - 프로젝트 구현 기간

2021.06.03~2021.07.08

## 7. 사용 언어 및 도구

   ### O/S : Windows 10
   
   Server : Tomcat 9.0
   
   DBMS : Oracle 11g
   
   개발 언어 : JAVA, JSP, JavaScript, SQL, HTML5, CSS3
   
   개발 툴 : STS4, SQL Developer, Visual Studio Code
   
   Framework/library
   
   Spring, MyBatis, Bootstrap, CoolSMS , Mail-1.4.7, ojdbc6, summerNote, ImPort, taglibs, spring-webmvc
   
   카카오 지도/로컬, Scheduler (자동 알림), 카카오 OAUTH2.0

## 8.프로젝트 참여소감
## Spring Framework 와 bootstrap framework  MVC 패턴 JAVA(JSP),HTML+CSS,JS Jquery를  실력이 향상 되었습니다.

원하는 기능을 완벽히 구현하였고, 구현하는데 처음에는 어렵고 막막하기도 했었지만 완벽한 기능을 구현해서 좋았습니다. 하지만 프로젝트를 통해 Ajax 비동기식 처리 datatype 인 JSON,HTML ,XML 보내는 방식을 확실하게 알게 되었고,Session을 이용한 Gson을 Json 방식도 알게 되었습니다. Bootstrap 을 사용하면서 HTML+CSS 기본적인 구조를 한 번 더 확실하게 알게 되었으며, 파이널을 진행하면서 레이아웃 틀 과 ERD 보는 방법을 정확하게 알게 되었습니다. 다만 아쉬웠던 부분은 레이아웃에 디테일 하게 보는 방법이 조금 아쉬웠습니다. 또한, 파이널을 진행하면서 역할분담과 소통이 잘되었으며, 세미프로젝트를 진행하면서 아쉬웠던 가독성과 능력을 많이보여준 것 같아재미있었고 ,즐겁게 파이널을 진행을 한 것 같아 좋았습니다. 개인적으로 아쉬웠던 부분은레이아웃의 디테일 과 SQL 서브쿼리 join부분이 아쉬웠습니다. 미비한 부분을 훨씬 더 많은 공부를 하며 기술을 향상할 수 있도록 노력하겠습니다.


## 9.별첨

# Contributors
[<img src="https://user-images.githubusercontent.com/62824389/124744204-7ac8de80-df59-11eb-86ff-28b65ca19886.jpg" width="120">](https://github.com/kimdia200)
[<img src="https://user-images.githubusercontent.com/62824389/124744203-7ac8de80-df59-11eb-8ca8-db42233b9833.jpg" width="120">](https://github.com/hohyuncheon)
[<img src="https://user-images.githubusercontent.com/62824389/124744193-78668480-df59-11eb-9eae-8e0c67a20689.jpg" width="120">](https://github.com/KIMJOOYEON97)
[<img src="https://user-images.githubusercontent.com/62824389/124744198-7997b180-df59-11eb-9aab-48a4b4939e28.jpg" width="120">](https://github.com/dygksqkr12)
[<img src="https://user-images.githubusercontent.com/62824389/124744201-7a304800-df59-11eb-89ec-e78f9cc84800.jpg" width="120">](https://github.com/onreverse01)
[<img src="https://user-images.githubusercontent.com/62824389/124744200-7a304800-df59-11eb-9ec3-537d0ab215ac.jpg" width="120">](https://github.com/rlwi440)

