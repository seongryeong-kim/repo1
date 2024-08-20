package org.zerock.w1.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/mypage")
public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		// session에 session.getAttribute("isLogon" 이게 없다면 마이페이지가 안보임 so cookie.jsp
		Boolean isLogon = (Boolean)session.getAttribute("isLogon"); //있으면 key 없으면 null
		if(isLogon == null) {
			//sendRedirect 
			response.sendRedirect(request.getContextPath()+"/cookie.jsp");
		} 
		
		// 로그인 성공하면 볼 수 있음 
		response.getWriter().println("여기는 로그인해야 들어올 수 있습니다"); 
		response.getWriter().println("당신의 등급은: "+ session.getAttribute("level"));
	}

}
