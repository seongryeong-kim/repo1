package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	EmpDAO empDAO = new EmpDAO();

	public List getEmp(String a, String b) {
		EmpDAO empDAO = new EmpDAO();
		
		List result = empDAO.selectEmp(a,b);
		
		return result;
	}
	
	public int joinEmp (EmpDTO dto) {
		int insertCount = this.empDAO.insertEmp(dto);
		return insertCount;
	}
	
	   public int delete(int num) {
		      EmpDAO empDAO = new EmpDAO();
		      int deleteCount = empDAO.delete(num);
		      return deleteCount;
		   }
	
}