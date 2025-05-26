package excer01;

public class Student {
	
	
	String studentName;
	private int koreaScore;
	private int englishScore;
	private int mathScore;

	public Student(int koreaScore, int englishScore, int mathScore) {
		this.koreaScore = koreaScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
	}
	
	
	
	public String getstudentName() {
		return studentName;
	}
	
	
	public int getkoreaScore() {
		return koreaScore;
	}
	
	
	public int getenglishScore() {
		return englishScore;
	}
	
	
	public int getmathScore() {
		return mathScore;
	}
	

	
	public int TotalScore() {
		return koreaScore + englishScore + mathScore;
	}
	
	public double divScore() {
		return TotalScore() / 3.0;
	}

	
	public String setstudentName() {
		return studentName;
	}
	
	
	public int setkoreaScore() {
		return koreaScore;
	}
	
	
	public int setenglishScore() {
		return englishScore;
	}
	
	
	public int setmathScore() {
		return mathScore;
	}


	}

	
	
 

	
	

