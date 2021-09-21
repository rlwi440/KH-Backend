select * from employee; 
/*
1. 직원명과 이메일 , 이메일 길이를 출력하시오
		  이름	    이메일		이메일길이
	ex) 	홍길동 , hong@kh.or.kr   	  13
*/
SELECT
    emp_name          이름,
    email,
    length(email)     이메일길이
FROM
    employee;
/*
2. 직원의 이름과 이메일 주소중 아이디 부분만 출력하시오
	ex) 노옹철	no_hc
	ex) 정중하	jung_jh
*/
SELECT
    emp_name 이름,
    substr(email, 1, instr(email, '@') - 1)
FROM
    employee;

/*
3. 60년대에 태어난 직원명과 년생, 보너스 값을 출력하시오 
	그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오
	    직원명    년생      보너스
	ex) 선동일	1962	0.3
	ex) 송은희	1963  	0
*/
SELECT
    emp_name                       직원명,
    19
    || substr(emp_no, 1, 2)           년생,
    nvl(bonus, 0)                   보너스
FROM
    employee
WHERE
    substr(emp_no, 1, 1) = '6';     --60년대생 숫자 지정  조건문 
/**
4. '010' 핸드폰 번호를 쓰지 않는 사람의 수를 출력하시오 (뒤에 단위는 명을 붙이시오)
	   인원
	ex) 3명
*/
SELECT
    COUNT(*)
    || '명' 인원수
FROM
    employee
WHERE
    substr(phone, 1, 3) != '010';           --010을 사용하지 않는사람 

/**

5. 직원명과 입사년월을 출력하시오 
	단, 아래와 같이 출력되도록 만들어 보시오
    **/
SELECT
    emp_name  직원명,
    EXTRACT(YEAR FROM hire_date)
    || '년'
    || EXTRACT(MONTH FROM hire_date)
    || '월'     입사년월
FROM
    employee;
    
/**
--6.사원테이블에서 다음과 같이 조회하세요.
--[현재나이 = 현재년도 - 태어난년도 +1] 한국식 나이를 적용.
-------------------------------------------------------------------------
--사원번호    사원명       주민번호            성별      현재나이
-------------------------------------------------------------------------
--200        선동일      621235-1*******      남      57
--201        송종기      631156-1*******      남      56
--202        노옹철      861015-1*******      남      33
*/

SELECT
    emp_id                             사원번호,
    emp_name                           사원명,
    emp_no                             주민번호,
    CASE substr(emp_no, 8, 1)
        WHEN '1'  THEN
            '남'
        WHEN '3'  THEN
            '남'
        ELSE
            '여'
    END                                성별,
    CASE
        WHEN substr(emp_no, 8, 1) IN ( '1', '2' ) THEN
                1900
        ELSE
            2000       -- then 1900년도 else 2000 기본값 지정 
           END
    + substr(emp_no, 1, 2)             출생년도,
    EXTRACT(YEAR FROM sysdate) - (
        CASE
            WHEN substr(emp_no, 8, 1) IN ( '1', '2' ) THEN
                1900
            ELSE
                2000
        END
        + substr(emp_no, 1, 2) ) + 1        현재나이
FROM
    employee;

            
/*

7. 직원명, 직급코드, 연봉(원) 조회
  단, 연봉은 ￦57,000,000 으로 표시되게 함
     연봉은 보너스포인트가 적용된 1년치 급여임
*/
SELECT
    emp_name                                                                         직원명,
    job_code                                                                         직급코드,
    to_char((salary +(salary * nvl(bonus, 1))) * 12, '999,999,999,999')               "연봉(원)"
FROM
    employee;

/*
8. 부서코드가 D5, D9인 직원들 중에서 2004년도에 입사한 직원중에 조회함.
   사번 사원명 부서코드 입사일
*/
SELECT
    emp_id     사번,
    emp_name   사번명,
    dept_code  부서코드,
    hire_date  입사일
FROM
    employee
WHERE
    dept_code IN ( 'D5', 'D9' )
    AND substr(hire_date, 1, 2) = '04';

/*
9. 직원명, 입사일, 오늘까지의 근무일수 조회 
    주말도 포함 , 소수점 아래는 버림
*/
SELECT
    emp_name                       직원명,
    hire_date                      입사일,
    trunc(sysdate - hire_date)     근무일수
FROM
    employee;

/*

10. 직원명, 부서코드, 생년월일, 만나이 조회
   단, 생년월일은 주민번호에서 추출해서, 
   ㅇㅇㅇㅇ년 ㅇㅇ월 ㅇㅇ일로 출력되게 함.
   나이는 주민번호에서 추출해서 날짜데이터로 변환한 다음, 계산함
   */
   SELECT
    emp_no
FROM
    employee;

SELECT
    emp_name   직원명,
    dept_code  부서코드,
    CASE
        WHEN substr(emp_no, 8, 1) IN ( '1', '2' ) THEN
                1900
        ELSE
            2000       --기본값 
        END
    + substr(emp_no, 1, 2)
    || '년'
    || substr(emp_no, 3, 2)
    || '월'
    || substr(emp_no, 5, 2)
    || '일'      "생년월일", -- emp_no,1,2 || '년 ' sub str(emp_no.3,2)
        EXTRACT(YEAR FROM sysdate) - (
        CASE
            WHEN substr(emp_no, 8, 1) IN ( '1', '2' ) THEN
                1900
            ELSE
                2000       --기본값
            END
        + substr(emp_no, 1, 2) ) - (
        CASE
            WHEN ( EXTRACT(MONTH FROM sysdate) - substr(emp_no, 3, 2) = 0 )
                 AND ( EXTRACT(DAY FROM sysdate) - substr(emp_no, 5, 2) < 0 ) THEN
                1
            ELSE
                2
        END
    )          "만 나이"
FROM
    employee;

/*
11. 직원들의 입사일로 부터 년도만 가지고, 각 년도별 입사인원수를 구하시오.
  아래의 년도에 입사한 인원수를 조회하시오. 마지막으로 전체직원수도 구하시오
  => decode, sum 사용
	-------------------------------------------------------------------------
	 1998년   1999년   2000년   2001년   2002년   2003년   2004년  전체직원수
	-------------------------------------------------------------------------
*/
SELECT
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 1998, 1)), 0)                    "1998년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 1999, 1)), 0)                    "1999년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 2000, 1)), 0)                    "2000년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 2001, 1)), 0)                    "2001년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 2002, 1)), 0)                    "2002년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 2003, 1)), 0)                    "2003년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 2004, 1)), 0)                    "2004년",
    nvl(SUM(decode(EXTRACT(YEAR FROM hire_date), 0, 0, 1)), 0)                     "전체직원수"      --버튼 지정  24 명
FROM
    employee;
/*
12.  부서코드가 D5이면 총무부, D6이면 기획부, D9이면 영업부로 처리하시오.(case 사용)
   단, 부서코드가 D5, D6, D9 인 직원의 정보만 조회하고, 부서코드 기준으로 오름차순 정렬함.
*/
SELECT
    emp_name  직원명,
    CASE
        WHEN dept_code = 'D5'    THEN
            '총무부'
        WHEN dept_code = 'D6'    THEN
            '기획부'
        WHEN dept_code = 'D9'    THEN
            '영업부'
    END       부서
FROM
    employee
WHERE
    dept_code IN ( 'D5', 'D6', 'D9' )
ORDER BY
    dept_code;