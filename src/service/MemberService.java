package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void joinMember(MemberBean member);
	public ArrayList<MemberBean> list();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int countMember();
	public boolean existMember(String id,String pass);
	public void updatePass(String id,String pass,String newpass);
	public void deleteMember(String id,String pass);
}
