package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;


@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify doGet 실행");
		
		//전달받은 tno값이 String에 저장되고 전달
				String str_tno = request.getParameter("tno");
				System.out.println("str_tno: "+str_tno);
				
				//문자를 숫자로 String to int
				int tno2 = Integer.parseInt(str_tno);
				
				TodoService todoService = new TodoService();
				TodoDTO dto2= todoService.get(tno2);
				
				//dto 라는 이름으로 dto2를 넣어주고 jsp로 보낼 것 
				request.setAttribute("dto",dto2);
				request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
				
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost 실행");
		
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8;");
        
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO todoDTO = new TodoDTO();
		
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			todoDTO.setFinished(false);
		} else {
			todoDTO.setFinished(true);
		}
		System.out.println(todoDTO);
		
		//db의 insert까지 실행 
		TodoService todoService = new TodoService();
		int result = todoService.modify(todoDTO);
		System.out.println("update 결과: "+result);
		
		//목록으로 보내기
//		response.sendRedirect("/todo/list");
//		response.sendRedirect("/pro3_todo/todo/list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
	}

}
