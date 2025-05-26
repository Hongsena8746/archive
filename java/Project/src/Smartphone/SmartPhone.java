package Smartphone;
import java.util.Scanner;

public class SmartPhone {
    private Addr[] contacts = new Addr[10];
    private int count = 0;
    private Scanner scanner = new Scanner(System.in);

    public Addr inputAddrData() {
        System.out.print("�̸�: ");
        String name = scanner.nextLine();

        System.out.print("��ȭ��ȣ: ");
        String phone = scanner.nextLine();

        System.out.print("�̸���: ");
        String email = scanner.nextLine();

        System.out.print("�ּ�: ");
        String address = scanner.nextLine();

        System.out.print("�׷�(ģ��/����): ");
        String group = scanner.nextLine();

        return new Addr(name, phone, email, address, group);
    }

    public void addAddr(Addr addr) {
        if (count < contacts.length) {
            contacts[count++] = addr;
            System.out.println("����ó�� �߰��Ǿ����ϴ�.\n");
        } else {
            System.out.println("���� ������ �����մϴ�.\n");
        }
    }

    public void printAddr(Addr addr) {
        System.out.println("�̸�: " + addr.getName());
        System.out.println("��ȭ��ȣ: " + addr.getPhone());
        System.out.println("�̸���: " + addr.getEmail());
        System.out.println("�ּ�: " + addr.getAddress());
        System.out.println("�׷�: " + addr.getGroup());
        System.out.println("-----------------------");
    }

    public void printAllAddr() {
        System.out.println("===== ��ü ����ó ��� =====");
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
            System.out.println("�ش� �̸��� ����ó�� �����ϴ�.\n");
        }
    }

    public void deleteAddr(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--count] = null;
                System.out.println("����ó�� �����Ǿ����ϴ�.\n");
                return;
            }
        }
        System.out.println("������ ����ó�� ã�� �� �����ϴ�.\n");
    }

    public void editAddr(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("���ο� ������ �Է��ϼ���:");
                Addr newAddr = inputAddrData();
                contacts[i] = newAddr;
                System.out.println("����ó�� �����Ǿ����ϴ�.\n");
                return;
            }
        }
        System.out.println("������ ����ó�� ã�� �� �����ϴ�.\n");
    }
}
