package exam01;

public class excer05 {

	public static void main(String[] args) {
		//main()�޼ҵ� �Ű�����
		if(args.length !=2) {  // �ԷµȰ����� 2���� �ƴҰ��
			System.out.println("���� ���� �����ϴ�");
			System.exit(0);  //���α׷� ��������
		}
		String strNum1 = args[0];  //ù��°�����;��
		String strNum2 = args[1];  //�ι�°�����;��
		
		 int num1 = Integer.parseInt(strNum1);  //���ڿ��� ������ ��ȯ
		 int num2 = Integer.parseInt(strNum2);  //���ڿ��� ������ ��ȯ
		 
		 
		 
		 //run -> run configurations -> main -> project�� main classȮ����
		 //aguments�� ������ program aguments ��  2�� ���� �� �Է��� apply-> run������
		 //����â�� �Է��� ���� ��������.
		 int result = num1+num2;
		 System.out.println(num1+ " + " + num2 + "=" +result);
		      // ���� 33 55 �Է���
	}

}
