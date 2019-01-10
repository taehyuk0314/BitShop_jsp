package dao;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public void insertAdmin(String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> selectAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AdminBean> selectAminByAuths(String auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean selectAdminByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePass(String name, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAuth(String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletAdmin(String name, String pass) {
		// TODO Auto-generated method stub
		
	}

}
