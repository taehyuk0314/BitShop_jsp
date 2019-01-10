package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO{
	private static AccountDAOImpl instance = new AccountDAOImpl();
	private AccountDAOImpl() {}
	public static AccountDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	public static void setInstance(AccountDAOImpl instance) {
		AccountDAOImpl.instance = instance;
	}

	@Override
	public void insertAccount(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("","");
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("계좌개설");
			}else {
				System.out.println("계좌개설실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> selectAllAccountNums() {
		ArrayList<AccountBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public AccountBean selsectAccountByAccountNums(String accountNum) {
		AccountBean account =new AccountBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {//검색된 결과가 존재혀면 TRUE 리턴
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public int countAccountNums() {
		int count =0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	

	@Override
	public String regToday() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDeposit(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("","");
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("입금완료되었습니다");
			}else {
				System.out.println("입금실패했습니다");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateWithdraw(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("","");
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("출금완료되었습니다");
			}else {
				System.out.println("출금실패했습니다");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql =String.format("","");
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("계좌삭제되었습니다");
			}else {
				System.out.println("계좌가 삭제되지않았습니다");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
