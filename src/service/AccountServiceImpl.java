package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDAOImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private static AccountServiceImpl instance = new AccountServiceImpl(); 
	private AccountServiceImpl() {
		dao = AccountDAOImpl.getInstance();
	}
	public static AccountServiceImpl getInstance() {return instance;}
	AccountDAOImpl dao;
	@Override
	public void openAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(regToday());
		dao.insertAccount(money);
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String accountNum = (random.nextInt(8999)+1001)+"-"+(random.nextInt(8999)+1001);
		return accountNum;
	}

	@Override
	public ArrayList<AccountBean> findAllAccountNums() {
		dao.selectAllAccountNums();
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
	
		dao.selsectAccountByAccountNums(accountNum);
		return accountBean;
	}

	@Override
	public int countAccountNums() {
		int count = dao.countAccountNums();
		return count;
	}

	@Override
	public boolean existAccountNum(String AccountNum) {
		boolean exist = false;
		return exist;
	}

	@Override
	public String regToday() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(date);
	}

	@Override
	public void updateDeposit(int money) {
		dao.updateDeposit(money);
	}

	@Override
	public void updateWithdraw(int money) {
		dao.updateWithdraw(money);
	}

	@Override
	public void removeAccountNum(String accountNum) {
		dao.deleteAccountNum(accountNum);
	}

}
