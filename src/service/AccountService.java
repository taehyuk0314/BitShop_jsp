package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void openAccount(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> findAllAccountNums();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccountNums();
	public boolean existAccountNum(String AccountNum);
	public String regToday();
	public void updateDeposit(int money);
	public void updateWithdraw(int money);
	public void removeAccountNum(String accountNum); 
}
