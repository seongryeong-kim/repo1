package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;

public class EmpService {

	public List getEmp(String a, String b) {
		EmpDAO empDAO = new EmpDAO();
		
		List result = empDAO.selectEmp(a,b);
		
		return result;
	}
	
}
