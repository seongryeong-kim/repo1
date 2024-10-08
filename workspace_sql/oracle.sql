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

--6월 25일 화요일 
select * from dept;
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

select emp.ename, dept.loc from emp, dept
where emp.deptno = dept.deptno
-- .은 소유격 a.b: a(테이블)가 가지고 있는 b(컬럼)
--(emp가 가지고 있는 deptno)와 (dept가 가지고 있는 deptno)가 같은 것을 가져와라
--but deptno는 우연히 이번만 같은 것 
--얘랑 얘랑의 관계를 알려주고 그래서 관계형 
order by empno;
--테이블 두 개 이상 조회할 때 관계를 꼭 알려줘야 원하는 정보만 출력된다
--전체 테이블 수 - 1개의 조건이 적당하다 
--전체 테이블 두개(emp, dept)에 최소 한개의 조건(emp.deptno = dept.deptno) 
--x + y = 10 이걸 풀려면 x나 y값 둘 중 하나를 알아야 정확한 것처럼

--테이블의 별칭설정
select *
from emp e, dept d
--emp를 e로, dept를 d로 이름을 바꿈
--이렇게 별칭을 설정한 경우에는 원래이름을 쓸 수 없다.
where e.deptno = d.deptno;

--별표*와 컬럼을 같이 쓰는 경우 *표 앞에 어떤 테이블의 모든 것인지 써줘야한다
--FYI 실무에서는 *를 잘 사용하지 않는다
select ename, e.*, d.* 
from emp e, dept d
where e.deptno = d.deptno;

select ename, emp.* from emp;
--등가조인과 비등가조인 
select * from salgrade;
--스미스의 등급을 알아보기 
select *
from emp e, salgrade s
where e.sal >= s.losal and e.sal <=s.hisal;

select * from emp;

--자체조인
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
--smith와 smith의 상사
where e1.mgr = e2.empno;
--king은 상사가 null이라서 안나옴
--내 상사가 누군지 내 부모글이 누군지 이런식으로 하면 무한 댓글을 만들 수 있다 
--e1과 e2는 내용은 같지만 전혀다른거라고 생각하면 쉽다 

--외부조인 
--null도 나오게 할 수 있다 
--뒤에 다른거 배운 후 에 배울예정 

-- 232p 어느 db든 통하는 것 
-- natural join: 실무에서 안쓰임, 머리에서 지워도 됨 

--join using- using에는 둘 다 같은 컬럼명이 있는 경우만 쓸 수 있다
select * 
from emp join dept using (deptno);

--234p join on: on뒤에 where 조건
select * 
from emp join dept on(emp.deptno = dept.deptno);

select *
from emp e1 join emp e2 on (e1.mgr = e2. empno);
--여전히 king이 빠진다

--left outer join을 사용하니 king이 나옴
--null값이 출력된다
--left outer join이란? 왼쪽 테이블을 모두 출력하는 걸 보장해준다
select *
from emp e1 left outer join emp e2 on (e1.mgr = e2. empno);
--아래에 이렇게 right outere join쓰면 e2가 다 나오는 걸 보장해준다
--from emp e1 right outer join emp e2 on (e1.mgr = e2. empno);

--Quiz 1
-- empno, ename, dname, loc 출력: 결과 14줄 
select e.empno, e.ename, d.dname, d.loc from emp e, dept d
where e.deptno = d.deptno;

--Quiz 2
--사번, 이름, 부서명, 급여등급을 출력: 결과 14줄
--empno, ename, dname, salgrade
select 
e.empno,
e.ename,
d.dname,
s.grade
from emp e,dept d,salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal<=s.hisal;
--한줄한줄 의미있는 게 좋다, 가독성에 신경쓸 것 
--두 번째 방법 
select 
e.empno,
e.ename,
d.dname,
s.grade
from salgrade s, emp e join dept d using(deptno)
where (e.sal >= s.losal and e.sal<=s.hisal);
--세번째 방법
select 
e.empno,e.ename,d.dname,s.grade
from emp e 
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal<=s.hisal);

--Quiz 3
--상사보다 월급이 높은 사원의 이름, 급여, 상사 이름, 매니저 급여
--ename, sal, mgr ename, mgr sal 
select * from emp;

select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno and e1.sal >= e2.sal 
order by e1.ename desc;
--선생님 풀이 
select e1.ename, e1.sal, e1.mgr, e2.empno, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal >= e2.sal;

--and 239p 문제 
--Q1. 급여 2000초과 부서정보, 사원정보 
select d.deptno, d.dname, e.empno, e.ename, e.sal from emp e, dept d
where e.deptno = d.deptno and sal > 2000
order by deptno;
--Q2. 각 부서별 평균급여, 최대급여, 최소급여, 사원수 
select d.deptno, d.dname, trunc(avg(e.sal)), max(e.sal), min(e.sal), count(d.deptno)
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname
order by deptno;
--Q3. 부서정보, 사원정보를 부서번호, 사원이름 순으로 정렬 
select d.deptno, d.dname, e.empno, e.job, e.sal
from emp e
right outer join dept d on(d.deptno = e.deptno)
order by d.deptno ,e.ename;
--선생님이랑 풀어보기
--q1
select emp.deptno, dept.dname, emp.empno, emp.ename, emp.sal from emp, dept
where  emp.deptno = dept.deptno
and sal > 2000
order by deptno;
--q2
select d.deptno , d.dname, floor(avg(sal)), max(sal),min(sal),count(*)
from emp e left outer join dept d on(e.deptno = d.deptno)
group by d.deptno, d.dname;
--q3
select *
from dept d left outer join  emp e on (e.deptno=d.deptno)
order by d.deptno;

--242p 서브쿼리
--jones의 샐러리만 
select sal from emp where ename = 'JONES';
--서브쿼리로 jones의 급여보다 높은 급여를받는 사원정보 출력
select * from emp 
where sal > (select sal from emp where ename = 'JONES');

--평균급여보다 많은 돈을 받는 사람
select avg(sal) from emp; --평균급여
select * from emp
where sal > (select avg(sal) from emp);

-- BLAKE씨보다 높은 연봉을 받는 사람들
select ename, sal from emp
where ename='BLAKE'; --blake연봉 2850

select ename, sal from emp
where sal > (select sal from emp
where ename='BLAKE');
-- JONES씨와 같은 job을 가지고 있는 사원들
select * from emp
where job = (select job from emp where ename='JONES');

select ename, job from emp
where ename='JONES';

select * from emp
where sal in (
select max(sal) from emp group by deptno);

select 
d.deptno, 
d.dname, 
e.empno,
e.ename,
e.mgr,
e.sal,
e.deptno,
s.losal,
s.hisal,
s.grade,
e1.mgr,
e1.ename
from dept d,emp e,emp e1,salgrade s
where d.deptno = e.deptno and (e.sal >=s.losal and e.sal<=s.hisal) 
and e.mgr=e1.empno
order by d.deptno, e.empno;

select * from salgrade;
--SQL-99방식으로 해보기 --
select 
d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal, e.deptno, s.losal, 
s.hisal,s.grade, e1.mgr, e1.ename
from dept d,emp e1,salgrade s left outer join  emp e on (e.deptno=d.deptno)
order by d.deptno;

--6월 26일  259p
select * from 
(select * from emp where deptno = 10);
--rownum: 줄번호, sysdate처럼 키워드임 
select rownum, emp.* from emp
--4번째 줄만 뽑아볼게 but 이렇게하면 원하는 결과가 안나옴
--where rownum = 4;
--order by는 항상 마지막에 실행됨 
--그래서 rownum이 생긴 후에 이름순으로 정렬됨
order by ename;
--from 안에도 select 가 들어갈 수 있다 
select rownum, e.* 
from
    (select * from emp order by ename
) e;

select job,count(*) from emp
group by job
having count(*) >=3;
--from 안에 테이블을 넣어놓고 where 절로 바꾸기
--아래처럼 쓸 수 있어서 실무에서 having은 잘 안씀 
select * 
from (select job, count(*)cnt from emp 
        group by job)
where cnt >=3;

with e10 as (
--e10이라는 별칭으로 저장됨, 재활용할 수 있다
select * from emp where deptno = 10
)
select * from e10;

--262p 문제풀어보기 
--Q1
--allen과 같은 job 
select job
from emp
where ename='ALLEN';
--sql
select job, e.empno, e.ename, e.sal, e.deptno, d.dname 
from emp e, dept d
where (e.deptno = d.deptno)
    and job=(select job from emp where ename='ALLEN')
order by sal desc, ename;

--Q2
--평균급여
select avg(sal) from emp;
--급여등급 
select e.sal,s.grade from emp e,salgrade s
where e.sal>=s.losal and e.sal<=hisal;
--평균보다 높은급여를 받는 사원들
select e.empno, e.ename, d.dname, e.hiredate,d.loc, e.sal, s.grade
from emp e, dept d, salgrade s
where e.deptno=d.deptno 
and sal>=(select avg(sal) from emp) 
and (e.sal>=s.losal and e.sal<=hisal)
order by sal desc, empno;
--선생님 코드 
select * from emp e, dept d, salgrade s
where 
    e.deptno = d.deptno
    and e.sal>= s.losal and e.sal>=s.hisal
    and sal> (select avg(sal)from emp)
order by sal desc, empno;

--Q3
--10번 부서에 근무하는 사원
select ename, deptno from emp
where deptno=10;
--30번 부서 직책
select job, deptno from emp
where deptno=30;
--10번 부서에 근무하는 사원 중 30번 부서에는 존재하지 않는 직책을 가진 사원
select ename, deptno, job from emp
where deptno in (select ename from emp where deptno=10)
--and
--job in(select deptno from emp where deptno=30);
--in을 쓸 줄 몰라서 완성 못함..
;
--선생님코드
select * from emp
where deptno = 10
--30번 부서에 있는 게 아닌 것들 
and job not in (select job 
                from emp 
                where deptno=30);
              
select * from emp e
left outer join dept d on (e.deptno = d.deptno)
and job not in (select job 
                from emp 
                where deptno=30)

--Q4
--다 풀었는데 grade빼고 풀었음 
--직책 salesman 최고급여
select job, max(sal) from emp
where job='SALESMAN'
group by job;
--grade 
select e.sal, s.grade from emp e, salgrade s
where e.sal>=s.losal and e.sal<=s.hisal;
--salesman 최고급여보다 높은 급여를 받는 사원
select e.empno, e.ename, e.sal, s.grade
from emp e, salgrade s
where sal>(select max(sal) from emp
where job='SALESMAN'
group by job)and (select e.sal, s.grade from emp e, salgrade s
where e.sal>=s.losal and e.sal<=s.hisal)
order by e.empno;
--선생님 코드 
select empno, ename, sal, grade
from emp e
left outer join salgrade s
on(e.sal >= s.losal and e.sal<=s.hisal)
where sal >(select max(sal)from emp where job='SALESMAN');

-- 12장 311p
create table emp_ddl(
--empno 숫자로만 관리하게 할거야 네 자릿수 제약. 5자리 못들어감
    empno number(4),
    --10 byte,한글 3 영문이나 숫자 10자리가능 
    --varchar2 제한보다 적은 글씨가 적히면 글씨 만큼의 공간만 차지
    ename varchar2(10),
    job varchar2(9),
    --empno가 숫자4자릿수인데 mgr자리에 empno가 같으니까 똑같이 써준다
    mgr number(4),
    hiredate date,
    sal number (7,2),--2는 소수점 둘째자리까지 기록할 수 있다(double)
    comm number(7,2),
    deptno number(2)
); 
select * from emp_ddl;

create table dept_ddl
as select * from dept;
--조회한 내용을 바탕으로 테이블을 만들어라

select * from dept_ddl;

create table emp_ddl_30
as select empno, ename, sal from emp where deptno=30;

select * from emp_ddl_30;

create table emp_alter
as select * from emp;
    
select * from emp_alter;

alter table emp_alter
add hp varchar2(20);
--컬럼의 이름을 변경 rename 
alter table emp_alter
rename column hp to tel;
--컬럼의 타입을 변경하는 Modify
alter table emp_alter
modify empno number(5);
--empno number(4)였는데 number(5)로 변경
--크기가 커지는건 가능(줄어드는건 불가능)
--다시 4로 바꿀 수는 없다, 4로 바꾸고싶으면 지웠다가 다시 만들기
desc emp_alter;
--컬럼 지우기 drop
alter table emp_alter
drop column tel;
--tel이라는 컬럼이 지워진 상태로 조회됨
select * from emp_alter;
--comm 컬럼지우기
alter table emp_alter
drop column comm;
--comm컬럼 지워졌나 조회해보기
select * from emp_alter;
--이름변경
rename emp_alter to emp_rename;

select * from emp_rename;
--내용물이 빠르게 지워진다 truncate
truncate table emp_rename;
--테이블 삭제 drop
drop table emp_rename;

--266p 10장 
create table dept_temp
as select * from dept;

select * from dept_temp;
--테이블에 데이터 추가 insert
insert into dept_temp (deptno, dname, loc)
--values에 내용 쓸 때는 위에 (deptno, dname, loc) 순서대로 써주기
values (50, 'DATABASE','SEOUL');

insert into dept_temp
values (60, 'network', 'Busan');
--테이블명 뒤에 ()를 생략하면 모든 컬럼
--아래처럼 작성하면 오류남 (deptno, dname, loc)순서대로 작성안해서 
insert into dept_temp
values ('network', 60, 'Busan');
--270p 테이블에 null을 넣고싶다 
insert into dept_temp
values(70,'웹',null);
--''도 null로 보이는데 그래도 null이라고 쓰자
--java에서 읽을 때 ''는 null로 인식하지 않기 때문에
insert into dept_temp
values(80,'웹',null);
--271p
insert into dept_temp(deptno,loc)
values (90,'Incheon');
select * from dept_temp;

select * from dept_temp where loc is null;
--6월 27일 
--새로운 테이블 만들기
create table emp_temp
as select * from emp;

select * from emp_temp;
--한줄 추가(데이터에 날짜데이터 입력하기)
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
        values(9999,'홍길동', 'PRESIDENT', null,'2001/01/01',5000,1000,10);
    
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
        values(1111,'성춘향', 'MANAGER', 9999,'2001/01/05',4000,null,20);
        
--274p to_date 함수를 사용하여 날짜데이터 입력하기   
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
        values(2111,'이순신', 'MANAGER', 9999,to_date('2001/01/05','yyyy-mm-dd')
        ,4000,null,20);
--sysdate를 사용하여 날짜데이터 입력하기
insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
        values(3111,'심청이', 'MANAGER', 9999,sysdate,4000,null,30);
select * from emp_temp;
--서브쿼리로 데이터 추가 
--deptno가 10인 애들 조회하고 그걸 emp_temp테이블에 중복되게 추가
insert into emp_temp
select * from emp where deptno=10; --3개의 행이 추가됨
--dept 테이블 복사해서 dept_temp2로 만들기 
create table dept_temp2
as select * from dept;

select * from dept_temp2;
--모든 location을 seoul로 바꾼다
update dept_temp2
set loc = 'seoul'; --4개의 행이 업데이트되었습니다

--롤백하면 수정 전으로 돌아갈 수 있다
rollback; --롤백완료 
--데이터 일부만 where조건을 써서 바꿔보자
--40번 데이터가 dname은 database, loc은 seoul로 바뀜
update dept_temp2
set loc='SEOUL',dname='DATAbase'
where deptno=40;
--업데이트하는 순서 (실수하지 않는)
--1.update하기 전에 select로 where조건이 정확한지 확인 
select * from dept_temp2
where deptno = 40;
--2.그 다음에 where를 그대로 복사해서 update에 붙여넣도록 하자 

--테이블에 있는 데이터 삭제하기 delete
create table emp_temp2
as select * from emp;

select * from emp_temp2
where job='MANAGER';
 --job이 manager인 3개의 행이 삭제됨
delete emp_temp2
where job='MANAGER';
--깜짝퀴즈 emp_temp2에서 급여가 1000이하인 사원의 급여를 3% 인상
--급여가 1000이하인 사원
--선생님코드 
select ename,sal, sal*1.03 from emp_temp2
where sal <= 1000;

update emp_temp2
set sal= sal*1.03
where sal <= 1000;

select * from emp_temp2;
--where가 없으니 for문처럼 한줄한줄 지운다 
delete emp_temp2;
select * from emp_temp2;

rollback;
select * from emp_temp2;

--291p 11장 트랜잭션 transaction 
-- all or nothing 모두 다 실행하거나 모두 다 실행하지 않거나 
--insert, update, delete 후 commit 하고 roll back하면 commit한 지점으로 돌아감

--문항1
select rpad(substr(empno,1,2),4,'*') as empno, ename from emp
order by empno desc;

--문항2
select e.empno, e.ename, d.dname, d.loc
from emp e, dept d
where e.deptno=d.deptno
order by d.dname desc;

--327p 13장
select * from dict;
--내가 만든 테이블들의 정보
select * from user_tables;
--index 인덱스 색인
--오름차순, 내림차순 따로 관리
--인덱스 조회를 빠르게 해준다
create index idx_emp_sal
on emp(sal);
select * from user_indexes;
--index 삭제 
drop index idx_emp_sal; 
--강제 hint 인덱스를 꼭 만들게하는
select /*+ index(idx_emp_sal)*/ -- <-오라클에서 인덱스힌트주석 
* from emp e
order by sal desc;
--plan 고급기법
--sql developer에서는 상단 세번째 아이콘 "계획설명"

create index idx_emp_empno_desc
on emp (empno desc);
--338p view : select 문 저장, 
--셀렉트문이 복잡해서 매번쓰기 귀찮아서 컴퓨터에 테이블처럼 저장함 (편리성)
--테이블을 직접 못보게 하고 (조회권한 안주고) 아예 뷰로 박제시켜두고 뷰 조회조건만 줘서 
--뷰를 통해 셀렉트로 한정된 정보를 볼 수 있게 view는 read only 조회만 가능 (보안성)
--create과 drop을 통해 view 뷰 생성, 삭제 가능 

--348p 시퀀스 번호표를 발행해준다 
--단순하게 숫자를 증가시키는 역할 for문 증감식 

--시퀀스의 원리 설명 
--emp 부서에서 제일 높은 empno 를 출력해보고 거기에 1더하기(다음신입에게 줄 번호)
select max(empno)+1 from emp_temp2;

insert into emp_temp2 (
empno,
ename
)
--7935가 나오는 select문
values (
    (select max(empno)+1 from emp_temp2),
    '신입이'
);
select * from emp_temp2;
--여기서 가장 큰 문제는 가장 큰 숫자를 찾기 위해 select를 돌려야 하는 것
--네이버 같이 회원이 큰 사이트면 엄청 오래 걸림
--이 방식의 아이디어는 최고치를 찾아서 더하기 1하는 거 틀리지는 않음 
--만약 7936만 저장하고 있고 +1+1 하는 애들이 있다면 어떨까 
--그게 시퀀스 
--시퀀스 부를 때마다 증가하는 변수 느낌 

--시퀀스 생성해보기
--시퀀스 연습하려고 새로운 테이블 생성
create table tb_user (
    user_id number, 
    user_name varchar2(30)
);
select * from tb_user;

create sequence seq_user;

--dual 테이블에서 sequence만 외워보기 
select seq_user.nextval from dual;
--조회할 때마다 숫자가 올라갈 것 
--지금 가지고 있는 숫자를 주고 증가를 시켜서 주고 
--크리에잇시퀀스랑 넥스트발만 기억해도됨
--증가없이 조회시키는 방법 currval 
select seq_user.currval from dual;

--유저아이디 시퀀스를 쓸 것 
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명1'); --유저명1을 따로 변수에 담아서 가져왔다 치자
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명2');  --아이디가 4
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명3'); --nextval 여러번 누르고 insert하니까 아이디가 7
select * from tb_user;

--6월 28일 
--index 검색 또는 조회를 빠르게 하기 위해 
--where조건을 잘 쓰고 order by를 빠르게 잘 쓰기 위해
--349p
--10000으로 시작해서 100씩 증가
create sequence seq_test 
start with 10000  --시작숫자 10000(기본값: 1)
increment by 100; --증감숫자 100(기본값: 1)

--nextval을 한번도 사용하지 않은 경우 
--currval 사용못함
select seq_test.currval from dual;
select seq_test.nextval from dual;

--377p 
--primary key, PK, 주요키, 중요키, 기본키
--not null + unique 조건 (null이 아니면서 유일해야 함)
--생성과 동시에 index도 생성해줌 
--create table에서는 primary key를 딱 하나만 지정가능
--두 개 이상의 컬럼을 primary key로 지정하려면 alter 사용  
create table table_pk(
    login_id varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );
    
desc table_pk;

select * from user_constraints --오라클이 제공해주는 사전테이블 내가만든 것의 조건
where table_name = 'TABLE_PK';
--pk는 index도 자동으로 생성해줌
select * from user_indexes;

--아래처럼 하면 오류가 난다 (위에서 제약해뒀기 때문에)
insert into table_pk (login_id,login_pwd, tel)
values(null, null, null);
insert into table_pk (login_id,login_pwd, tel)
values('id', 'pw', null); 
insert into table_pk (login_pwd, tel)
values('pw', null); 
--381p
create table table_pk3(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20),
    
    primary key(login_id, login_pwd)
    );
insert into table_pk3
values ('id1','pw1', null);
insert into table_pk3
values ('id1','pw2', null);
select * from table_pk3;
--컬럼 2개인데 하나의 제약조건으로 잡힙 , 인덱스 as well 

--384p foreign key 
create table  dept_fk(
    deptno1 number primary key,
    dname varchar2(14)
);
--foreign key, FK, 외래키, 참조키 
--대상이 되는 테이블의 컬럼과 같은 타입으로 지정해야 한다 
--deptno1를 number로 해뒀으니 아래 emp에서도 deptno를 number로 지정해줘야 함 
--컬럼명은 서로 달라도 관계 없다(보통 같게 한다)
--대상이 되는 컬럼은 pk여야 한다
create table emp_fk (
    empno number primary key,
    ename varchar2(10),
    deptno number references dept_fk(deptno1)
    --만약 컬럼 명이 같다면 컬럼명 생략가능
    --deptno number references dept_fk
    );
--아래는 foreign key 를 직접써서 하는     
create table emp_fk (
    empno number primary key,
    ename varchar2(10),
    deptno number,
    
    foreign key(deptno) references dept_fk(deptno1)
);
--emp에 자료를 삽입하면 > 삽입할 수 없다 
--왜? dept 테이블을 먼저 채워줘야 가능
insert into dept_fk
values(100,'1강의실');

insert into emp_fk values(1, '이름', 101); --저쪽에 없으니까 에러
insert into emp_fk values(1, '이름', 100);

update emp_fk set deptno = 101; --오류 
--emp_fk에서 100을 참조하고 있어서 수정, 삭제 불가
update dept_fk set deptno1 = 101; 
--이것도 오류남 emp_fk에서 100을 참조하고 있어서 수정, 삭제 불가
delete dept_fk;

delete emp_fk; --이렇게 삭제하고 update 해보면 
update dept_fk set deptno1 = 101;
--지우려면 emp 테이블부터 지워야함 

--392p default
create table table_default(
    login_id varchar2(20),
    login_pwd varchar2(20),
    tel varchar2(20) default'000-0000'
    );
insert into table_default
values ('id','pw','010-1233-4567');
insert into table_default (login_id, login_pwd)
values ('id2','pw2');
select * from table_default;

-- 8/22 오라클 문법을 사용한 대댓글 조회
SELECT 
    LEVEL, empno, LPAD(' ', 2 * LEVEL)|| ename, mgr
FROM emp
START WITH mgr IS NULL --시작점
CONNECT BY 
    empno != 7788
    AND PRIOR empno = mgr 
ORDER SIBLINGS BY empno DESC;

-- 보편적인 문법을 사용한 대댓글 조회 
-- 댓글 조회 제외하고는 잘 사용하지 않음
WITH emp_recu (lv, empno, ename, mgr) AS (
    SELECT 
        1 AS lv,
        empno, ename, mgr
    FROM emp --대상테이블
    WHERE mgr IS NULL --원글
    
    UNION ALL 
    
    SELECT
        er.lv+1 as lv,
        e.empno, LPAD(' ', 2*er.lv) || e.ename, e.mgr
    FROM emp_recu er
    LEFT OUTER JOIN emp e on er.empno = e.mgr --내 empno가 mgr로 써먹은거 
    WHERE e.mgr IS NOT NULL --원글을 제외하는 조건
)
SEARCH DEPTH FIRST BY empno DESC SET sort_empno_desc --정렬에 대한 정의 및 별칭
SELECT * FROM emp_recu
ORDER BY sort_empno_desc; --정렬 별칭을 활용

--페이징 
SELECT 
    ROWNUM, empno, ename
FROM emp 
WHERE ROWNUM < 5
ORDER BY empno DESC;

-- sql 실행 순서 
/*5*/ SELECT empno AS NO
/*1*/ FROM emp
/*2*/ WHERE eno = 7788
--위 where 절 emp 에서 eno라는 값이 없어서 쓸 수 없다 실행하면 오류남 
/*3*/ GROUP BY deptno
/*4*/ HAVING deptno IN (10,20)
/*6*/ ORDER BY eno;

SELECT *
FROM (
    SELECT deptno AS eno
    FROM emp)
WHERE eno = 10;

SELECT 
    rownum, empno, ename
FROM emp
ORDER BY ename;

SELECT empno, ename
FROM emp
ORDER BY ename;

SELECT * 
FROM (
    SELECT ROWNUM rnum, empno, ename
    FROM (
        SELECT empno, ename
        FROM emp
        ORDER BY ename
    )
)
-- 한페이지에 3개씩 보여주는데 2페이지
WHERE rnum >= 4 AND rnum <=6;

insert into emp2 
select * from emp;

select count(*) from emp;
commit;

create table emp3
as select * from emp;

-- id: ename, pw: empno
select * from emp3
where ename= 'SMITH' and empno = 7369; 

create table emp0
as select * from emp;

select * from emp0;