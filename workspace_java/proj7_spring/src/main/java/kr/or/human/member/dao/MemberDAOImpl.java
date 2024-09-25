package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// 보통 DAO 클래스에서 사용
//@Repository 안쓰는 경우 bean id 가 아래 () 안에 있는 게 됨 
@Repository("memberDAOImpl")
public class MemberDAOImpl implements MemberDAO {
	// September 25th
	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}
}
