package Smartphone;
import java.util.Scanner;

public class SmartPhoneMain {
	public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("#데이터 2개를 입력합니다.\n");

            
            //첫벙째 연락처 입력
            System.out.print("이름: ");
            String name1 = scanner.nextLine();
            
            System.out.print("전화 번호 : ");
            String phone1 = scanner.nextLine();
            
            System.out.print("이메일: ");
            String email1 = scanner.nextLine();
            
            System.out.print("주소: ");
            String address1 = scanner.nextLine();
            
            System.out.print("그룹(친구/ 가족): ");
            String group1 = scanner.nextLine();
            
            Addr addr1 = new Addr(name1, phone1, email1, address1, group1);
            smartPhone.addAddr(addr1);
            
            System.out.println("데이터가 저장되었습니다(1)\n");

            //두번째 연락처 입력
            System.out.print("이름: ");
            String name2 = scanner.nextLine();
            
            System.out.print("전화 번호 : ");
            String phone2 = scanner.nextLine();
            
            System.out.print("이메일: ");
            String email2 = scanner.nextLine();
            
            System.out.print("주소: ");
            String address2 = scanner.nextLine();
            
            System.out.print("그룹(친구/ 가족): ");
            String group2 = scanner.nextLine();
            
            Addr addr2 = new Addr(name2, phone2, email2, address2, group2);
            smartPhone.addAddr(addr2);
            
            System.out.println("데이터가 저장되었습니다(2)\n");
                    
                    System.out.println("주소관리메뉴 --------------------");
                    System.out.println("1. 연락처 등록");
                    System.out.println("2. 모든 연락처 출력");
                    System.out.println("3. 연락처 검색");
                    System.out.println("4. 연락처 삭제");
                    System.out.println("5. 연락처 수정");
                    System.out.println("6. 프로그램 종료");
                    System.out.println("--------------------------------");
            }
        }
    }
