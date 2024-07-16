package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.setName("김철수");
		m1.setAge(20);
		
		m2.setName("박춘보");
		m2.setAge(22);
		
		m3.setName("차수");
		m3.setAge(21);
		
//		System.out.println( m1 > m2 ); 이건 안되니까 비교할 값을 꺼내서 비교
		System.out.println( m1.getAge() > m2.getAge() );
		
		MemberDTO m4 = compareMemberDTO(m1,m2);
		System.out.println(m4);
		
		//Ctrl + Shift + O
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list);
		
//		Comparator comp = new OrderBy();
		//위의 new OrderBy()와 아래의 코드는 완전히 같은 코드이다.
		//아래 방법을 익명객체라고 한다
		//이름이 없는 클래스를 new하고
		//	new() {}
		//클래스 명을 적어야 할 것 같은 곳에
		//interface를 작성
		//단, 하나의 인터페이스만 사용할 수 있음
		//이러면 그 interface를 구현한 익명 클래스가 생성된다
		Comparator comp = new Comparator(){
			
			@Override
			public int compare(Object o1, Object o2) {

				MemberDTO dto1 = (MemberDTO)o1;
				MemberDTO dto2 = (MemberDTO)o2;
				
				return dto1.getAge() - dto2.getAge(); 
			}
			
		};
		
		//이렇게 하면 나이 오름차순으로 정렬됨
		Collections.sort(list, comp);
		System.out.println(list);
	}

	/**
	 * 메소드 만들기
	 * 기능: 둘 중에 나이가 큰 MemberDTO를 돌려줌
	 * 
	 * @param MemberDTO, MemberDTO
	 * 이 안에서 돌려받기 위해 두개 줌
	 * 나이만 주면 나이만 돌려받으니까 그 사람의 모든 정보를 받기 위해서 
	 * @return MemberDTO  
	 */
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
		//dto1과 dto2의 나이를 비교해서 큰 나이를 돌려주기
		if(dto1.getAge() > dto2.getAge()) {
			return dto1;
		} else {
			return dto2;
		}
	}
	
	
	
	
	
}
