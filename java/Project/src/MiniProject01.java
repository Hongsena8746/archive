
public class MiniProject01 {
	
	public static void classSort(int[] n) {   //����
		int num = n.length;   //�迭�� n�� ���� ���ؼ� ���� num�� �������ֱ� �迭���� 8��
		
					//i�� ���� ������ġ��
		for(int i=0; i<num -1; i++) {	//-1 ->num -1��������� / �տ����γ� �ϳ��� ������ ���������ؼ�
			int minIndex = i;	//minIdex =i ���� �ּҰ����� �����ؼ�  minIndex�� �����ϱ�
			
			for(int j=i +1; j<num; j++) {	//i ������ġ���� ������ ��ȸ�ϸ鼭 �� �������� �߰ߵǸ�
				if(n[j]< n[minIndex]) {		//minIndex�� �������
					minIndex = j;	//������������ ã��
				}	
			}
			
			 int temp = n[minIndex];	//������ ���� ���� ������
	           n[minIndex] = n[i];		//n[minIndex]�� n[i] ���� ��ȯ
	           n[i] = temp;		//i ��ġ���� ���� ���� ���� ���� �ȴ�
	           
	           System.out.println("Sorted Data " + (i + 1) + "�ܰ�:"); //���° ���Ĵܰ����� ������ֱ�
	            printArray(n);		//����迭���¸� ������ֱ�
		}
	}
	
	public static void printArray(int[]arr) {	//�����迭�� �޾Ƽ� ����ϱ�
		for(int num : arr)  {				//for���� ����ؼ� �迭�ǿ�Ҹ� �ϳ��� ������ ����ϱ�
			System.out.print(num + " ");	//�����ڸ� ����ٿ��� ���ٷ� ����ϱ�
		}
		System.out.println();	//�ٹٲ��ֱ�
	}
			
		
		
	public static void main(String[] args) {     //����MAIN
		int[]InputData = {69,10,30,2,16,8,31,22};  //�������迭 ���� �� �ʱ�ȭ�ϱ� �迭�� 8��
		
		
		 System.out.println("Input Data"); 	//��ǲ�����͸� �������� ��� ��������
		 printArray(InputData);			//print array()�޼��带 ȣ���ؼ� �迭��������ϱ�
		 System.out.println();			//���� ����ϱ�	
		 
		 classSort(InputData);			//class sort(inputData)�� ȣ���ؼ� �迭 ������������ �����ϱ�
		 System.out.println();			//�ٽ� ���� ����ϱ�
	}

}
