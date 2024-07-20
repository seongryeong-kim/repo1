from flask import Flask, request, render_template

# 서버와 관련된 모든 것을 저장할 변수 app
# flask 초기화
app = Flask(__name__)

# 함수는 def로 시작 
'''
자바스크립트와 비교
function home(){
    return 'hello web'
}
'''

@app.route("/home")
def home() :    
    a = 10
    print(a)
    # 중괄호가 생략되었기 때문에 들여쓰기 무조건 해야 함 
    return '<h1>hello web</h1>'

# 네이버 검색과 비슷한 원리 
@app.route("/login", methods=['GET','POST'])
def login():
    # 넘겨받은 parameter 출력
    print(request.method) 
    # get방식이면 get, post방식이면 post 나옴

    if request.method == 'GET' :
        # GET 방식
        id = request.args.get("id")
        print("id: ",id)

    elif request.method == 'POST' :
        # POST 방식
        id = request.form.get("id")
        print("id: ",id)
    else : 
        print("다른 메소드")

    return f'당신의 아이디는 your id is{id} 입니다'

@app.route("/join")
def join():
    return render_template('join.html')

# 서버 구동 
# flask 기본 포트: 5000
app.run(port=5000, debug=True)
print()
