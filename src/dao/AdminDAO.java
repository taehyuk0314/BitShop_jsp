package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDAO {
	public void insertAdmin(String name,String pass,String auth);
	public ArrayList<AdminBean> selectAllAdmins();
	public ArrayList<AdminBean> selectAminByAuths(String auth);
	public AdminBean selectAdminByAdminNum(String adminNum);
	public int countAdmins();
	public void updatePass(String name,String pass,String newpass);
	public void updateAuth(String name,String pass,String auth);
	public void deletAdmin(String name,String pass);
}
