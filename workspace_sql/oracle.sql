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
