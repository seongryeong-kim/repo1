package emp2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp2.dao.EmpPageDAO;

public class EmpPageService {

	public Map getEmpPage(String countPerPage, String page) {
		int count = Integer.parseInt(countPerPage);
	    int pageNo = Integer.parseInt(page);
	      
	    int start = ((pageNo -1) * count) + 1;
	    int end = pageNo *count;
		
		EmpPageDAO empPageDAO = new EmpPageDAO();
		List list = empPageDAO.selectEmpPage(start, end);
		
		int totalCount = empPageDAO.totalEmpPage();
		
		Map map = new HashMap();
		map.put("list", list); //list라는 키 값에 list 변수 넣어주기
		map.put("totalCount", totalCount);
		
		return map;
	}
}
