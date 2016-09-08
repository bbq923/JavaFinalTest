package exercise3;

public class Account {
	private static int curAccountId = 1000;
	private int accountId;
	private String accountName;
	
	public Account(String accountName) {
		this.accountName = accountName;
		accountId = ++curAccountId;
	}
	
	public String getAccountInfo() {
		return accountName + "님의 계좌번호는 " + accountId + "입니다.";
	}
}
