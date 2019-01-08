package service;

import java.util.ArrayList;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	 
	public static MemberServiceImpl getInstance() {return instance;}

	@Override
	public void joinMember(MemberBean member) {
		System.out.println("멤버서비스 조인에진입");
		System.out.println("==컨트롤러에서 넘오온 회원정보 ==");
		System.out.println("ID:"+member.getId());
		System.out.println("name:"+member.getName());
		System.out.println("pass:"+member.getPass());
		System.out.println("ssn:"+member.getSsn());
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		return member;
	}

	@Override
	public int countMember() {
		int count =0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist=false;
		return exist;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
