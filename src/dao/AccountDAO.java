package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	public void insertAccount(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> selectAllAccountNums();
	public AccountBean selsectAccountByAccountNums(String accountNum);
	public int countAccountNums();
	public String regToday();
	public void updateDeposit(int money);
	public void updateWithdraw(int money);
	public void deleteAccountNum(String accountNum); 
}
