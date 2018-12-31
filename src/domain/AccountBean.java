package domain;

public class AccountBean {
	private String accountNum,today;
	private int money;
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("계좌번호: %s\n"
				+ "잔액은: %d\n"
				+ "개설일: %s\n", accountNum,money,today);
	}
	
}
