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
