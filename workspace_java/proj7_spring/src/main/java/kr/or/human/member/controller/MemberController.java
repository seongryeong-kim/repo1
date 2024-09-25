package kr.or.human.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberservice;
	
	@RequestMapping("/member/listMember")
	void listMember() {
//		MemberService memberservice = new MemberServiceImpl();
//		MemberService.setMemberDAO(new MemberDAOImpl());
		
		List list = memberservice.listMember();
		System.out.println(list);
	}
}
