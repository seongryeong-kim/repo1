package kr.or.human.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.emp.dto.EmpDTO;

//@Repository
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmp() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		return result;
	}
	
	public int insertEmp(EmpDTO empDTO){
		int result = -1;
			
			try {
				result = sqlSession.insert("mapper.emp.param.insertEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
		
		return result;
	}
	
	public EmpDTO selectEmpOne(int empno){
		EmpDTO empDTO = null;
			
			try {
				empDTO = sqlSession.selectOne("mapper.emp.param.selectEmpOne", empno);
			} catch (Exception e) {
				sqlSession.rollback();
			}

		return empDTO;
	}
	
	public int updateEmp(EmpDTO empDTO){
		int result = -1;
			
			try {
				result = sqlSession.insert("mapper.emp.param.updateEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
		
		return result;
	}
	public int deleteEmp(EmpDTO empDTO){
		int result = -1;
			
			try {
				result = sqlSession.insert("mapper.emp.param.deleteEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
		
		return result;
	}
}
