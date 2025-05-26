package chap07;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계좌정보를입력하세요:");
		
		System.out.println("계좌명의:");
		String AccountName = scanner.nextLine();
		
		System.out.println("계좌번호:");
		String AccountNum = scanner.nextLine();
		
		System.out.println("잔고:");
		int balance = scanner.nextInt();
		
		
		////@override 객체 초기화시 AccountName, AccountNum, balance넣어서 초기화해주기
		Account account1 = new Account(AccountName, AccountNum, balance);
		account1.setAccountName(AccountName);
		account1.setAccountNum(AccountNum);
		account1.setbalance(balance);
		
		System.out.println("계좌기본정보:");
		
		
		System.out.println(account1.getAccountName()+","+account1.getAccountNum()+","+ account1.getBalance());
//		System.out.println("계좌번호" + account1.getAccountNum());
//		System.out.println("잔고"+ account1.getBalance());
//		
		System.out.println("출금액:");
		int deposit = scanner.nextInt();
		account1.deposit(deposit);
		
		 System.out.println("출금 후 잔고: " + account1.getBalance() + "원");
		
	}

}
