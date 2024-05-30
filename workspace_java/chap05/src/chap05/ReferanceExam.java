package chap05;

public class ReferanceExam {

	public static void main(String[] args) {

		int a;
	//	System.out.println(a);
	// a는 없는 상태라서 출력하면 오류가 남

		String c = "킴";
		/*	=을 기준으로 오른쪽 먼저 실행됨 
			"킴"이 힙 heap영역에 비어있는 번지에 들어간다
			스택 stack영역의 c에 그 번지가 들어감
		*/
		
		//"킴"이 heap 영역 500번지에 있다치면
		//stack영역에 c라고 하는 이름에 500이 들어감
		
		System.out.println("c: "+c);
		System.out.println("c==null :"+(c==null));
		System.out.println("c!=null :"+(c!=null));
		
		c=null; //주소값을 비워서 연결끊기
		System.out.println("c: "+c);
		System.out.println("c==null :"+(c==null));
		System.out.println("c!=null :"+(c!=null));
		
		String d;
		//기본 타입과 마찬가지로 값을 할당하지 않으면 사용할 수 없다\
		//System.out.println(d);
		
		/*d="킴";		
		System.out.println(c==d);
		결과:false  위에서 킴이었던 c는 null처리를 했기 때문에
		c가 가지고 있는 주소와 d의 주소값이 다르다
		*/
		
		d="킴";
		c="킴"; 
		System.out.println(c==d); //true
		//이건 String 특별대우
		
		c= new String("킴"); //새로운 주소에 할당
		System.out.println(c==d); //결과:false
		//c가 가지고 있는 주소와 d의 주소값이 다르다
	
		System.out.println("c.equals(d): "+c.equals(d) );
		
		c=null;
		//System.out.println("c.equals(d): "+c.equals(d) );  c가 null이라 오류남
		System.out.println(c+"abc"); //nullabc
		String e = c+"abc";
		System.out.println(e);
		
	}

}
