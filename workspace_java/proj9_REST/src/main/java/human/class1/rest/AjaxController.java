package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	//ajax.jsp 를 여는 메소드를 만들어야함
	
	/*
	 * "/rest/ajax.view" 화면으로 가는 것들,, 사용자들
	 * "/rest/ajax"    개발자들
	 */

	// RequestMapping 으로 get 방식 ajax.view 주소를 지정하여 
	// localhost:8080/ajax.view 에 접속하면 ajax.jsp 내용이 전달됨 
	@RequestMapping(value="/ajax.view", method=RequestMethod.GET)
	public String ajaxView() {
		System.out.println("view 실행");
		return "ajax";
		//내가 views 폴더에 만든 ajax.jsp를 불러옴
	}
	
	//여기까지 
	// @RequestBody: post로 보낸 json을 처리
	@RequestMapping(value="/ajax", method=RequestMethod.POST)
	public String ajax(
			// 질문 - 이부분 잘 모르겠음 리퀘스트파람 
			@RequestParam(value="ename", required=false) String ename,
			@ModelAttribute EmpDTO dto2,//getParameter로 꺼내서 필드에 set해서 넣어줌
			/*
			 * String ename = request.getParameter("ename")
			 * EmpDTO empDTO = new EmpDTO();
			 * empDTO.setEname(ename); 이런거
			 */
			
			@RequestBody EmpDTO dto 
			//전달인자가 3개 있는 상태 
	) { 
		//json 으로 보낸건 @RequestParam 또는 request.getParameter로 받을 수 없다
		System.out.println("ename: "+ename);
		System.out.println("dto2: "+dto2);
		System.out.println("dto: "+dto);
		return "ajax";
	}
	
	// @ResponseBody: 그냥 값이나 json 으로 리턴해줌
	@RequestMapping(value="/ajax/string", method=RequestMethod.POST)
	@ResponseBody
	public String ajaxString(
			@RequestBody EmpDTO dto  
	) { 

		System.out.println("dto: "+dto);
		
		return "human"; // 지금 상태에서는 human.jsp 로 감 
	}
	
	@RequestMapping(value="/ajax/dto", method=RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxDto(
			@RequestBody EmpDTO dto  
	) { 
		System.out.println("dto: "+dto);
		
		return dto;
	}
	
	@RequestMapping(value="/ajax/list", method=RequestMethod.POST)
	@ResponseBody
	public List ajaxList(
			@RequestBody EmpDTO dto  
	) { 
		System.out.println("dto: "+dto);
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return list;
	}
	
//	ajax/forward 이 주소로 들어왔을 때 ajax.view 로 보이게 하고 싶다
	//주소는 forward인데 ajax.view를 보여줌 
	@RequestMapping(value="/ajax/forward", method=RequestMethod.GET)
	public String ajaxForward() {
		return "forward:/ajax.view";
	}
	
	@RequestMapping(value="/ajax/redirect", method=RequestMethod.GET)
	public String ajaxRedirect() {
		return "redirect:/ajax.view";
	}
	

	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			@PathVariable("num") //경로변수
			int number,
			
			@PathVariable("str") String str1,
			
			HttpServletRequest request
			) {
		System.out.println( request.getParameter("num")); 
		System.out.println("number: "+number);
		System.out.println("str1: "+str1);
		
		return number;

	}
}
