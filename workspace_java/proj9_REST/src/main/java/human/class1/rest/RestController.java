package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/human") //반복 되는 거 여기에 빼놓기
@Controller
@ResponseBody
//@RestController = @Controller + @ResponseBody
public class RestController {

//	@RequestMapping("/human/test1")
	@RequestMapping("/test1")
	public int test1() {
		return 100; //ajax가 100이라는 숫자를 텍스트로 받는다 (ajax는 모든 것을 텍스트로 받음)
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "ajax"; 
	}
}
