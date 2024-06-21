--�����ּ�
/*�����ּ�*/
select 
    * --��� �÷� 
from 
    emp;
--sql developer �ڵ� ���� ����Ű: Ctrl + F7    
select 
    empno, ename, deptno --��ȸ�ϰ� ���� �÷�column ���
from 
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
--���ٺ��� ����Ű : Ctrl + Shift + d 

--distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�
select distinct deptno from emp;
select distinct job from emp;

select deptno, job from emp;
-- column�÷��� �������� ��� �÷����� ������ �ߺ��Ǵ� �� �����Ѵ�
select distinct deptno, job from emp;


-- null�� �����ϸ� ������ null �̴� 
select ename, sal, sal*12+comm, comm from emp;

-- �÷� �� ��Ī ���
-- " ��������
-- as ��������
-- ��Ī�ȿ� ���Ⱑ �ִ� ��� "�ֵ���ǥ �����Ұ�
-- �����ϸ� ���⺸�� _����ٸ� ����
select ename, sal, sal*12+comm as new_SAL, comm from emp;

-- order by : �ش� �÷����� ����
-- ��������: asc�� ���̴� �� �������� 
-- ��������: desc 
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by ù��° �ɷ� �����ϰ� 
--�� �߿� ���� �� �ִٸ� ���� �ɷ� ����
select * from emp
order by deptno asc, sal desc;
-- deptno 10 �ȿ��� sal�� �������� ���ĵǾ����� 
-- deptno �̰ɷ� ���� �����ϰ� 1����, �� �߿��� �ߺ��Ǵ� �� �ִٸ� sal 2����

select distinct job from emp
order by job asc;
--order by job ; �ص� �� asc ���������ϴϱ�

select * from emp
where deptno = 30;

-- �����ȣ�� 7782�� ��������� ��������
select * from emp
where empno = 7782;

--�޿� ������ 2000�̻��� ��
select * from emp 
where sal >= 2000
order by sal;

--Ȧ����ǥ ' �����
select * from emp
where ename = 'KING';

-- AND ������
select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

--������ 2000�̻� 3000�̸� 
select * from emp 
where sal >= 2000 and sal < 3000;

select * from emp 
-- where sal != 3000; �Ʒ��� ���� �� 
where sal <> 3000;

--2000�̸� �̰ų� 3000�̻��� �͵��� �����Ϸ��� 
-- (sal >= 2000 and sal < 3000)�̰� �ƴѰ� ������ ��
select * from emp 
where not(sal >= 2000 and sal < 3000);

select * from emp 
where job in ('MANAGER','SALESMAN','CLERK');

--���� �ݴ�Ǵ� �ڵ�, not�� ���̷��� in �տ� ����ؾ� �� 
select * from emp 
where job not in ('MANAGER','SALESMAN','CLERK');

--6�� 21�� 
select * from emp
where sal between 2000 and 3000;

select * from emp 
where sal not between 2000 and 3000;

--s�Ǵ� s�� �����ϴ� ��� ��
-- %�� ����̵� ������� 
select * from emp
where ename like 'S%';
-- A�� �����ϴ� �� 
select * from emp
where ename like 'A%';
--����̸��� �� ��° ���ڰ� L�� ���
-- _�� �� �ѱ����ε� � ���ڵ��� ��� ���� 
--�� ��° ���ڰ� L�ΰ� ã������ '__L%';
select * from emp 
where ename like '_L%';

--���ڰ� 4������ �̸� 
select * from emp
where ename like '____';

select * from emp 
where ename like '%AM%';
--Ŀ�̼��� 400���� 
--null�� �����ִ� �񱳰� ���� �ʱ⶧����
select * from emp 
where comm <= 400;
-- null �� �̰� �;� 
select * from emp
where comm = null;
--null �Ǵ����ִ� ���� is null;
select * from emp
where comm is null;
--null �� �ƴ� ���� ����Ϸ��� is not null 
select * from emp
where comm is not null;
-- emp���� deptno �� 10 �Ǵ� 20�� ����� 
-- empno, ename, sal, deptno�� ��� 
select empno, ename, sal, deptno from emp
--where deptno= 10 or deptno=20; �̷��� �ᵵ �ǰ� �Ʒ�ó�� �ᵵ �ǰ�
where deptno in (10,20);

--���� �ٸ� ��ȸ ������� �����ش�
--��, ��ȸ�� �÷��� ������ Ÿ���� ���ƾ� �Ѵ�.
select empno, ename, sal, deptno from emp
where deptno = 10
union --�߰��� union�� ���� ��������
select empno, ename, sal, deptno from emp
where deptno = 20;

--�̷��� ���� �ߺ��Ǵ� ���� ���ŵǰ� 3�ٸ� ����
-- union�� �����ִ� �ǵ� �ߺ��Ǵ� ���� �����Ǵϱ� ȥ���� �ͼ� union all 
select empno, ename, sal, deptno from emp
where deptno = 10
union 
select empno, ename, sal, deptno from emp
where deptno = 10;

-- union all: �ߺ��� ������� �����ش�
-- union�� ������� �� �� �ٸ� �������� union all���ϱ� �������� ����
select empno, ename, sal, deptno from emp
where deptno = 10
union all 
select empno, ename, sal, deptno from emp
where deptno = 10;

--125p ���� Ǯ��� 
--Q1
select * from emp
where ename like '%S'; 
--Q2
select empno, ename, job, sal, deptno from emp
where deptno = 30 and job = 'SALESMAN';

--Q3 
--���տ����� ������� ���� ���
select empno, ename, job, sal, deptno from emp
--where deptno in (20,30) and sal > 2000; �̷����ص��ǰ� or�ᵵ��
where (deptno = 20 or deptno = 30) and sal > 2000;
--���տ����� �����(union)
select empno, ename, job, sal, deptno from emp
where deptno = 20 and sal > 2000
union all
select empno, ename, job, sal, deptno from emp
where deptno = 30 and sal > 2000;

--Q4
--�޿�sal ���� 2000�̻� 3000���� �̿��� ���� ���
select * from emp
where not (sal >= 2000 and sal <= 3000);

--Q5 
select ename, empno, sal, deptno from emp
--����1 ����̸��� E�� ����
--where ename like '%E%';
--����2 30�� �μ��� ���
--where deptno = 30;
--����3 �޿������� 1000���� 2000�� �ƴ�
--where sal not between 1000 and 2000;
where ename like '%E%' 
and deptno = 30 
and sal not between 1000 and 2000; 

--Q6 
select * from emp
--select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp
--����1 �߰� ������ �������� ����
--where comm is null
--����2 ����ڰ� �ְ�
--empno�����ȣ�� mgr���ӻ�������ȣ�� ���� ���� ����� ã���� �ǰڴ�
--where empno <> mgr;
--����3 ��å�� MANAGER, CLERK�� ��� 
--where job = 'MANAGER' or job = 'CLERK'
--����4 �̸��� �� ��° ���ڰ� L�� �ƴ� ����� ���� 
--where ename not like '_L%'
where comm is null 
and empno <> mgr 
and (job = 'MANAGER' or job = 'CLERK' )
and ename not like '_L%';

select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- upper, lower�� ��ҹ��� ���� ���� like�� �� �� ����
select * from emp 
where lower(ename) like lower('%Mi%');

-- length�� ����
select ename, length(ename)
from emp;

--�̸��� ���̰� 5���� �̻��� ���ã��
select * from emp
where length(ename) >= 5  ;

select length('��'), lengthb ('��') from dual;

--substr : ����� �Ǵ� ����, ������ġ, ������ ����
--   ������ ������ �Ⱦ��ų� �ʹ� ũ�� ������ �����´�
select job from emp;
--job�� ù��°���� 2���� �߶��
--job�� ����°���� �� ���� �߶��
-- ���̳ʽ� ���̸� �ڿ������� �� �� �ִ�
select job, substr(job,1,2), substr(job,3,2), substr(job,5),
ename, substr(job, -3,2),
length(lower(substr(job,5,100)))
from emp;

--����ŷ ó��
select job, replace (job, 'A', '*') from emp;

select job, 
length(job), 
(length(job)+1)/2,
-- 2.5���� �� ���� ������ �ðž� ���� �Ǵ� ����
substr (job, (length(job)+1) /2,1),
    replace(
        job, 
        substr(job,(length(job)+1)/ 2,1),
        '*'
        )
from emp;

-- LPAD: ����� �Ǵ� ����, ��ü �ڸ���, ä�� ���� 
-- ä�﹮�� ������ ���鹮��
select 
    job,
    --job�� 10���ڷ� ����� �� ������ #���� ���鿹��
    lpad(job,10,'#'),
    lpad(job,4,'#')
from emp;

--��� ����ó�� ���̰� �غ���
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

select empno || ename || '��'
from emp;

select 
    '  a b c    ',
    trim('  a b c    ')
from dual;

--�ǽ�����1 (�ֹι�ȣ)
select 
    '210621-3123456',
    '210621-3******'
from dual;
--Ǯ��1
select
    '210621-3' || '******',
    substr( '210621-3123456',1,8)||'******'
from dual;
--Ǯ��2 rpad ����ϱ�
select
    '210621-3' || '******',
    substr( '210621-3123456',1,8)||'******',
    rpad('210621-3',14,'*')
from dual;

/*�ǽ�����2 
����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
������ ��: WARD -> WA**, MARTIN -> MA****
�������: �� �α��� + '***'
*/
--�տ� ���ڸ��� ������ substr �̿��ؼ� �ڸ��� 
select 

--�������� rpad���ؼ� *ǥ������ 
--��ü�̸����̿��� ù��° �α��� ������ �������� *�� ���̰�
rpad(substr(ename,0,2),length(ename),'*')
--rpad(substr(ename,0,2),(length(ename)),'*')
from emp;

--�ǽ�����3
--�ձ��� �ϳ���
--WARD -> *ARD, MARTIN -> *ARTIN
select replace(ename,substr(ename,1,1),'*')
from emp;
--�ձ��� �ϳ��� ������
--substr(ename,1,1)
--�ձ��ڸ� �� �������� ã�ƺ���
select '*'||substr(ename,2,100)
from emp;

select 
lpad(
substr(ename,2),length(ename),'*')
from emp;

--�ǽ�����4
--�ι�° �۾��� *
--WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename,1,1)||'*'||substr(ename,3)
from emp;

select 
substr(ename,1,1)||
lpad(substr(ename,3),length(ename)-1,'*')
from emp;

--�ǽ�����5
--����۾��� *
--MARTIN -> MA*TIN, SCOTT -> SC*TT
select substr(ename,1,2)||'*'||substr(ename,4,100)
from emp;



--�̰� �Ʒ� �̻���
select 
substr(ename,1,2)||
lpad(
substr(ename,-2),length(ename),'*')
from emp;