a = 10
naver = 1
nvaer = 2 #변수에 오타 주의

b = a // 3 #내림
print(b)
print(-a // 3)
print(a%3)

print(2**10)  #거듭제곱 

# int 자료형으로 형변환
a = int(-3.3)
print(a)
print(int('100')+1)
# print(int('dsfhlk')+1) ValueError: invalid literal for int() with base 10: 'dsfhlk'

# print = 10
# print(a)
# 이렇게 하면 함수 print가 변수명이 되어버리니 조심할 것 

# 어떤 타입인지 알고 싶다면 
a = 10
print( type(a) ) #<class 'int'>
a = 'abc'
print( type(print) ) #<class 'builtin_function_or_method'>

#정밀도
a=0.12345678901234567890
print(a)    #파이썬의 정밀도: 소수점 14자리까지 

a,b,c = 10,20,30
print(a,b,c)

a = True
b = False
c = None #null 없고 대신에 None 
# 파이썬에서 False로 인식되는 경우: False, None, 0, 0.0, 빈 컨테이너 
# True는 False가 아닌 것 

# scanner에 해당되는 것
# 내가 입력하는 것이 출력됨 
# a = input()
# print(a)

print('abc'== 'abc') #문자도 ==으로 비교한다

a = 3 > 5
b = 7 > 5
# 파이썬에서는 and연산자가 &&가 아니고 and라고 써야함
print('a and b: ',a and b)
print('a or b: ',a or b)
print(not (a or b))

id = '아이디'
html =f'''
<div>
    <strong>{id}</strong>
</div>
'''
print(html)

print("쌍따옴표 기호는 \" 입니다")

