package kr.or.human.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.or.human.emp.dao.EmpDAO;
import kr.or.human.emp.dto.EmpDTO;

@Service 
public class EmpServiceImpl implements EmpService {

	@Autowired //이게 붙어있으면 어디선가 등록되어 있는 bean을 끌어다 쓴다
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> listEmp() {

		List<EmpDTO> list = empDAO.selectEmp();
		
		return list;
	}
	
	public int joinEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}

	public EmpDTO detailEmp(int empno) {
		return empDAO.selectEmpOne(empno);
	}

	public int modifyEmp(EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}
	
	public int deleteEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}

}
