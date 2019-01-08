package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAOImpl instance = new MemberDAOImpl(); 
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	@Override
	public void insertMember(MemberBean member) {
		System.out.println("진입");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("INSERT INTO member(id, name, pass, ssn)\n"
					+ "VALUES('%s', '%s', '%s', '%s')", member.getId(),member.getName(),member.getPass(),member.getSsn());
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("회원가입성공");
			}else {
				System.out.println("회원가입실패");
			}
			System.out.println("SQL ="+sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		
	}

}
