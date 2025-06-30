package sec04.ex01;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//import javax.servlet.RequestDispatcher; -> javax.serblet.*; 이러면 자바 패키지가 다들어감



@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");;
		response.setContentType("text/html;charset=utf-8");
	
		//request 객체에 데이터를 바인딩한다
		request.setAttribute("address", "서울시 성북구");
		
		//forward 방식으로 다른 서블릿으로 요청 전달
		response.sendRedirect("second?address=서울시 성북구");
		RequestDispatcher dispatcher = request.getRequestDispatcher("second");
		dispatcher.forward(request, response);
		//같은 request객체를 공유하므로 setAttribute() 값이 유지됨.
	}
}
