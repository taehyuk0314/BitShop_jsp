package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void joinAccount(String accountNum,int money,String today);
	public String accountToday();
	public ArrayList<AccountBean> list();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccountNum();
	public boolean existAccountNum(String AccountNum);
	public String accountNum();
	public void updateDeposit(int money);
	public void updateWithdraw(int money);
	public void deleteAccountNum(String accountNum); 
}
