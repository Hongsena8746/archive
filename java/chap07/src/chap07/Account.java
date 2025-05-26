package chap07;


public class Account {
	private String accountName;
	private String accountNum;
	private int balance;
	
	public Account (String AccountName, String AccontNumber, int balance) {
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		
	}
		
	
	
		public String getAccountName() {
			return accountName;
		}
		
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		
		public String getAccountNum() {
			return accountNum;
		}
		
		public void setAccountNum(String accountNum) {
			this.accountNum = accountNum;
		}
		
		public int getBalance() {
			return balance;
		}
		
		public void setbalance(int balance) {
			this.balance = balance;
		}
		
		
		
		public void deposit(int deposit) {
			balance -= deposit;
		}
		//@override
		public String toString() {
			return String.format("{%s,%s,%d}",accountName,accountNum,balance);
							
	}
		
}
		

	
	
	
