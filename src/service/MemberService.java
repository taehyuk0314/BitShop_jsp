package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void createMember(MemberBean member);
	public ArrayList<MemberBean> findAllMebers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMeberById(String id);
	public int countMembers();
	public boolean existMember(String id,String pass);
	public void changePass(MemberBean member);
	public void removeMember(MemberBean member);
}
