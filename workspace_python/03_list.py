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
print( list (range(10,0,-1))) 



