package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnText {

	public static void main(String[] args) {
		Connection conn = null;//연결
		Statement stmt =null;//구문
		ResultSet rs = null;//값을 받아옴
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM member");
			String name = "";
			while(rs.next()) {
				name =rs.getString("name");
			}
			System.out.println("회원의 이름 :"+name);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
