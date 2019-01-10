package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.databaseFactory;
import pool.Constant;

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
			databaseFactory.createDatabase("oracle").getConnection().createStatement().executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName(Constant.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constant.ORACLE_URL, Constant.USERNAME, Constant.PASSWORD);
			stmt = conn.createStatement();
			String sql= "";
			rs= stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql ="";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {//검색된 결과가 존재혀면 TRUE 리턴
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = new MemberBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs=stmt.executeQuery(sql);
			while(rs.next()) {//검색된 결과가 존재혀면 TRUE 리턴
				
			}
		}catch (Exception e) {
				
			}
		return member;
	}


	@Override
	public int countMember() {
		int count = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs=stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public String existMember(String id,String pass) {
		
		return null;
	}

	@Override
	public void updatePass(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("INSERT INTO member(id, name, pass, ssn)\n"
					+ "VALUES('%s', '%s', '%s', '%s')", member.getId(),member.getName(),member.getPass(),member.getSsn());
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("비밀번호변경완료");
			}else {
				System.out.println("비밀번호변경 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("INSERT INTO member(id, name, pass, ssn)\n"
					+ "VALUES('%s', '%s', '%s', '%s')", member.getId(),member.getName(),member.getPass(),member.getSsn());
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("회원탈퇴");
			}else {
				System.out.println("회원탈퇴실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
