package sec04.prac;

import sec03.exam01.Car;

public class MelonMusicExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MelonMusic melon = new MelonMusic();
		MelonMusic melon1 = new MelonMusic();
		MelonMusic melon2 = new MelonMusic();

		System.out.println(melon.title);
		melon.setTitle("Super Natural"); // 노래제목을 변경
		melon1.setTitle("How Sweet");
		melon2.setTitle("Bubble Gum");
		System.out.println(melon.title);
		System.out.println(melon1.title);
		System.out.println(melon2.title);

		System.out.println(melon.artist);
		System.out.println(melon.genre);

		System.out.println(melon.lyrics);
		melon.setLyrics("Super Natural 가사"); // 노래제목을 변경
		melon1.setLyrics("How Sweet 가사");
		melon2.setLyrics("Bubble Gum 가사");
		System.out.println(melon.lyrics);
		System.out.println(melon1.lyrics);
		System.out.println(melon2.lyrics);

		System.out.println(melon.time);

		//MelonMusic myMelon = new MelonMusic ("Super Natural", "뉴진스", "KPOP","가사","3분");
		
	}

}
