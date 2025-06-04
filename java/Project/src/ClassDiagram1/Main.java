package ClassDiagram1;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
			//1. 과목을 두개 생성하고
		Course Software = new Course("Software Engineering");
 		Course Design = new Course("Design Pattern");
 		
 		
 			//2.학생을 3명  등록
 		Student H1 = new Student("홍길동");
 		Student H2 = new Student("홍길서");
 		Student H3 = new Student("홍길남");
 		
 			//3. 성적을 등록한다 setter로 가져오기
 			// new Transcript 랑 setGrande 대소문자 제대로 하기 항상.. 이거 때매 계속..
 		Transcript tran1 = new Transcript(H1, Software);
 		tran1.setGrade("A+");
 		
 		Transcript tran2 = new Transcript(H2, Design);
 		tran2.setGrade("C+");
 		
 		Transcript tran3 = new Transcript(H3, Design);
 		tran3.setGrade("A+");
 		
 		// 과목 두개 출력
 		System.out.println(Software.getName());
 		System.out.println(Design.getName());
 		System.out.println();
 		
 		// 이름세개 출력
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
