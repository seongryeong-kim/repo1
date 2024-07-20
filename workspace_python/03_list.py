a = [1, 1.2, 'word', True] #배열
print(a)
print(a[1])
# print(a[10]) # 범위를 벗어나는 경우 오류 발생 
# 자바에서는 범위를 벗어나면 undefined 가 나오는데 
# 파이썬에서는 에러남 IndexError: list index out of range

print(a[-2]) # 음수 인덱스는 뒤에서부터 센다, 맨 마지막이 -1

# True의 값을 False로 바꾸고 싶다면 
a[3] = False
a[-1] = False

print('abcd'[0]) # 문자열도 배열로 취급한다 
#  a[3]값의 word에서 3번째 글씨를 출력하고 싶다면
#  2차원 배열 
print( a[2][1]) 

# 배열 초기화
a = []
a = list() #list라고 하는 형변환 메소드 

# range 
# range (시작 index, 종료 index, step)
# 시작index부터 종료index 바로 앞까지 step 만큼 증가 
# 시작 index의 기본값: 0
# step의 기본값: 1
a = range(10) #전달인자 하나만 주는 경우 종료index로 인식, 앞에 0이 생략된 상태
print(a)
print( list (a)) #a가 list로 형변환 됨
print( list (range(4,10,2))) #4부터 10바로 앞까지 2씩 증가
print( list (range(10,0))) #종료index가 시작보다 작으면 비어있음
print( list (range(10,0,-1))) # step도 음수가 될 수 있음 
                              # i는 10부터 0보다 큰 동안 i --

# https://wikidocs.net/14
a = [100,15,1,1,1,25,13,54]
a.append(5) # 마지막에 추가 
print(a)

a.sort()    #오름차순으로 정렬 
print(a)

print('구분선----------')
a.sort(reverse=True) #내림차순으로 정렬 
print(a)

a.reverse() #배열 뒤집기
print(a)

print( a.index(25) ) #값이 있는 곳의 index를 반환

# 중간에 추가하고 싶다면 insert
a.insert(1,200) #200을 1번지에 추가
# 원하는 index에 값 끼워넣기 
print(a)

a.remove(1)     # 순차적으로 첫번째 나오는 값을 삭제
                # 값이 없는 경우 에러 발생
print(a)        # 결과를 보면 1이 하나 지워져있다

x = a.pop()     # 맨 마지막 값을 지우면서 돌려준다
print(x)
print(a)

# count 값이 몇 개 있는지 
print( a.count(1) ) # 전달인자의 값이 몇개나 있는가?
# 1이라는 숫자가 몇 개 있는가 

b = [-1,-2]
c = a.extend(b) # a += b와 같다 
print(a)
print(c)

print(min(a) )
print(max(a) )
print(sum(a) )