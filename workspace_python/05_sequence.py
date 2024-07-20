# 시퀀스 객체란?
# 리스트, 튜플, 문자열, range 등 반복할 수 있는 객체
a=[0,10,20,30,40,50,60,70,80,90]
print(30 in a) #True
#in: sequence 시퀀스 즉 반복할 수 있는 것들 
#in: 시퀀스에 특정 값이 있는지 조사

print(100 not in a)
# hello안에 o가 있는가 
print('o' in 'hello')
print(3 in range (0,10,2))

b = [1,2,3]
print(a+b) #더하기: 배열끼리 합치는 연산자 
print('hello'+'world')

# print('hello'+3)  # 파이썬에서는 문자열+문자열만 지원됨
                    # 시퀀스 + 시퀀스만 돼서 그렇다
# TypeError: can only concatenate str (not "int") to str
# 3을 스트링으로 바꿔줘야 함 
# str이라는 함수를 쓸 수 있다
print('hello'+ str(3))

print(b*4) #b를 4번 반복
print("hello"*3)
print("-"*30)

print(len(a))
print("한글")

print(a)
del a[1] #지우고 싶을 때 del
# a배열의 1번 index를 삭제 
print(a)

c = 'abcde'
print(c[0])
# c[0] = 'b'  #index로 접근하는 경우 range, 튜플, 문자열은 읽기만 된다

# 슬라이스
# [index]로 접근할 수 있는 모든 것에 적용됨
# [시작index, 종료index, step]
# 시작index부터 종료index 바로 앞까지 step씩 증가하면서 읽기 
# 종료 index가 원본의 길이보다 커도 원본의 길이만큼만 읽는다 
# 시작index 기본값: 0 
# 종료index 기본값: len() 즉 length
# step 기본값: 1
print(a[0:3]) 
print(a[:3])  #시작index 생략시 처음부터
print(a[3:])  #종료index 생략시 끝까지
print(a[:])   #처음부터 끝까지 모두 다 -> a[::]과 같음
print(a[::2]) #모두출력인데 2씩 건너뛰면서 
# 거꾸로도 가능 
print( a[5:1:-1] ) #step을 음수로 지정할 수 있다 

a[0]=100
a[2:4]=[1,2]
print(a)
a[2:4]=[1]
print(a)
a[2:4]=[1,2,3,4,5,6,7,8,9]
print(a)
a[2:8:2] = [-1,-2,-3] #a의 2부터 8까지 2번씩 늘어나는 것을 -1,-2,-3 으로 바꾸겠다
# step이 있는 경우 할당 개수가 정확해야 한다
print(a)
del a[2:8:2]
print(a)

