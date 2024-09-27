<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	//var const let 
	let a = 1;
	//let a = 2; 이렇게 두번 선언 할 수 없다 
	a = 2;
	
	const b = 2;
	// b = 3;
	
	var c = 3;
	var c = 4;

	// window.onload = function(){} 한페이지면 간단하게 이렇게 써도 되고 
	window.addEventListener("load", function(){
		const btn = document.querySelector("#btn")
		btn.addEventListener("click", function(){
			
			console.log("click!!")
			
			const xhr = new XMLHttpRequest();
			//const url = "ajax"; // '/'로 시작하지 않으면 상대주소, 맨마지막 /뒤에 있는 모든 것 지우고 ajax로 바뀜
			const url = "ajax/list"; 
			
			//json으로 만들어주고
			const data = {
					"ename": "이름", //원래 key에도 쌍따옴표 붙여줘야하는데 자바스크립트한정 생략가능
					sal : 3200,
			}
			
			xhr.open("post", url) //post방식으로 url로 가게 
			xhr.setRequestHeader("Content-Type","application/json");
			
			const strData = JSON.stringify(data);
			console.log(data) //객체 그 자체
							// 네트워크는 객체를 전달할 수 없다
			console.log(''+data) //이건 말 안되는거 
			console.log(strData) //그래서 string 으로 변형
			console.log(data, strData);
			
			xhr.send(strData)
			
			xhr.onload = function(){
				console.log( xhr.responseText )
				
				try{
					let result = JSON.parse(xhr.responseText)
					console.log(result)
					
					console.log( result.ename )
					console.log( result["ename"] )
				}catch(e){
					console.log("json 아님")
				}
				
				
			}
		})
	})
	
</script>

</head>
<body>

<button id="btn">ajax 실행</button>

</body>
</html>