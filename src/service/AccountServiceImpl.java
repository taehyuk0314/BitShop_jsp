package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;
import domain.MemberBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list; 
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	@Override
	public String joinAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(accountToday());
		list.add(account);
		String accountNum = account.getAccountNum();
		return accountNum;
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String accountNum = random.nextInt(9999)+"-"+random.nextInt(9999);
		return accountNum;
	}

	@Override
	public ArrayList<AccountBean> list() {
		return list();
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i);
			}
		}
		return accountBean;
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
	public String accountToday() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(date);
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
