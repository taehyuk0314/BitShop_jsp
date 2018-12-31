package service;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService{

	@Override
	public void joinAdmin(String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> listAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AdminBean> findByAuth(String auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean findByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAdmin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAdmin(String name, String pass) {
		// TODO Auto-generated method stub
		return false;
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
	public void deleteAdmin(String name, String pass) {
		// TODO Auto-generated method stub
		
	}

}
