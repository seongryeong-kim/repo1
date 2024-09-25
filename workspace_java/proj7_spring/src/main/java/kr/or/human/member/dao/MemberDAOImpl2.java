package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl2 implements MemberDAO {
	// September 25th
	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		return list;
	}
}
