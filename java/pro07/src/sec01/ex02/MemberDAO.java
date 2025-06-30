package sec01.ex02;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.utill.ArrayList;
import java.utill.List;



public class MemberDAO {
	
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbcoracle:thin:@localhost:1521:XE";
	private static final String user="scott";
	private static final String pwd="tiger";
	
	private Connection con;
	private PreparedStatement pstmt;
	
	public List listMembers() {
		java.awt.List list = new ArrayList();
		try {
			connDB();
			String query="select * from t_member";
			System.out.println("prepareStatement:"+query);
			pstmt = con.prepareStatement(query);
			ResultSet rs= pstmt.executeQuery();
			While(rs.next()){
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				date joindate = rs.getDate("joinDte");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
		 e.printStackTrace();
		}
		return list;
	}
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩성공");
			con= DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성성공");
		}catch(Exception e) {
		 e.printStackTrace();
		}
	}
}
