package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		//8월 2일
		
		List list = new ArrayList();
		System.out.println(list.isEmpty()); //사이즈가 0인지 아닌지
		
		list.add("10");
		int a = 20;
		list.add(a);
		list.add(true);
		System.out.println( list.isEmpty() ); //false
		
		//중간에 삽입
		list.add(1,123); //1번인덱스에 123이 들어가면서 하나씩 밀림 
		
		//삭제
		list.remove(1);
		
//		int b = (int)list.get(1); //자동형변환 이루어지지 않으니 앞에 int써주기
		int b = (Integer)list.get(1); //Integer 사용해도 됨
		System.out.println(b);
		System.out.println( list.size() ); //for문 돌릴 때 딱 좋다
		System.out.println( list.toString() );
		System.out.println(list);
//		list.get(100); 이건 에러 
		
		//초기화
		list.clear();
		list = new ArrayList();
		
		//Hash map 
		Map map = new HashMap();
		//추가
		map.put("k1", 10);
		map.put("abc", list);
		
		int k1 = (int)map.get("k1");
		System.out.println(k1);
		
		//key가 없으면 null
		//실제로 key가 있지만 value를 null을 넣었을 경우도 있다
		System.out.println( map.get("k2") );
		
		list = new ArrayList();
		map = new HashMap();
		//2차원 배열느낌으로 쓸 수 있겠다
		map.put("제목","사건의 지평선");
		map.put("가수", "윤하");
		map.put("가수", "yoonha"); //이러면 덮어쓰게 됨 
		list.add(map);
		System.out.println(list);
		
//		map = new HashMap(); 이걸 주석처리하면 바람이 분다가 두번나오는데 그게 얕은복사 
		map = new HashMap();  
		map.put("제목","바람이 분다");
		map.put("가수","이소라");
		map.put("가사","바람이...");
		// 얕은복사, call by reference, shallow copy, thin copy
		list.add(map);
		System.out.println(list);
		
		// Generic 제네릭 
		// 추가할 자료형을 제한하는 용도로 쓰인다
		// 리턴타입이나 전달인자의 타입을 선언할 때 변경할 수 있게 하는 기술 
		List<String> list2 = new ArrayList<String>();
		list2.add("글씨");
		//제네릭이 있는 경우 꺼낼 때 형변환을 알아서 해준다
		String str = list2.get(0);
		
		// 제네릭에 int는 사용할 수 없음. 클래스만 가능 
		// 이렇게 하면 key값에 string value는 int밖에 못들어감 
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("키값", 1);
		int a2 = map2.get("키값");
		
	}

}
