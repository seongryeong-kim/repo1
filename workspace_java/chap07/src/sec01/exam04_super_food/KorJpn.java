package sec01.exam04_super_food;

import java.util.ArrayList;

public class KorJpn extends DictionaryT {
	
	ArrayList words = new ArrayList();
	
	KorJpn(){
		this.words.add("아이");
		this.words.add("유조우");
		
		super.words = this.words;
	}
}
