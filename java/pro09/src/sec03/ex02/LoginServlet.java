package sec03.ex02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("입력 ID:" + id);
		System.out.println("입력 PW:" + pw);
		System.out.println("조건 검사 결과:" + ("admin".contentEquals(id) && "1234".contentEquals(pw)));
		
		if("admin".contentEquals(id)&& "1234".contentEquals(pw)) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", id);  //세션아이디저장
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}		
	}

}
