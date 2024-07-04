package sec04.prac;

public class MelonMusic {
//	#멜론노래관리 DB
//	class Song
//	필드: 제목, 가수명, 장르, 가사, 곡 길이
	String title = "제목";
	String artist="뉴진스";
	String genre="K-POP";
	String lyrics="가사";
	String time="3분";
//	메소드
//	-각각의 값을 지정하는 것 (제목바꾸기 같이)
//	-모든 정보 표시 
//	class songExam 
//	3곡 이상의 노래를 등록해서 관리
	void setTitle(String a) {
		title = a;
	}
	
//	void setArtist(String a) {
//		artist=a;
//	}
	void setLyrics(String a) {
		lyrics=a;
	}
	
	void print() {
		System.out.println("제목: "+title);
		System.out.println("가수: "+artist);
		System.out.println("장르: "+genre);
		System.out.println("가사: "+lyrics);
		System.out.println("노래길이: "+time);
	}
	
}