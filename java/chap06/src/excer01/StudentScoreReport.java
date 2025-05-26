package excer01;


public class StudentScoreReport {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student (100,70,80);
		students[1] = new Student (70,80,60);
		students[2] = new Student (80,70,70);
		students[3] = new Student (60,80,80);
		students[4] = new Student (50,60,70);
		students[5] = new Student (70,50,60);
		students[6] = new Student (90,90,50);
		students[7] = new Student (90,80,90);
		students[8] = new Student (80,70,90);
		students[9] = new Student (100,80,90);
		
		
	   
	           System.out.println("####ScorePeport####");
	           System.out.println("국어\t영어\t수학\t|총합\t평균");
	           System.out.println("-----------------------------------");
	           for (int i = 0; i < students.length; i++) {
	    	       	System.out.printf("%d\t%d\t%d\t|%d\t%.2f\n"
	    	    	   ,students[i].getkoreaScore()
	    	    	   ,students[i].getenglishScore()
	    	    	   ,students[i].getmathScore()
	    	    	   ,students[i].TotalScore()
	    	    	   ,students[i].divScore());
	    	    	   
//	    	    	   System.out.println();      위에 \n로 줄바꿈을 할수 있다 
	            }
	        }
	    }
	
		
