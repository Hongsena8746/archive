package chap07;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����������Է��ϼ���:");
		
		System.out.println("���¸���:");
		String AccountName = scanner.nextLine();
		
		System.out.println("���¹�ȣ:");
		String AccountNum = scanner.nextLine();
		
		System.out.println("�ܰ�:");
		int balance = scanner.nextInt();
		
		
		////@override ��ü �ʱ�ȭ�� AccountName, AccountNum, balance�־ �ʱ�ȭ���ֱ�
		Account account1 = new Account(AccountName, AccountNum, balance);
		account1.setAccountName(AccountName);
		account1.setAccountNum(AccountNum);
		account1.setbalance(balance);
		
		System.out.println("���±⺻����:");
		
		
		System.out.println(account1.getAccountName()+","+account1.getAccountNum()+","+ account1.getBalance());
//		System.out.println("���¹�ȣ" + account1.getAccountNum());
//		System.out.println("�ܰ�"+ account1.getBalance());
//		
		System.out.println("��ݾ�:");
		int deposit = scanner.nextInt();
		account1.deposit(deposit);
		
		 System.out.println("��� �� �ܰ�: " + account1.getBalance() + "��");
		
	}

}
