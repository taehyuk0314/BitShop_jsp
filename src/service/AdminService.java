package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	public void joinAdmin(String name,String pass,String auth);
	public ArrayList<AdminBean> listAdmin();
	public ArrayList<AdminBean> findByAuth(String auth);
	public AdminBean findByAdminNum(String adminNum);
	public int countAdmin();
	public boolean existAdmin(String name,String pass);
	public void updatePass(String name,String pass,String newpass);
	public void updateAuth(String name,String pass,String auth);
	public void deleteAdmin(String name,String pass);
}
