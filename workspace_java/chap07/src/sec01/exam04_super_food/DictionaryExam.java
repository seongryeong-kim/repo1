package sec01.exam04_super_food;

public class DictionaryExam {

	public static void main(String[] args) {

		KorEng ke = new KorEng();
		String result = ke.translate("사랑");
		System.out.println(result);
		
		KorJpn kj = new KorJpn();
		result = kj.translate("우정");
		System.out.println(result);
		
		
	}

}
