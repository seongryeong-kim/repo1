package quiz;

import java.util.ArrayList;

public class SongExam {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Song s1 = new Song();
		s1.setTitle("Supernova");
		s1.setSinger("에스파");
		s1.setGenre("k-pop");
		s1.setLyric("I'm like some kind of Supernova");
		s1.setDuration(193);
		System.out.println(s1.toString());
		list.add(s1);
		
		Song s2= new Song();
		s2.setTitle("Supernatural");
		s2.setSinger("뉴진스");
		s2.setGenre("k-pop");
		s2.setLyric("Stormy night Cloudy sky In a moment you and I");
		s2.setDuration(123);
		System.out.println(s2.toString());
		list.add(s2);
		
		//s3를 s3로 바꾸려면 드래그하고 ctrl f 
		Song s3= new Song();
		s3.setTitle("천상연");
		s3.setSinger("이창섭");
		s3.setGenre("발라드");
		s3.setLyric("아니길 바랬었어, 꿈이길 기도했지");
		s3.setDuration(275);
		System.out.println(s3.toString());
		list.add(s3);
		
		Song s4 = (Song)list.get(0);
		
	}

}
