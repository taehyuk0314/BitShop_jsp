package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void joinMember(String id,String name,String pass,String ssn);
	public ArrayList<MemberBean> list();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int countMember();
	public boolean existMember(String id,String pass);
	public void updatePass(String id,String pass,String newpass);
	public void deleteMember(String id,String pass);
}
