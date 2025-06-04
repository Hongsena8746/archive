package ClassDiagram1;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
			//1. ������ �ΰ� �����ϰ�
		Course Software = new Course("Software Engineering");
 		Course Design = new Course("Design Pattern");
 		
 		
 			//2.�л��� 3��  ���
 		Student H1 = new Student("ȫ�浿");
 		Student H2 = new Student("ȫ�漭");
 		Student H3 = new Student("ȫ�泲");
 		
 			//3. ������ ����Ѵ� setter�� ��������
 			// new Transcript �� setGrande ��ҹ��� ����� �ϱ� �׻�.. �̰� ���� ���..
 		Transcript tran1 = new Transcript(H1, Software);
 		tran1.setGrade("A+");
 		
 		Transcript tran2 = new Transcript(H2, Design);
 		tran2.setGrade("C+");
 		
 		Transcript tran3 = new Transcript(H3, Design);
 		tran3.setGrade("A+");
 		
 		// ���� �ΰ� ���
 		System.out.println(Software.getName());
 		System.out.println(Design.getName());
 		System.out.println();
 		
 		// �̸����� ���
 		System.out.println(H1.getName());
 		System.out.println(H2.getName());
 		System.out.println(H3.getName());
 		System.out.println();
 		
 		
 	     printTranscriptInfo(Software.getTranscripts());
         printTranscriptInfo(Design.getTranscripts());
     }

 			
 		
 		public static void printTranscriptInfo(ArrayList<Transcript>list){
 			for(Transcript tran : list ) {
 				System.out.prainln(tran.getStudent().getName()+" "+tran.getCourse().getName()+" "+tran.getGrade())
 			}
 		}
	}

}
