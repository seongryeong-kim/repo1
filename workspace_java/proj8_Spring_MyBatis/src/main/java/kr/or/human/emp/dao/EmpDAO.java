package kr.or.human.emp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.human.emp.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmp();
	public int insertEmp(EmpDTO empDTO);
	EmpDTO selectEmpOne(int empno);
	int updateEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
}
