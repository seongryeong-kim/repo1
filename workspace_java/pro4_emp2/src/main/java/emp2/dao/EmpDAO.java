package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpDAO {

	public List selectEmp(String pno, String emname) {
		List list = new ArrayList();
		
		try {
			// # DB에서 emp2 조회하기 
			
			// ## DB 접속시작 
			// JNDI 방식으로 
			// Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져온다
			// 거기에는 DB 정보가 있다
			// 그걸로 DataSource를 만든다
			// DataSource가 커넥션 풀이라고 생각하면 된다 
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// 커넥션 풀에서 접속 정보를 가져오기
			Connection con = dataFactory.getConnection();
			// ## DB 접속 끝 
			
			// SQL 준비
			String query =null; // query라는 String변수에 null을 넣었다  		
			
			if(pno == null) { //전달인자 key(pno)의 value가 null 이면 
				query=" SELECT * FROM emp2";;
			} else if(pno !=null) {
				query="SELECT * FROM emp2 WHERE empno=?";				
			}
			
			// 오라클 문법 컴파일 
			PreparedStatement ps = con.prepareStatement(query);	
			
			//전달인자 받는거 기다림 
			if( pno!= null ) {
				ps.setString(1,pno); //pno ?채워줌
				//전달인자가 하나, ?뒤에 값 pno 
			} else if (emname != null) {
				ps.setString(1,emname); 
			}
			
			// SQL 실행 및 결과확보
			//	executeQuery: select문 실행
			//	ResultSet: select문 조회결과 전체: 엑셀처럼 테이블 느낌
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			//	한줄 한줄을 DTO에 넣기 
			//	그렇게 만들어진 DTO를 List에 넣기 (jsp 로 보낼 list 만들어두기) 
			
			//rs.next(): 다음 줄로 커서를 이동한다
			// 다음줄이 있다면 true를, 없으면 false를 돌려줌 
			// 다음줄이 있으면 rs는 다음줄 덩어리: table의 tr한줄, 1차원 배열같이 
			while (rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				
				// 이번줄에서 empno컬럼의 값을 int로 형변환해서 가져옴
				int empno = rs.getInt("empno");
				empDTO.setEmpno(empno);
				
				//ename도 뽑아보자 
				String ename = rs.getString("ename");
				empDTO.setEname(ename);
				
				empDTO.setJob( rs.getString("job") );
				empDTO.setHiredate( rs.getDate("hiredate"));
				
				list.add(empDTO);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

