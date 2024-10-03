package kr.or.human;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	// 위 코드에서 method에서 GET에서 POST로 바꾸면 405 에러가 나옴
	// value: 요청받을 url 설정 so '/'를 치고 들어가면 home.jsp 가 나옴 
	// Get 방식: 주소창에 직접 입력해서 들어가는 방식
	public String home(Locale locale, Model model) {
		// model은 담아서 jsp에 전달하는 용도
		logger.info("Welcome home! The client locale is {}.", locale);
		// logger: System.out.println 같은 거라고 생각하면 될 듯 
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		// home.jsp 에 ${serverTime} 칸에 위에서 설정한 변수 (날짜)가 나오게 됨 
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		/*	이 “home”값은 리턴이 되면 스프링이 알아서 분석하고 
			자동으로 src/main/webapp/WEB-INF/views 안에 있는 home.jsp와 연결해준다. 
			이에 관한 설정은 servlet-context.xml에 작성되어 있다.*/
	}
	
}
