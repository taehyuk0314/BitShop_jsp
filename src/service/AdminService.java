package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	public void createAdmin(String name,String pass,String auth);
	public ArrayList<AdminBean> findAllAdmins();
	public ArrayList<AdminBean> findAminByAuths(String auth);
	public AdminBean findAdminByAdminNum(String adminNum);
	public int countAdmins();
	public boolean existAdmin(String name,String pass);
	public void changePass(String name,String pass,String newpass);
	public void changeAuth(String name,String pass,String auth);
	public void removeAdmin(String name,String pass);
}
