package service;

import java.util.ArrayList;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{

	@Override
	public void joinAccount(String accountNum, int money, String today) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String accountToday() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccountNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String AccountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String accountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDeposit(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWithdraw(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
