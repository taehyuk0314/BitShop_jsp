package service;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService{
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {}	
	public static AdminServiceImpl getInstance() {return instance;}

	@Override
	public void createAdmin(String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> findAllAdmins() {
		
		return null;
	}

	@Override
	public ArrayList<AdminBean> findAminByAuths(String auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean findAdminByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAdmin(String name, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changePass(String name, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeAuth(String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdmin(String name, String pass) {
		// TODO Auto-generated method stub
		
	}

}
