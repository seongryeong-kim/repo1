package sec01.exam04_super_food;

import java.util.ArrayList;

public class KorEng extends DictionaryT {
	
	ArrayList en_words = new ArrayList();
	
	KorEng(){
		en_words.add("love");
		en_words.add("friendship");
		
		this.words = en_words;
	}
}
