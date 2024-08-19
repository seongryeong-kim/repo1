package emp2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;

@WebServlet("/delete")
public class EmpDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      System.out.println("/delete doGet 실행");
	      

	      String str_empno = request.getParameter("empno");
	      int empno = Integer.parseInt(str_empno);
	      
	      EmpService service = new EmpService();
	      int result = service.delete(empno);
	      
	      System.out.println("삭제 개수 : "+ result);
	      
	      response.sendRedirect("emp");

	}

}
