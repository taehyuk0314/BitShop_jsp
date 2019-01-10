package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}
	MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버서비스 조인에진입");
		System.out.println("==컨트롤러에서 넘오온 회원정보 ==");
		System.out.println("ID:"+member.getId());
		System.out.println("name:"+member.getName());
		System.out.println("pass:"+member.getPass());
		System.out.println("ssn:"+member.getSsn());
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMebers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = dao.selectAllMembers();
		return list;
	}

	@Override
	public MemberBean findMeberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count =dao.countMember();
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist=false;
		MemberBean member = new MemberBean();
		member =MemberDAOImpl.getInstance().existMember(id, pass);
		System.out.println(member);
		if(member!=null&&id.equals(member.getId()) && pass.equals(member.getPass())) {
			exist = true;
		}
		return exist;
	}

	@Override
	public void changePass(MemberBean member) {
		dao.updatePass(member);
	}

	@Override
	public void removeMember(MemberBean member) {
		dao.deleteMember(member);
	}

}
