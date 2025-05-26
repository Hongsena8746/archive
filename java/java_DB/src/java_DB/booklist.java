//package java_DB;
//import java.io.*;
//import java.sql.*;
//import java.sql.CallableStatement;
//
//
//public class booklist {
//  Connection con;
//		
//  public booklist() {
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String userid="scott";
//		String pwd = "tiger";
//			
//    try {/*드라이버를 찾는과정*/
//		 Class.forName("oracle.jdbc.driver.OracleDriver");
//		 System.out.println("드라이버로드성공");
//	} catch(ClassNotFoundException e) {
//		e.printStackTrace();
//	  }
//		   
//    try {/*데이터베이스를 연결하는 과정*/
//		 System.out.println("데이터베이스연결준비..");
//		 con=DriverManager.getConnection(url,userid,pwd);
//		 System.out.println("데이터베이스연결성공");
//	} catch(SQLException e) {
//		e.printStackTrace();
//	}
// 
//
//  public void sqlRun() {
//	  String query="SELECT * FROM Book"; /*SQL문*/
//	  try {/*데이터베이스에 질의 결과를 가져오는 과정*/
//		Statement stmt=con.createStatement();
//		ResultSet rs= stmt.executeQuery(query);
//				
//		System.out.println("BOOK NO |t BOOK ANME \t\t PUBLISER \t PRICE");
//			
//		while(rs.next()) {
//			System.out.print("\t" +rs.getInt(1));
//			System.out.print("\t" +rs.getString(2));
//			System.out.print("\t\t" +rs.getString(3));
//			System.out.println("\t" +rs.getInt(4));
//		}
//			
//		con.close();
//	  } catch(SQLException e) {
//		  e.printStackTrace();
//	  }
//  }
//		  
//  public static void main(String args[]) {
//	  booklist so = new booklist();
//	  so.sqlRun();
//  }
//}
//
//
//
//
