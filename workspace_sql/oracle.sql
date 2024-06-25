--한줄주석
/*범위주석*/
select 
    * --모든 컬럼 
from 
    emp;
--sql developer 자동 정렬 단축키: Ctrl + F7    
select 
    empno, ename, deptno --조회하고 싶은 컬럼column 명들
from 
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
--한줄복사 단축키 : Ctrl + Shift + d 

--distinct : select에서 중복되는 자료를 제거해준다
select distinct deptno from emp;
select distinct job from emp;

select deptno, job from emp;
-- column컬럼이 여러개인 경우 컬럼들의 조합이 중복되는 걸 제거한다
select distinct deptno, job from emp;


-- null과 연산하면 무조건 null 이다 
select ename, sal, sal*12+comm, comm from emp;

-- 컬럼 명에 별칭 사용
-- " 생략가능
-- as 생략가능
-- 별칭안에 띄어쓰기가 있는 경우 "쌍따옴표 생략불가
-- 가능하면 띄어쓰기보다 _언더바를 넣자
select ename, sal, sal*12+comm as new_SAL, comm from emp;

-- order by : 해당 컬럼으로 정렬
-- 오름차순: asc를 붙이는 데 생략가능 
-- 내림차순: desc 
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by 첫번째 걸로 정렬하고 
--그 중에 같은 게 있다면 다음 걸로 정렬
select * from emp
order by deptno asc, sal desc;
-- deptno 10 안에서 sal이 내림차순 정렬되어있음 
-- deptno 이걸로 먼저 적용하고 1순위, 그 중에서 중복되는 게 있다면 sal 2순위

select distinct job from emp
order by job asc;
--order by job ; 해도 됨 asc 생략가능하니까

select * from emp
where deptno = 30;

-- 사원번호가 7782인 사원정보만 나오도록
select * from emp
where empno = 7782;

--급여 정보가 2000이상인 것
select * from emp 
where sal >= 2000
order by sal;

--홀따옴표 ' 써야함
select * from emp
where ename = 'KING';

-- AND 연산자
select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

--연봉이 2000이상 3000미만 
select * from emp 
where sal >= 2000 and sal < 3000;

select * from emp 
-- where sal != 3000; 아래랑 같은 뜻 
where sal <> 3000;

--2000미만 이거나 3000이상인 것들을 선택하려면 
-- (sal >= 2000 and sal < 3000)이게 아닌걸 뽑으면 됨
select * from emp 
where not(sal >= 2000 and sal < 3000);

select * from emp 
where job in ('MANAGER','SALESMAN','CLERK');

--위와 반대되는 코드, not을 붙이려면 in 앞에 사용해야 함 
select * from emp 
where job not in ('MANAGER','SALESMAN','CLERK');

--6월 21일 
select * from emp
where sal between 2000 and 3000;

select * from emp 
where sal not between 2000 and 3000;

--s또는 s로 시작하는 모든 것
-- %는 어떤것이든 상관없음 
select * from emp
where ename like 'S%';
-- A로 시작하는 것 
select * from emp
where ename like 'A%';
--사원이름의 두 번째 글자가 L인 사원
-- _는 딱 한글자인데 어떤 글자든지 상관 없음 
--세 번째 글자가 L인걸 찾으려면 '__L%';
select * from emp 
where ename like '_L%';

--글자가 4글자인 이름 
select * from emp
where ename like '____';

select * from emp 
where ename like '%AM%';
--커미션이 400이하 
--null이 빠져있다 비교가 되지 않기때문에
select * from emp 
where comm <= 400;
-- null 만 뽑고 싶어 
select * from emp
where comm = null;
--null 판단해주는 것이 is null;
select * from emp
where comm is null;
--null 이 아닌 것을 출력하려면 is not null 
select * from emp
where comm is not null;
-- emp에서 deptno 가 10 또는 20인 사원의 
-- empno, ename, sal, deptno를 출력 
select empno, ename, sal, deptno from emp
--where deptno= 10 or deptno=20; 이렇게 써도 되고 아래처럼 써도 되고
where deptno in (10,20);

--서로 다른 조회 결과물을 합쳐준다
--단, 조회한 컬럼의 개수와 타입이 같아야 한다.
select empno, ename, sal, deptno from emp
where deptno = 10
union --중간에 union을 쓰면 합쳐진다
select empno, ename, sal, deptno from emp
where deptno = 20;

--이렇게 쓰면 중복되는 것이 제거되고 3줄만 나옴
-- union은 합쳐주는 건데 중복되는 것은 삭제되니까 혼란이 와서 union all 
select empno, ename, sal, deptno from emp
where deptno = 10
union 
select empno, ename, sal, deptno from emp
where deptno = 10;

-- union all: 중복에 관계없이 합쳐준다
-- union을 사용했을 때 세 줄만 나오던게 union all쓰니까 여섯줄이 나옴
select empno, ename, sal, deptno from emp
where deptno = 10
union all 
select empno, ename, sal, deptno from emp
where deptno = 10;

--125p 문제 풀어보기 
--Q1
select * from emp
where ename like '%S'; 
--Q2
select empno, ename, job, sal, deptno from emp
where deptno = 30 and job = 'SALESMAN';

--Q3 
--집합연산자 사용하지 않은 방식
select empno, ename, job, sal, deptno from emp
--where deptno in (20,30) and sal > 2000; 이렇게해도되고 or써도됨
where (deptno = 20 or deptno = 30) and sal > 2000;
--집합연산자 사용방식(union)
select empno, ename, job, sal, deptno from emp
where deptno = 20 and sal > 2000
union all
select empno, ename, job, sal, deptno from emp
where deptno = 30 and sal > 2000;

--Q4
--급여sal 값이 2000이상 3000이하 이외의 값만 출력
select * from emp
where not (sal >= 2000 and sal <= 3000);

--Q5 
select ename, empno, sal, deptno from emp
--조건1 사원이름에 E가 포함
--where ename like '%E%';
--조건2 30번 부서의 사원
--where deptno = 30;
--조건3 급여정보가 1000에서 2000이 아닌
--where sal not between 1000 and 2000;
where ename like '%E%' 
and deptno = 30 
and sal not between 1000 and 2000; 

--Q6 
select * from emp
--select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp
--조건1 추가 수당이 존재하지 않음
--where comm is null
--조건2 상급자가 있고
--empno사원번호와 mgr직속상관사원번호가 같지 않은 사람을 찾으면 되겠다
--where empno <> mgr;
--조건3 직책이 MANAGER, CLERK인 사원 
--where job = 'MANAGER' or job = 'CLERK'
--조건4 이름의 두 번째 글자가 L이 아닌 사원의 정보 
--where ename not like '_L%'
where comm is null 
and empno <> mgr 
and (job = 'MANAGER' or job = 'CLERK' )
and ename not like '_L%';

select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- upper, lower는 대소문자 구분 없이 like할 때 딱 좋다
select * from emp 
where lower(ename) like lower('%Mi%');

-- length는 길이
select ename, length(ename)
from emp;

--이름의 길이가 5글자 이상인 사람찾기
select * from emp
where length(ename) >= 5  ;

select length('한'), lengthb ('한') from dual;

--substr : 대상이 되는 문자, 시작위치, 가져올 개수
--   가져올 개수를 안쓰거나 너무 크면 끝까지 가져온다
select job from emp;
--job을 첫번째부터 2개만 잘라라
--job을 세번째부터 두 개만 잘라라
-- 마이너스 붙이면 뒤에서부터 셀 수 있다
select job, substr(job,1,2), substr(job,3,2), substr(job,5),
ename, substr(job, -3,2),
length(lower(substr(job,5,100)))
from emp;

--마스킹 처리
select job, replace (job, 'A', '*') from emp;

select job, 
length(job), 
(length(job)+1)/2,
-- 2.5부터 한 개만 가지고 올거야 내림 또는 버림
substr (job, (length(job)+1) /2,1),
    replace(
        job, 
        substr(job,(length(job)+1)/ 2,1),
        '*'
        )
from emp;

-- LPAD: 대상이 되는 문자, 전체 자릿수, 채울 문자 
-- 채울문자 생략시 공백문자
select 
    job,
    --job을 10글자로 만들고 빈 공간을 #으로 만들예정
    lpad(job,10,'#'),
    lpad(job,4,'#')
from emp;

--가운데 정렬처럼 보이게 해보기
select 
    job, length(job), 15-length(job)
from emp;

select 
    rpad(
        lpad(
            job,
            (16-(length(job)))/2+length(job),
    '*'
    ),
    (16-(length(job)))/2+length(lpad(
    job,
    (16-(length(job)))/2+ length(job),
    '*')
    ),
    '*')

from emp;

select empno || ename || '님'
from emp;

select 
    '  a b c    ',
    trim('  a b c    ')
from dual;

--실습문제1 (주민번호)
select 
    '210621-3123456',
    '210621-3******'
from dual;
--풀이1
select
    '210621-3' || '******',
    substr( '210621-3123456',1,8)||'******'
from dual;
--풀이2 rpad 사용하기
select
    '210621-3' || '******',
    substr( '210621-3123456',1,8)||'******',
    rpad('210621-3',14,'*')
from dual;

/*실습문제2 
사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
정답의 예: WARD -> WA**, MARTIN -> MA****
쉬운버전: 앞 두글자 + '***'
*/
--앞에 두자리만 나오게 substr 이용해서 자르고 
select 
--나머지는 rpad더해서 *표시하자 
--전체이름길이에서 첫번째 두글자 제외한 나머지가 *로 보이게
rpad(substr(ename,0,2),length(ename),'*')
--rpad(substr(ename,0,2),(length(ename)),'*')
from emp;

--실습문제3
--앞글자 하나만
--WARD -> *ARD, MARTIN -> *ARTIN
select replace(ename,substr(ename,1,1),'*')
from emp;
--앞글자 하나만 빼놓기
--substr(ename,1,1)
--앞글자를 뺀 나머지를 찾아보기
select '*'||substr(ename,2,100)
from emp;

select 
lpad(
substr(ename,2),length(ename),'*')
from emp;

--실습문제4
--두번째 글씨만 *
--WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename,1,1)||'*'||substr(ename,3)
from emp;

select 
substr(ename,1,1)||
lpad(substr(ename,3),length(ename)-1,'*')
from emp;

--실습문제5
--가운데글씨만 *
--MARTIN -> MA*TIN, SCOTT -> SC*TT
select substr(ename,1,2)||'*'||substr(ename,4,100)
from emp;



--이거 아래 이상함
select 
substr(ename,1,2)||
lpad(
substr(ename,-2),length(ename),'*')
from emp;
--6월 24일 
select trunc(1234.5678),
    trunc(1234.5678, 2),
    trunc(1234.5678,-2),
    trunc(-12.34)
from dual;

select 
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

-- sysdate : 지금 오라클 PC의 시간이 나옵니다. 
--강사 pc는 9시간 차이 난다 (영국 0시 기준 한국 +9시)
-- 날짜 정보 중 일부만 select로 표시 됨
select sysdate, sysdate+1, sysdate-1 from dual;

--컬럼에  +를 적으면 모두 숫자로 변경해서 적용함 
--sysdate+'1' 해도 숫자로 적용 
--|| 숫자도 문자로 적용 

select to_char(sysdate, 'yyyy"년" mm"월" dd"일" HH24"시"MI"분"SS"초"') as 현재날짜시간
--9시간 더하기 sysdate+(9/24)
from dual;
--5월 7일부터 지금까지 몇일이 지났는지 
select 
    sysdate-to_date('2024-05-07','yyyy-mm-dd')
from dual;

--null일 때는 -1
select 
    comm, 
    nvl(comm,-1),
    sal,
    -- null에 어떤 것을 더하면 null 이 나옴
    sal + comm,
    -- null인 애들은 0 처리해라 
    sal + nvl(comm,0)
from emp; 
--null이거나 0인 애들만 출력
select * from emp 
where nvl(comm,0) =0;

--comm이 null일 때 N/A를 표시하고 null이 아닐 땐 comm을 보여주는데 
--n/a는 문자 comm은 숫자라서 형변환 했음
select 
    case 
        when 
            comm is null 
            then 
                'N/A'
        else    
            to_char(comm)
--        '' || comm
    end new_comm
from emp; 

--nvl 같이 해보기
select 
    case 
        when 
            comm is null 
            then 
                0
        else    
            (comm)
    end new_comm
from emp; 
--174p 문제 풀어보기 
-- Q2 하루급여와 시급을 계산 
select empno, ename, sal,
trunc((sal/21.5),2) as "day_pay", 
round(((sal/21.5)/8),1) as "time_pay"
from emp;
-- Q3
select empno, ename, 
to_char(hiredate, 'yyyy/mm/dd') hiredate,
 to_char((next_day((add_months(hiredate,3)),'월요일')),'yyyy-mm-dd')as "R_JOB",
 case
 when comm is null then 'N/A' 
 else to_char (comm)
 end as comm
 --nvl (to_char(comm), 'N/A') 
from emp;
-- case
--    when comm is null then 'N/A'
-- end

-- Q4
select empno, ename, 
nvl(mgr,0),
 case 
 when mgr is null then '0000'
 when mgr like '75__' then '5555'
 when mgr like '76__' then '6666'
 when mgr like '77__' then '7777'
 when mgr like '78__' then '8888'
 else to_char(mgr)
 end 
from emp;

--count처럼 null은 제외됨 
--count는 *를 많이 씀 
select sum(sal), count(sal), count(*), count(comm) from emp;

select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

--부서별 급여 총 합 표시
select sum(sal), avg(sal) from emp
where deptno=10
union all 
select sum(sal), avg(sal) from emp
where deptno=20
union all 
select sum(sal), avg(sal) from emp
where deptno=30;

-- distinct 처럼 중복을 제거, 분류해줌
-- select에는 group by한 것이나 다중행 함수(집계 함수)
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno,sum(sal), count(*) from emp
group by deptno, empno;

select deptno, job, count(*) 
from emp
group by deptno, job
--order by는 group by에 있는 것들만 적을 수 있다
--select에 있는 걸로 order by 해야한다
order by deptno, job;

--HAVING: group by를 통한 where절 느낌(group by 조건절)
--      : group by에서만 사용된다
-- 집계함수를 조건으로 걸고 싶은 경우에 사용 
--group by없이 having은 존재할 수 없다
select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal) >= 2000;
--    having count(*) >=2;
    having deptno = 20;
    
--212p 문제 Q1
select 
deptno,
trunc(avg(sal),0),
max(sal),
min(sal),
count(deptno) cnt
from emp
group by deptno;
--Q2. 인원수 구하기
select job,
count(ename)
from emp
-- where count(*) >= 3
group by job
    having count(ename)>=3;

select * from dept;

--6월 25일 화요일 
--조인배우기 전에 셀렉트부터 오더바이 순서
/*5*/select job, count(*) cnt
/*1*/from emp 
/*2*/where sal> 1000
/*3*/group by job
/*4*/having count(*) >= 3
/*6*/order by cnt desc;
--215p 조인 : 두 개 이상의 테이블을 연결하여 하나의 테이블처럼 출력 
select * from emp, dept
order by empno;
--총 목록이 56, 조합할 수 있는 모든 조합을 보여줌 
