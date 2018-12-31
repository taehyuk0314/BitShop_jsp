package service;

import java.util.ArrayList;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	@Override
	public void joinMember(String id, String name, String pass, String ssn) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
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
