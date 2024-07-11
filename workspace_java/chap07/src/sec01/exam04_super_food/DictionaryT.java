package sec01.exam04_super_food;

import java.util.ArrayList;

public class DictionaryT {

	ArrayList ko_words= new ArrayList(); //ArrayList라는 클래스 
	ArrayList words= new ArrayList(); //두개의 arraylist가 생김
	
	DictionaryT(){
		//한국어만 세팅 해줬음
		//그런데 한글 세팅도 자식이 해도 되겠다
		ko_words.add("사랑");
		ko_words.add("우정");
	}
	
	String translate(String word) {
		//arraylist에서 찾는 
		for(int i=0;i< ko_words.size();i++) {
			if(ko_words.get(i).equals(word)) {
				return (String)words.get(i);
			} 
		}
		//for문 해당되는 게 한번도 없었다면
		return "그런 단어는 모릅니다";
	}
}
