package sec01.ex01;

import javax.servlet.http.HttpServletRequest;

@WebServlet("/Login")

public class LoginServlet extends HttpServlet {
	
	public void init() throws ServletException{
		{
			System.out.println("init 메서드 호출");
		}
	
	protected void doget(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{	
		request.setCaracterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디:" + user_id);
		System.out.println("비밀번호" + user_pw);
	}
	
	public void destroy()
	{
		System.out.println("destroy 메서드 호출");
	}
}
	
