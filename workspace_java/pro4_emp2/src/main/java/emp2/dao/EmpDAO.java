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

	public List selectEmp(String empno2) {
		return selectEmp(empno2,1,10);
	}
	public List selectEmp(String empno2, int start, int end) {
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
			
			if(empno2 == null) {
				query =  " select * ";
                query += " from ( ";
                query += "    select rownum rnum, empno, ename ";
                query += "    from ( ";
                query += "        select empno, ename ";
                query += "        from emp ";
                query += "        order by ename ";
                query += "    ) ";
                query += " ) ";
                query += " where rnum >= ? and rnum <= ?";
			} else if(empno2 != null) {
				query = "SELECT * FROM emp2 WHERE empno = ?";
			}
			
			// 오라클 문법 컴파일 
			PreparedStatement ps = con.prepareStatement(query);	
			
//			if(pno == null) { //전달인자 key(pno)의 value가 null 이면 
//				query=" SELECT * FROM emp2";
//			} else if(pno !=null) {
//				query="SELECT * FROM emp2 WHERE empno=?";				
//			}
			
			
			//전달인자 받는거 기다림 
//			if( empno2!= null ) {
//				ps.setString(1,empno2); //pno ?채워줌
//				//전달인자가 하나, ?뒤에 값 pno 
//			} else if (emname != null) {
//				ps.setString(1,emname); 
//			}
			
			// 선생님 코드 
			if( empno2!= null ) {
				ps.setString(1,empno2); 
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
				
				empDTO.setRnum( rs.getInt("rnum") );
				
				list.add(empDTO);
			}
			
			ps.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 8월 19일
	public int insertEmp(EmpDTO dto) {
		int result = -1;
		
		//DB 접속
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataFactory.getConnection();
			
			// SQL 준비
			String query = "INSERT INTO emp2 (empno, ename, sal, deptno, hiredate)";  		
				   query +=" VALUES (?,?,?,?, sysdate)";  		
			PreparedStatement ps = con.prepareStatement(query);
				   
			// 원래 실행되는 걸 LoggableStatement가 가로채서
			ps = new LoggableStatement(con, query);
			// 물음표 채워주고 실행
			ps.setInt(1, dto.getEmpno());
			ps.setString(2, dto.getEname());
			ps.setInt(3, dto.getSal());
			ps.setInt(4, dto.getDeptno());
			
			//LoggableStatement를 ps로 형변환
			// 실제 실행되는 sql을 출력해볼 수 있다
			System.out.println( ( (LoggableStatement)ps ).getQueryString() );
			
			//SQL 실행
			result=ps.executeUpdate();
					
			ps.close();
			con.close(); // 커넥션풀에 접속정보 반환
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(int empno) {
	      int result = -1;
	      
	      try {
	         // DB 접속
	         Context ctx = new InitialContext();
	         DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
	         Connection con = dataFactory.getConnection();
	         
	         // SQL 준비
	         EmpDTO dto = new EmpDTO();
	         String query = "delete from emp2 where empno = ?";
	         PreparedStatement ps = con.prepareStatement(query);
	         ps.setInt(1, empno);
	         
	         // SQL 실행
	         result = ps.executeUpdate();
	         ps.close();
	         con.close();
	         
	      }catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      return result;
	   }
	
	 public EmpDTO selectLogin(EmpDTO empDTO) {
		 EmpDTO resultDTO = null;
		 try {
			 //DB 접속
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataFactory.getConnection();
			
			String query = " select * from emp3 ";
				   query +=" where ename = ? and empno = ?";
				 
				   PreparedStatement ps = new LoggableStatement(con,query);
				   ps.setString(1, empDTO.getEname());
				   ps.setInt(2, empDTO.getEmpno());
				   
				   //실제 실행되는 sql을 출력해볼 수 있다
				  System.out.println( (LoggableStatement)ps ).getQueryString() );
				  
				  ResultSet rs = ps.executeQuery();
				  while( rs.next() ) {
					  resultDTO = new EmpDTO();
					  
					  resultDTO.setEmpno( rs.getInt("empno"));
					  resultDTO.setEname(rs.getString("ename"));
					  resultDTO.setSal( rs.getInt("sal"));
				  }
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}

