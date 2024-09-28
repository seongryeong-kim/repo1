package blue.archive.momoi;

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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// logger 가 더 강한 print out이라고 생각하면 될 듯  
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		// serverTime 이라는 el태그칸에 formattedDate 가 보임
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	// name 이라는 경로로 접속 했을 때 
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String home0(Locale locale, Model model) {
		
		// home.jsp 파일 name 이라는 el태그에 momo라는 텍스트가 나오도록 
		model.addAttribute("name", "momo" );
		
		return "home";
	}
	
}
