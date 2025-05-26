package Smartphone;
import java.util.Scanner;

public class SmartPhone {
    private Addr[] contacts = new Addr[10];
    private int count = 0;
    private Scanner scanner = new Scanner(System.in);

    public Addr inputAddrData() {
        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.print("전화번호: ");
        String phone = scanner.nextLine();

        System.out.print("이메일: ");
        String email = scanner.nextLine();

        System.out.print("주소: ");
        String address = scanner.nextLine();

        System.out.print("그룹(친구/가족): ");
        String group = scanner.nextLine();

        return new Addr(name, phone, email, address, group);
    }

    public void addAddr(Addr addr) {
        if (count < contacts.length) {
            contacts[count++] = addr;
            System.out.println("연락처가 추가되었습니다.\n");
        } else {
            System.out.println("저장 공간이 부족합니다.\n");
        }
    }

    public void printAddr(Addr addr) {
        System.out.println("이름: " + addr.getName());
        System.out.println("전화번호: " + addr.getPhone());
        System.out.println("이메일: " + addr.getEmail());
        System.out.println("주소: " + addr.getAddress());
        System.out.println("그룹: " + addr.getGroup());
        System.out.println("-----------------------");
    }

    public void printAllAddr() {
        System.out.println("===== 전체 연락처 목록 =====");
        for (int i = 0; i < count; i++) {
            printAddr(contacts[i]);
        }
    }

    public void searchAddr(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                printAddr(contacts[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 이름의 연락처가 없습니다.\n");
        }
    }

    public void deleteAddr(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--count] = null;
                System.out.println("연락처가 삭제되었습니다.\n");
                return;
            }
        }
        System.out.println("삭제할 연락처를 찾을 수 없습니다.\n");
    }

    public void editAddr(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("새로운 정보를 입력하세요:");
                Addr newAddr = inputAddrData();
                contacts[i] = newAddr;
                System.out.println("연락처가 수정되었습니다.\n");
                return;
            }
        }
        System.out.println("수정할 연락처를 찾을 수 없습니다.\n");
    }
}
