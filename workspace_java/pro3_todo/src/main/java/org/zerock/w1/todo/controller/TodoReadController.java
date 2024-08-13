package org.zerock.w1.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/read");
		
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
		
		
	}

}
