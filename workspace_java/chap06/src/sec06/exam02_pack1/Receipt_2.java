package sec06.exam02_pack1;

//import sec06.exam02_pack2.Receipt_3;
import sec06.exam02_pack2.*;  //해당폴더(패키지)에 있는 클래스만 
							 //단, 하위 패키지의 클래스 제외
import sec06.exam02_pack2.Receipt_1;

public class Receipt_2 {
	
	String str;

	Receipt_2(){
		//다른 class를 찾을 때
		//1. 내 package에 있는가?
		//2. java.lang 패키지에 있는가?-  java실행시 자동으로 import됨
		//3. import한 곳에 있는가?
		
		//내 패키지에 있어서 *로 로딩해도 내것을 찾아갑니다
		//명확히 import 해준 경우 pack2의 Receipt_1 사용가능
		Receipt_1 r1 = new Receipt_1();
		Receipt_3 r3 = new Receipt_3(); //Receipt_3 cannot be resolved to a type 
		//빨간줄 나와서 [ctrl+shift+영어 O]를 통해 import를 해주면
		//import sec06.exam02_pack2.Receipt_3; 이게 생성되면서 다른 패키지에 있는 클래스 가져옴
		//다른 패키지에 있는 Receipt_3을 가져오기 위해 import
		//ctrl 누르고 Receipt_1을 클릭하면 해당 클래스로 이동
		r3.a=8;
//		r3.test(); 접근제한자가 default상태라서 이렇게 못씀
		
		//pack1의 Receipt_1을 사용하고 싶다면?
		//다른 패키지의 클래스를 가져오는 두번째 방법
		//-직접 패키지 작성
		//패키지 정보와 클래스 정보를 한번에 쓰기
		//귀찮아서 import 사용한다
		//부득이한 경우 사용할 수 있다는 것을 알아두자 
		sec06.exam02_pack1.Receipt_1 r1_1 = new sec06.exam02_pack1.Receipt_1();
		
	}
}
