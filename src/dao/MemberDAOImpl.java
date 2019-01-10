package dao;

import java.sql.ResultSet;
import java
.sql.SQLException;
import java.util.ArrayList;

import domain.MemberBean;
import factory.databaseFactory;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAOImpl instance = new MemberDAOImpl(); 
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	
	
	@Override
	public void insertMember(MemberBean member) {
		System.out.println("진입");
		try {
			int res=databaseFactory.createDatabase("oracle").getConnection().createStatement().executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
			if(res==1) {
				System.out.println("회원성공");
			}else {
				System.out.println("회원실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			ResultSet rs = databaseFactory.createDatabase("").getConnection().createStatement().executeQuery("");
			while(rs.next()) {
				
			}
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
			ResultSet rs = databaseFactory.createDatabase("").getConnection().createStatement().executeQuery("");
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
			
			ResultSet rs=databaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(String.format(
					"SELECT * FROM member\n" + 
					"WHERE id LIKE '%s'", id));
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}


	@Override
	public int countMember() {
		int count = 0;
		try {
			ResultSet rs= databaseFactory.createDatabase("").getConnection().createStatement().executeQuery("");
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public MemberBean existMember(String id,String pass) {
		MemberBean member =null;
		try {
			ResultSet rs =databaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(String.format(
					"SELECT * FROM member\n" + 
					"WHERE id LIKE '%s' AND pass LIKE '%s'",id,pass));
			while(rs.next()) {
				member= new MemberBean();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
				member.setName(rs.getString("name"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public void updatePass(MemberBean member) {
		try {
			int res =databaseFactory.createDatabase("").getConnection().createStatement().executeUpdate("");
			if(res==1) {
				System.out.println("변경");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(MemberBean member) {
		try {
			int res =databaseFactory.createDatabase("").getConnection().createStatement().executeUpdate("");
			if(res==1) {
				System.out.println("삭제");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
