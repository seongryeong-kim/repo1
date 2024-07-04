package sec04.prac;

public class TvExam {

	public static void main(String[] args) {

		Tv print = new Tv();
		print.powerOn();
//		print.volume(10);
//		print.volume(11);
		print.volUp();
		print.volUp();
		print.volDown();
		print.volUp();
		print.volUp();
		print.volUp();
		print.volDown();
		print.channel(2);
		print.channel(14);
		
		print.info();
		
	}

}
