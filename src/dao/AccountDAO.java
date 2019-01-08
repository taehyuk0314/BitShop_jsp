package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	public String insertAccount(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> list();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccountNum();
	public boolean existAccountNum(String AccountNum);
	public String accountToday();
	public void updateDeposit(int money);
	public void updateWithdraw(int money);
	public void deleteAccountNum(String accountNum); 
}
