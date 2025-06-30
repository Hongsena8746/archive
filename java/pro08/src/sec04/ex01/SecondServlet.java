package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//request 객체에서 바인딩된 속성(attribute) 값을 가져온다
		String address=request.getParameter("address");
		
		out.println("<html><body>");
		out.println("주소"+ address);
		out.println("<br>");
		out.println("redirect를 이용한 바인딩실습입니다.");
		out.println("</body><html>");
	}
}
