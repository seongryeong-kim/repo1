package org.zerock.w1.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet(name="todoReadController", urlPatterns= "/todo/read")
public class TodoReadController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/read");
		
		int tno = Integer.parseInt(request.getParameter("tno"));
		
		TodoService todoservice = new TodoService();
		TodoDTO dto= todoservice.get(tno);
		
		request.setAttribute("dto",dto);
		
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
		
		
	}

}
