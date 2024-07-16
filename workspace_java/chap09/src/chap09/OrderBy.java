package chap09;

import java.util.Comparator;

public abstract class OrderBy implements Comparator{
	//Comparator 인터페이스 가져오기

	@Override
	public int compare(Object o1, Object o2) {

		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
		
		return dto1.getAge() - dto2.getAge(); 
	}

	
}
