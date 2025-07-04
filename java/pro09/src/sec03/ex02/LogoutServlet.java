package sec03.ex02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();   //세션삭제
		}
		
		response.sendRedirect("login.jsp");
	}

}
